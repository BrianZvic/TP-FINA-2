package com.tpfinal2.tpfinal2.dto;

import com.tpfinal2.tpfinal2.dominio.Cancion;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class GeneroDto {
    String nombre;
    List<UUID> cancionDtos;

}
