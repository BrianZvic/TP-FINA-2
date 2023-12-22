package com.tpfinal2.tpfinal2.controller.listareproduccion;


import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionAnyCancionesDto;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import com.tpfinal2.tpfinal2.repository.ListaReproduccionRepository;
import com.tpfinal2.tpfinal2.services.listaReproduccion.ListaReproduccionServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/listareproduccion", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ListReproduccionController {
    ListaReproduccionServices listaReproduccionServices;
    ListaReproduccionRepository listaReproduccionRepository;

    /*
    @GetMapping()
    public ResponseEntity<List<ListaReproduccionAnyCancionesDto>> getAllListaRepodruccion(){
        return ResponseEntity.status(HttpStatus.OK).body(listaReproduccionServices.getAllListaReproducionUsuario());
    }

     */

    @GetMapping()
    public ResponseEntity<List<ListaReproduccionDtos>> getListReproduccionByName(){


        return ResponseEntity.status(HttpStatus.OK).body(listaReproduccionServices.getListaReproduccionByName());
    }
}
