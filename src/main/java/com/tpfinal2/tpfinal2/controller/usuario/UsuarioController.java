package com.tpfinal2.tpfinal2.controller.usuario;


import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.repository.UsuarioRepository;
import com.tpfinal2.tpfinal2.services.listaReproduccion.ListaReproduccionServices;
import com.tpfinal2.tpfinal2.services.usuario.UsuarioServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping(path = "api/usuarios",produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class UsuarioController {
    UsuarioServices usuarioServices;
    UsuarioRepository usuarioRepository;
    ListaReproduccionServices listaReproduccionServices;


    @GetMapping()
    public ResponseEntity<UsuarioDto> getUsuarioById(
            @RequestParam(name = "id",defaultValue = "")UUID id
            ){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioServices.getUsuarioById(id));
    }





}
