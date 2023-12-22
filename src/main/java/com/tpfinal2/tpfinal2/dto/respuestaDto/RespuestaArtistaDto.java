package com.tpfinal2.tpfinal2.dto.respuestaDto;

import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RespuestaArtistaDto {

    String statusCode;
    String messajeCode;
    ArtistaDto artista;
}
