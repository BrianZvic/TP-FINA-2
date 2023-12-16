package com.tpfinal2.tpfinal2.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ArtistaDto {
    private String nombre;
    private List<UUID> cancionDtos;
}
