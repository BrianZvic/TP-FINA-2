package com.tpfinal2.tpfinal2.dto.respuestaDto;

import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioRespuestaDto {

    private String statusCode;
    private String stringMessge;
    private UsuarioDto data;
}
