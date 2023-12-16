package com.tpfinal2.tpfinal2.dto;


import com.tpfinal2.tpfinal2.dominio.Usuario;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ListaReproduccionDto {
    private String nombre;
    private Usuario usuario;
    private List<UUID> cancionDtos;
 }
