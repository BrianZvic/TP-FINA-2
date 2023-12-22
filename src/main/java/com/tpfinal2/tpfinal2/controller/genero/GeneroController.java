package com.tpfinal2.tpfinal2.controller.genero;

import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.services.genero.GeneroServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;


@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/generos",produces = {MediaType.APPLICATION_JSON_VALUE})
public class GeneroController {
    private final GeneroServices generoServices;
    @GetMapping
    @ResponseBody
    public ResponseEntity<ArrayList<GeneroDto>> getAllGeneros(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(generoServices.getAllGeneros(nombre));
    }
}
