package com.tpfinal2.tpfinal2.dto;

import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class UsuarioDto {

    private String nombre;
    private String nombreUsuario;
    private List<ListaReproduccionDtos> listaReproduccion = new ArrayList<>();
}
