package com.tpfinal2.tpfinal2.services.usuario;

import com.tpfinal2.tpfinal2.dominio.Usuario;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.mapper.UsuarioMapper;
import com.tpfinal2.tpfinal2.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioServicesImpl implements UsuarioServices{

    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDto getUsuarioById(UUID id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.map(value -> UsuarioMapper.mapToUsuarioDto(value, new UsuarioDto())).orElseGet(UsuarioDto::new);

    }
}
