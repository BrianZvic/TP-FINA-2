package com.tpfinal2.tpfinal2.services.genero;

import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;

import java.util.ArrayList;

public interface GeneroServices {


    ArrayList<GeneroDto> getAllGeneros(String nombre);
}
