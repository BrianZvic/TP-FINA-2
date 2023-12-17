package com.tpfinal2.tpfinal2.mapper;
import com.tpfinal2.tpfinal2.dominio.Genero;
import com.tpfinal2.tpfinal2.dto.GeneroDto;
import static com.tpfinal2.tpfinal2.mapper.CancionMapper.mapToCanciones;
import static com.tpfinal2.tpfinal2.mapper.CancionMapper.mapToCancionesDto;

public class GeneroMapper {

    public static Genero mapToGenero(Genero genero, GeneroDto generoDto){
        genero.setNombre(generoDto.getNombre());
        genero.setCanciones(mapToCanciones(generoDto.getCancionDtos()));
        return genero;
    }

    public static GeneroDto mapToGeneroDto(Genero genero, GeneroDto generoDto){
        generoDto.setNombre(genero.getNombre());
        generoDto.setCancionDtos(mapToCancionesDto(genero.getCanciones()));
        return generoDto;
    }


}
