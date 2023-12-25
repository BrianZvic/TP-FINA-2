package com.tpfinal2.tpfinal2.dto.respuestaDto;

import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RepuestaListaReproduccionDto {
    String statusCode;
    String messajeCode;
    List<ListaReproduccionDtos> data;
}
