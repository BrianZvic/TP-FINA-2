package com.tpfinal2.tpfinal2.mapper;
import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dto.ArtistaDto;

import java.util.ArrayList;
import java.util.List;


public class ArtistaMapper {

    public static Artista mapToArtista(Artista artista, ArtistaDto artistaDto){
        artista.setNombre(artistaDto.getNombre());
        return artista;
    }

    public static ArtistaDto mapToArtistaDto(Artista artista, ArtistaDto artistaDto){
        artistaDto.setNombre(artista.getNombre());
        //artistaDto.setCancionDtos(CancionMapper.mapToCancionesDto(artista.getCanciones()));
        return artistaDto;
    }
    public static List<ArtistaDto> mapToArtistasDto(List<Artista> artistaList){
        List<ArtistaDto> artistaDtos = new ArrayList<>();
        for (Artista artista : artistaList) {
            artistaDtos.add(mapToArtistaDto(artista,new ArtistaDto()));
        }
        return artistaDtos;
    }


}
