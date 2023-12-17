package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.ListaReproduccionDtos;

public class ListaReproduccionMapper {

    public static ListaReproduccion mapToListaReproduccion(ListaReproduccion listaReproduccion, ListaReproduccionDtos listaReproduccionDtos){

        listaReproduccion.setUsuario(listaReproduccionDtos.getUsuario());
        listaReproduccion.setNombre(listaReproduccion.getNombre());
        return listaReproduccion;
    }

    public static ListaReproduccionDtos mapToListaReproduccionDto(ListaReproduccion listaReproduccion, ListaReproduccionDtos listaReproduccionDtos){
        listaReproduccionDtos.setNombre(listaReproduccion.getNombre());
        listaReproduccionDtos.setUsuario(listaReproduccion.getUsuario());
        return listaReproduccionDtos;
    }
}
