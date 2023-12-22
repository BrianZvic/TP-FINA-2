package com.tpfinal2.tpfinal2.services.respuestaDto;

import com.tpfinal2.tpfinal2.dto.respuestaDto.RespuestaArtistaDto;

import java.util.UUID;

public interface RespuestaDtoServices {

    RespuestaArtistaDto getArtistaRepuesta(UUID id);

}
