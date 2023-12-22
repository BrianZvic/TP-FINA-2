package com.tpfinal2.tpfinal2.controller.cancion;

import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.services.artista.ArtistaServices;
import com.tpfinal2.tpfinal2.services.cancion.CancionServises;
import com.tpfinal2.tpfinal2.services.genero.GeneroServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping(path = "api/canciones",produces = {MediaType.APPLICATION_JSON_VALUE})
public class CancionController {

    CancionServises cancionServises;
    GeneroServices generoServices;
    ArtistaServices artistaServices;

    @GetMapping()
    public ResponseEntity<List<CancionDto>> getAllCanciones(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity.status(HttpStatus.OK).body(cancionServises.getAllCanciones(nombre));
    }

    @GetMapping(path = "/generos")
    public ResponseEntity<ArrayList<GeneroDto>> getAllGeneros(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(generoServices.getAllGeneros(nombre));
    }

    @GetMapping(path = "/artistas")
    public ResponseEntity<List<ArtistaDto>> getAllArtistas(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(artistaServices.allArtistas(nombre));
    }


}
