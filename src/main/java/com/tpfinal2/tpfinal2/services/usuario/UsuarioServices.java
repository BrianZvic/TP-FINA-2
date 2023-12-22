package com.tpfinal2.tpfinal2.services.usuario;

import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;

import java.util.UUID;

public interface UsuarioServices {

    UsuarioDto getUsuarioById(UUID id);
}
