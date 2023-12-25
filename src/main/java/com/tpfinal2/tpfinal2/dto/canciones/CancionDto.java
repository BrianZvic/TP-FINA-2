package com.tpfinal2.tpfinal2.dto.canciones;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaNameDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroOnlyNameDto;
import lombok.Data;


@Data
public class CancionDto {

    private String nombre;
    private ArtistaNameDto artista;
    private GeneroOnlyNameDto genero;
    private int duracion;
    private String album;
    private int ranking;
}
