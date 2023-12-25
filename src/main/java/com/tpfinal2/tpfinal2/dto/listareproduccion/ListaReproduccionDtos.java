package com.tpfinal2.tpfinal2.dto.listareproduccion;


import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioOnlyUserNameDto;
import lombok.Data;

import java.util.List;

@Data
public class ListaReproduccionDtos {

    private String nombre;
    private UsuarioOnlyUserNameDto usuario;
    private List<CancionDto> cancion;
    private boolean repetirFinal;
    private boolean reproduccionAleatoria;
    private boolean isPrivada;
 }
