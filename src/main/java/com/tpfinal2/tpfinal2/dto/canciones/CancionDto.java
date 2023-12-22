package com.tpfinal2.tpfinal2.dto.canciones;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import lombok.Data;


@Data
public class CancionDto {

    private String nombre;
    private ArtistaDto artistas;
    private GeneroDto genero;
    private int duracion;
    private String album;
    private int ranking;
}
