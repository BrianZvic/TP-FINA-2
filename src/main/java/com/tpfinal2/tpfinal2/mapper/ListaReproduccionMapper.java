package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.Cancion;
import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccionMapper {

    public static ListaReproduccion mapToListaReproduccion(ListaReproduccion listaReproduccion, ListaReproduccionDtos listaReproduccionDtos) {
        //listaReproduccion.setUsuario(listaReproduccionDtos.getUsuario());
        listaReproduccion.setNombre(listaReproduccion.getNombre());
        //listaReproduccion.setCanciones(CancionMapper.mapToCanciones(listaReproduccionDtos.getCancion()));
        return listaReproduccion;
    }

    public static ListaReproduccionDtos mapToListaReproduccionDto(ListaReproduccion listaReproduccion) {
        ListaReproduccionDtos listaReproduccionDtos = new ListaReproduccionDtos();
        listaReproduccionDtos.setNombre(listaReproduccion.getNombre());
        listaReproduccionDtos.setUsuario(UsuarioMapper.mapToUsuarioOnlyUserNameDto(listaReproduccion.getUsuario()));
        listaReproduccionDtos.setCancion(CancionMapper.mapToCancionesDto(listaReproduccion.getCanciones()));
        listaReproduccionDtos.setPrivada(listaReproduccion.isPrivada());

        return listaReproduccionDtos;
    }

    public static List<ListaReproduccionDtos> mapToListaReproduccioListDto(List<ListaReproduccion> listaReproduccion) {
        List<ListaReproduccionDtos> listaReproduccionList = new ArrayList<>();
        for (ListaReproduccion reproduccion : listaReproduccion) {
            listaReproduccionList.add(mapToListaReproduccionDto(reproduccion));
        }
        return listaReproduccionList;
    }

    public static List<ListaReproduccion> mapToListaReproduccionList(List<ListaReproduccionDtos> listaReproduccionDtos) {
        List<ListaReproduccion> listaReproduccions = new ArrayList<>();
        for (ListaReproduccionDtos listaReproduccionDto : listaReproduccionDtos) {
            listaReproduccions.add(mapToListaReproduccion(new ListaReproduccion(), listaReproduccionDto));
        }

        return listaReproduccions;
    }



}