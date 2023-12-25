package com.tpfinal2.tpfinal2.controller.artista;



import com.tpfinal2.tpfinal2.controller.cancion.CancionController;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RespuestaArtistaDto;
import com.tpfinal2.tpfinal2.mapper.ArtistaMapper;
import com.tpfinal2.tpfinal2.services.artista.ArtistaServices;
import com.tpfinal2.tpfinal2.services.respuestaDto.RespuestaDtoServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
@RequestMapping(path = "api/artistas",produces = {MediaType.APPLICATION_JSON_VALUE})
public class ArtistaController {
    @Autowired
    ArtistaServices artistaService;


    @GetMapping()
    public ResponseEntity<List<ArtistaDto>> getArtistaWithName(
            @RequestParam(name = "nombre",defaultValue = "") String nombre
    ){
        return ResponseEntity.
                status(HttpStatus.OK).
                body(artistaService.allArtistas(nombre));
    }

    @GetMapping(path = "/id")
    public ResponseEntity<ArtistaDto> getArtistaById(
            @RequestParam(name = "id",defaultValue = "")UUID id
            ) {
        return ResponseEntity.status(HttpStatus.OK).body(artistaService.getArtistaById(id));
    }


}
