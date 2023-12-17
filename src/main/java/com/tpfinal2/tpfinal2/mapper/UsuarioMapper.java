package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.Usuario;
import com.tpfinal2.tpfinal2.dto.UsuarioDto;

public class UsuarioMapper {

    public static Usuario mapToUsuario(Usuario usuario, UsuarioDto usuarioDto){
        usuario.setNombreUsuario(usuarioDto.getNombre());
        return usuario;
    }

    public static UsuarioDto mapToUsuarioDto(Usuario usuario, UsuarioDto usuarioDto){
        usuarioDto.setNombre(usuario.getNombre());
        return usuarioDto;
    }
}
