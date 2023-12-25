package com.tpfinal2.tpfinal2.boostrap;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import com.tpfinal2.tpfinal2.dominio.*;
import com.tpfinal2.tpfinal2.repository.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@Component
@Data
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private ArtistaRepository artistaRepository;
    private CancionRepository cancionRepository;
    private GeneroRepository generoRepository;
    private ListaReproduccionRepository listaReproduccionRepository;
    private UsuarioRepository usuarioRepository;



    @Override
    public void run(String... args) throws Exception {
        Bd();


    }
    public void Bd() {
            String path = System.getProperty("user.dir");
            String csvFile = path+"/src/main/java/com/tpfinal2/tpfinal2/recurses/generos.csv"; // Cambia esto a la ruta de tu archivo CSV

            try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
                String[] nextLine;
                String line;
                for (String[] strings : reader.readAll()) {
                    Genero data = generoRepository.findByNombre(strings[2]);
                    Artista dataArtista = artistaRepository.findByNombre(strings[0]);
                    Genero genero1 = addGenero("Brian",strings[2]);
                    Cancion cancion1 = addCancion("Brian",strings[1],Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),strings[5]);
                    Artista artista1 = addArtista(strings[0],"Brian");
                    if(!ObjectUtils.isEmpty(data)){
                        cancion1.setGenero(List.of(data));

                    }
                    else {
                        cancion1.setGenero(List.of(genero1));
                        generoRepository.save(genero1);
                    }

                    if(!ObjectUtils.isEmpty(dataArtista)){
                        cancion1.setArtista(List.of(dataArtista));
                        artista1.setCanciones(List.of(cancion1));
                        cancionRepository.save(cancion1);
                    }else{
                        cancion1.setArtista(List.of(artista1));
                        artista1.setCanciones(List.of(cancion1));
                        cancionRepository.save(cancion1);
                        artistaRepository.save(artista1);
                    }

                }
                List<Cancion> cancionList = cancionRepository.findAll();
                Usuario usuario = addUsuario("Brian","Brian_music");
                ListaReproduccion listaReproduccion = addListaReproduccion("La jodoncha",usuario,cancionList);
                listaReproduccion.setUsuario(usuario);
                usuarioRepository.save(usuario);
                listaReproduccionRepository.save(listaReproduccion);
                ListaReproduccion listaReproduccion2 = addListaReproduccion("Regeton",new Usuario(),new ArrayList<>());
                listaReproduccion2.setPrivada(Boolean.FALSE);
                listaReproduccion2.setUsuario(usuario);
                listaReproduccionRepository.save(listaReproduccion2);
                ListaReproduccion listaReproduccion3 = addListaReproduccion("Electronica",new Usuario(),new ArrayList<>());
                listaReproduccion3.setPrivada(Boolean.FALSE);
                listaReproduccion3.setUsuario(usuario);
                listaReproduccionRepository.save(listaReproduccion3);

            } catch (IOException  e) {
                e.printStackTrace();
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }
    }

    private Genero addGenero(String creadoPor,String nombre){
        Genero genero1 = new Genero();
        genero1.setCreadoPor(creadoPor);
        genero1.setId(UUID.randomUUID());
        genero1.setNombre(nombre);
        genero1.setActualizadoEn(LocalDateTime.now());
        genero1.setCreadoEn(LocalDateTime.now());
        return genero1;
    }

    private Artista addArtista(String nombre, String actPor){
        Artista artista1 = new Artista();
        artista1.setId(UUID.randomUUID());
        artista1.setNombre(nombre);
        artista1.setCreadoEn(LocalDateTime.now());
        artista1.setActualizadoPor(actPor);
        return artista1;
    }

    private Cancion addCancion(String creadoPor, String nombre,int duracion, int ranking,String album){
        Cancion cancion1 = new Cancion();
        cancion1.setId(UUID.randomUUID());
        cancion1.setNombre(nombre);
        cancion1.setCreadoEn(LocalDateTime.now());
        cancion1.setCreadoPor(creadoPor);
        cancion1.setDuracion(duracion);
        cancion1.setRanking(ranking);
        cancion1.setAlbum(album);

        return cancion1;
    }



    private ListaReproduccion addListaReproduccion(String nombre,Usuario usuario, List<Cancion> cancionList){
        ListaReproduccion listaReproduccion = new ListaReproduccion();
        listaReproduccion.setCreadoPor(usuario.getNombre());
        listaReproduccion.setNombre(nombre);
        listaReproduccion.setId(UUID.randomUUID());
        listaReproduccion.setPrivada(Boolean.TRUE);
        listaReproduccion.setReproduccionAleatoria(Boolean.FALSE);
        listaReproduccion.setCanciones(cancionList);
        listaReproduccion.setCreadoEn(LocalDateTime.now());
        return listaReproduccion;
    }
    public Usuario addUsuario(String nombre, String nombreUsuario){
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombre);
        usuario.setNombre(nombreUsuario);
        usuario.setId(UUID.randomUUID());
        usuario.setCreadoEn(LocalDateTime.now());
        usuario.setCreadoPor(nombreUsuario);
        return usuario;
    }

}
