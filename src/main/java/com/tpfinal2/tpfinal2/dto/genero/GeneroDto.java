package com.tpfinal2.tpfinal2.dto;

import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import lombok.Data;

import java.util.List;

@Data
public class GeneroDto {
    String nombre;
    List<CancionDto> cancionDtos;

}
