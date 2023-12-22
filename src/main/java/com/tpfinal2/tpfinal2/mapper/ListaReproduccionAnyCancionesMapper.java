package com.tpfinal2.tpfinal2.mapper;


import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionAnyCancionesDto;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class ListaReproduccionAnyCancionesMapper {

    public static ListaReproduccionAnyCancionesDto mapToListaReproduccionAnyCancionesDto(ListaReproduccion listaReproduccion, ListaReproduccionAnyCancionesDto lracdto){

        lracdto.setId(listaReproduccion.getId());
        lracdto.setNombre(listaReproduccion.getNombre());
        lracdto.setCantCanciones(listaReproduccion.getCanciones().size());
        return lracdto;
    }

    public static List<ListaReproduccionAnyCancionesDto> mapToListReproduccionAnyCancionesDto(List<ListaReproduccion> listaReproduccions){
        ArrayList<ListaReproduccionAnyCancionesDto> list = new ArrayList<>();
        for (ListaReproduccion listaReproduccion : listaReproduccions) {
            list.add(mapToListaReproduccionAnyCancionesDto(listaReproduccion,new ListaReproduccionAnyCancionesDto()));
        }
        return list;

    }
}
