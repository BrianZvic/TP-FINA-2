package com.tpfinal2.tpfinal2.mapper;
import com.tpfinal2.tpfinal2.dominio.Genero;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroOnlyNameDto;

import static com.tpfinal2.tpfinal2.mapper.CancionMapper.mapToCanciones;
import static com.tpfinal2.tpfinal2.mapper.CancionMapper.mapToCancionesDto;

public class GeneroMapper {

    public static Genero mapToGenero(GeneroDto generoDto){
        Genero genero = new Genero();
        genero.setNombre(generoDto.getNombre());
        genero.setCanciones(mapToCanciones(generoDto.getCancionDtos()));
        return genero;
    }

    public static GeneroDto mapToGeneroDto(Genero genero){
        GeneroDto generoDto = new GeneroDto();
        generoDto.setNombre(genero.getNombre());
        generoDto.setCancionDtos(mapToCancionesDto(genero.getCanciones()));
        return generoDto;
    }

    public static GeneroOnlyNameDto mapToGeneroOnlyNameDto(Genero genero){
        GeneroOnlyNameDto generoOnlyNameDto = new GeneroOnlyNameDto();
        generoOnlyNameDto.setNombre(genero.getNombre());
        return generoOnlyNameDto;
    }


}
