package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dominio.Cancion;
import com.tpfinal2.tpfinal2.dto.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.CancionDto;

import java.util.ArrayList;
import java.util.List;

public class CancionMapper {

    public static Cancion mapToCancion(Cancion cancion, CancionDto cancionDto) {
        cancion.setNombre(cancionDto.getNombre());
        cancion.setRanking(cancionDto.getRanking());
        cancion.setDuracion(cancionDto.getDuracion());
        cancion.setAlbum(cancionDto.getAlbum());
        cancion.setArtista(mapToArtista(cancionDto.getArtistas()));
        return cancion;
    }
    public static CancionDto mapToCancionDto(CancionDto cancionDto,Cancion cancion){
        cancionDto.setNombre(cancion.getNombre());
        cancionDto.setAlbum(cancion.getAlbum());
        cancionDto.setRanking(cancion.getRanking());
        cancionDto.setDuracion(cancion.getDuracion());
        cancionDto.setArtistas(mapToArtitasDto(cancion.getArtista()));
        return cancionDto;
    }
    
    public static List<ArtistaDto> mapToArtitasDto(List<Artista> artistaList){
        List<ArtistaDto> artistaDtos = new ArrayList<>();

        for (Artista artista : artistaList) {
            artistaDtos.add(ArtistaMapper.mapToArtistaDto(artista,new ArtistaDto()));
        }
        
        return artistaDtos;
    }
    
    public static List<Artista> mapToArtista(List<ArtistaDto> artistaDtos){
        
        List<Artista> artistaList = new ArrayList<>();

        for (ArtistaDto artistaDto : artistaDtos) {
            artistaList.add(ArtistaMapper.mapToArtista(new Artista(),artistaDto));
        }
        return artistaList;
    }

    public static List<CancionDto> mapToCancionesDto(List<Cancion> cancions){
        List<CancionDto> cancionDtos = new ArrayList<>();
        for (Cancion cancion : cancions) {
            cancionDtos.add(CancionMapper.mapToCancionDto(new CancionDto(),cancion));
        }

        return cancionDtos;
    }
    public static List<Cancion> mapToCanciones(List<CancionDto> cancionDtos){

        List<Cancion> cancions = new ArrayList<>();
        for (CancionDto cancionDto : cancionDtos) {
            cancions.add(CancionMapper.mapToCancion(new Cancion(),cancionDto));
        }
        return cancions;
    }



}
