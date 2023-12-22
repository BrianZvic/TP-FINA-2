package com.tpfinal2.tpfinal2.dto.listareproduccion;

import lombok.Data;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@Data
public class ListaReproduccionAnyCancionesDto{
    private UUID id;
    private String nombre;
    private int cantCanciones;


}
