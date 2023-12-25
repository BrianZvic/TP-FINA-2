package com.tpfinal2.tpfinal2.mapper;


import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionUsuarioDto;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class ListaReproduccionUsuario {

    public static ListaReproduccionUsuarioDto mapToListaReproduccionAnyCancionesDto(ListaReproduccion listaReproduccion){
        ListaReproduccionUsuarioDto lracdto = new ListaReproduccionUsuarioDto();
        lracdto.setId(listaReproduccion.getId());
        lracdto.setNombre(listaReproduccion.getNombre());
        lracdto.setCantCanciones(listaReproduccion.getCanciones().size());
        return lracdto;
    }

    public static List<ListaReproduccionUsuarioDto> mapToListReproduccionAnyCancionesDto(List<ListaReproduccion> listaReproduccions){
        ArrayList<ListaReproduccionUsuarioDto> list = new ArrayList<>();
        for (ListaReproduccion listaReproduccion : listaReproduccions) {
            list.add(mapToListaReproduccionAnyCancionesDto(listaReproduccion));
        }
        return list;

    }
}
