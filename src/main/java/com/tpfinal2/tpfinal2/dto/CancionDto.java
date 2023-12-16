package com.tpfinal2.tpfinal2.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CancionDto {

    private String nombre;
    private List<UUID> artistaDtos;
    private List<UUID> cancionDtos;
    private int duracion;
    private String album;
    private int ranking;
}
