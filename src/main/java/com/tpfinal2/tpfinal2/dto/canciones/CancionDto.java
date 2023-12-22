package com.tpfinal2.tpfinal2.dto;
import com.tpfinal2.tpfinal2.dominio.Genero;
import lombok.Data;
import java.util.List;


@Data
public class CancionDto {

    private String nombre;
    private List<ArtistaDto> artistas;
    private GeneroDto genero;
    private int duracion;
    private String album;
    private int ranking;
}
