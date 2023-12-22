package com.tpfinal2.tpfinal2.services.cancion;

import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;

import java.util.List;

public interface CancionServises {

    List<CancionDto> getAllCanciones(String nombre);
}
