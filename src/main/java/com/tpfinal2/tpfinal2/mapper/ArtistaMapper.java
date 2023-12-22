package com.tpfinal2.tpfinal2.mapper;
import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;

import java.util.ArrayList;
import java.util.List;


public class ArtistaMapper {

    public static Artista mapToArtista(ArtistaDto artistaDto){
        Artista artista = new Artista();
        artista.setNombre(artistaDto.getNombre());
        //artista.setCanciones(CancionMapper.mapToCanciones(artistaDto.getCanciones()));
        return artista;
    }

    public static ArtistaDto mapToArtistaDto(Artista artista){
        ArtistaDto artistaDto = new ArtistaDto();
        artistaDto.setNombre(artista.getNombre());
        //artistaDto.setCanciones(CancionMapper.mapToCancionesDto(artista.getCanciones()));
        return artistaDto;
    }

    public static List<ArtistaDto> mapToArtistasDto(List<Artista> artistaList){
        List<ArtistaDto> artistaDtos = new ArrayList<>();
        for (Artista artista : artistaList) {
            artistaDtos.add(mapToArtistaDto(artista));
        }
        return artistaDtos;
    }


}
