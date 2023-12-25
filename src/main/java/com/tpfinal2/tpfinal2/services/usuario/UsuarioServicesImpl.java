package com.tpfinal2.tpfinal2.services.usuario;

import com.tpfinal2.tpfinal2.constantsMessages.ConstanstMessages;
import com.tpfinal2.tpfinal2.dominio.Usuario;
import com.tpfinal2.tpfinal2.dto.respuestaDto.UsuarioRespuestaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.mapper.UsuarioMapper;
import com.tpfinal2.tpfinal2.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioServicesImpl implements UsuarioServices{

    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioRespuestaDto getUsuarioById(UUID id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(new Usuario());
        if (ObjectUtils.isEmpty(id) || ObjectUtils.isEmpty(usuario)){
            return new UsuarioRespuestaDto(
                    ConstanstMessages.STATUS_400,
                    ConstanstMessages.MESSAGE_400,
                    null);
        }else {
            UsuarioDto user = UsuarioMapper.mapToUsuarioDto(usuario);
            return new UsuarioRespuestaDto(
                    ConstanstMessages.STATUS_200,
                    ConstanstMessages.MESSAGE_200,
                    user);
        }


    }
}
