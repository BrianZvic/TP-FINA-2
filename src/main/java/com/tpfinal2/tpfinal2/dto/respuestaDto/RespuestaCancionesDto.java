package com.tpfinal2.tpfinal2.dto.respuestaDto;

import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RespuestaCancionesDto {
    private String statusCode;
    private String stringMessge;
    private List<CancionDto> data;
}
