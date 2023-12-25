package com.tpfinal2.tpfinal2.controller.listareproduccion;


import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionUsuarioDto;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RepuestaListaReproduccionDto;
import com.tpfinal2.tpfinal2.mapper.ListaReproduccionMapper;
import com.tpfinal2.tpfinal2.repository.ListaReproduccionRepository;
import com.tpfinal2.tpfinal2.services.listaReproduccion.ListaReproduccionServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "api/lista-reproduccion", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ListReproduccionController {
    ListaReproduccionServices listaReproduccionServices;

    @GetMapping()
    public ResponseEntity<RepuestaListaReproduccionDto> getListaNameAndPublica(
            @RequestParam(name = "nombre",defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(listaReproduccionServices.getListaNameAndPublica(nombre));
    }

}
