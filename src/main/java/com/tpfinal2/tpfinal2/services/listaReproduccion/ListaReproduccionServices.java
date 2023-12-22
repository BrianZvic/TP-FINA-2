package com.tpfinal2.tpfinal2.services.listaReproduccion;

import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionAnyCancionesDto;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;

import java.util.List;

public interface ListaReproduccionServices {



   List<ListaReproduccionAnyCancionesDto> getAllListaReproducionUsuario();
   List<ListaReproduccionDtos> getListaReproduccionByName();
}
