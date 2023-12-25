package com.tpfinal2.tpfinal2.services.usuario;

import com.tpfinal2.tpfinal2.dto.respuestaDto.UsuarioRespuestaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;

import java.util.UUID;

public interface UsuarioServices {

    UsuarioRespuestaDto getUsuarioById(UUID id);
}
