package com.tpfinal2.tpfinal2.mapper;


import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dto.ArtistaDtoWithCanciones;

public class ArtistaWithCancionesMapper {

    public static ArtistaDtoWithCanciones mapToArtistaWithCancionesDto(Artista artista, ArtistaDtoWithCanciones artistaDtoWithCanciones){
        artistaDtoWithCanciones.setNombre(artista.getNombre());
        artistaDtoWithCanciones.setCanciones(CancionMapper.mapToCancionesDto(artista.getCanciones()));
        return  artistaDtoWithCanciones;
    }

    public static Artista mapToArtistaWithCanciones(Artista artista, ArtistaDtoWithCanciones artistaDtoWithCanciones){
        artista.setNombre(artistaDtoWithCanciones.getNombre());
        artista.setCanciones(CancionMapper.mapToCanciones(artistaDtoWithCanciones.getCanciones()));
        return artista;
    }
}
