package com.tpfinal2.tpfinal2.mapper;

import com.tpfinal2.tpfinal2.dominio.Usuario;
import com.tpfinal2.tpfinal2.dto.respuestaDto.UsuarioRespuestaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioOnlyUserNameDto;
import com.tpfinal2.tpfinal2.services.listaReproduccion.ListaReproduccionImpl;
import com.tpfinal2.tpfinal2.services.listaReproduccion.ListaReproduccionServices;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class UsuarioMapper {
    @Autowired
    public static ListaReproduccionServices listaReproduccionServices;

    public static Usuario mapToUsuario(Usuario usuario, UsuarioDto usuarioDto){

        usuario.setNombreUsuario(usuarioDto.getNombreUsuario());
        usuario.setNombre(usuarioDto.getNombre());
        //usuario.setListaReproducciones(ListaReproduccionMapper.mapToListaReproduccionList(usuarioDto.getListaReproduccion()));

        return usuario;
    }

    public static UsuarioDto mapToUsuarioDto(Usuario usuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNombre(usuario.getNombre());
        usuarioDto.setNombreUsuario(usuario.getNombreUsuario());
        usuarioDto.setListaReproduccion(ListaReproduccionMapper
                .mapToListaReproduccioListDto(listaReproduccionServices
                        .getAllListaReproducionUsuario(usuario.getId())));

        return usuarioDto;
    }

    public static List<Usuario> mapToUsuarioList(List<UsuarioDto> usuarioList,Usuario usuario){
        List<Usuario> usuarioList1 = new ArrayList<>();
        for (UsuarioDto usuarioDto : usuarioList) {
            usuarioList1.add(mapToUsuario(usuario,new UsuarioDto()));
        }

        return usuarioList1;
    }

    public static List<UsuarioDto> mapToUsuarioListDto(List<Usuario> usuarios, UsuarioDto usuarioDto) {
        List<UsuarioDto> usuarioDtoList = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuarioDtoList.add(mapToUsuarioDto(usuario));
        }
        return usuarioDtoList;
    }

    public static UsuarioOnlyUserNameDto mapToUsuarioOnlyUserNameDto(Usuario usuario){
        UsuarioOnlyUserNameDto user = new UsuarioOnlyUserNameDto();
        user.setNombreUsuario(usuario.getNombreUsuario());
        return user;
    }




}
