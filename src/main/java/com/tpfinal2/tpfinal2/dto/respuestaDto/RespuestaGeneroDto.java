package com.tpfinal2.tpfinal2.dto.respuestaDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RespuestaGeneroDto {
    private String statusCode;
    private String stringMessge;
    private List<GeneroDto> data;
}
