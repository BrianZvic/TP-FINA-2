package com.tpfinal2.tpfinal2.dto;


import com.tpfinal2.tpfinal2.dominio.Cancion;
import com.tpfinal2.tpfinal2.dominio.Usuario;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ListaReproduccionDtos {
    private String nombre;
    private Usuario usuario;
    private List<CancionDto> cancion;
 }
