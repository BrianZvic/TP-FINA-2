package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dominio.Cancion;
import com.tpfinal2.tpfinal2.dominio.Genero;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroOnlyNameDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;

import java.util.ArrayList;
import java.util.List;

public class CancionMapper {

    public static Cancion mapToCancion(CancionDto cancionDto) {
        Cancion cancion = new Cancion();
        cancion.setNombre(cancionDto.getNombre());
        cancion.setRanking(cancionDto.getRanking());
        cancion.setDuracion(cancionDto.getDuracion());
        cancion.setAlbum(cancionDto.getAlbum());
        //cancion.setArtista(mapToArtista(cancionDto.getArtistas()));
        return cancion;
    }
    public static CancionDto mapToCancionDto(Cancion cancion){
        CancionDto cancionDto = new CancionDto();
        cancionDto.setNombre(cancion.getNombre());
        cancionDto.setAlbum(cancion.getAlbum());
        cancionDto.setRanking(cancion.getRanking());
        cancionDto.setDuracion(cancion.getDuracion());
        cancionDto.setArtista(ArtistaMapper.mapToArtistaNameDto(cancion.getArtista().get(0)));
        cancionDto.setGenero(GeneroMapper.mapToGeneroOnlyNameDto(cancion.getGenero().get(0)));
        return cancionDto;
    }
    
    public static List<ArtistaDto> mapToArtitasDto(List<Artista> artistaList){
        List<ArtistaDto> artistaDtos = new ArrayList<>();

        for (Artista artista : artistaList) {
            artistaDtos.add(ArtistaMapper.mapToArtistaDto(artista));
        }
        
        return artistaDtos;
    }
    
    public static List<Artista> mapToArtista(List<ArtistaDto> artistaDtos){
        
        List<Artista> artistaList = new ArrayList<>();

        for (ArtistaDto artistaDto : artistaDtos) {
            artistaList.add(ArtistaMapper.mapToArtista(artistaDto));
        }
        return artistaList;
    }

    public static List<CancionDto> mapToCancionesDto(List<Cancion> cancions){
        List<CancionDto> cancionDtos = new ArrayList<>();
        for (Cancion cancion : cancions) {
            cancionDtos.add(CancionMapper.mapToCancionDto(cancion));
        }

        return cancionDtos;
    }
    public static List<Cancion> mapToCanciones(List<CancionDto> cancionDtos){

        List<Cancion> cancions = new ArrayList<>();
        for (CancionDto cancionDto : cancionDtos) {
            cancions.add(CancionMapper.mapToCancion(cancionDto));
        }
        return cancions;
    }

    public static List<String> mapToCancionesName(List<Cancion> cancions){
        List<String> canionesName = new ArrayList<>();
        for (Cancion cancion : cancions) {
            canionesName.add(cancion.getNombre());
        }
        return canionesName;
    }




}
