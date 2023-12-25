package com.tpfinal2.tpfinal2.controller.cancion;

import com.tpfinal2.tpfinal2.constantsMessages.ConstanstMessages;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RespuestaCancionesDto;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RespuestaGeneroDto;
import com.tpfinal2.tpfinal2.mapper.CancionMapper;
import com.tpfinal2.tpfinal2.repository.CancionRepository;
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
import java.util.ArrayList;
import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping(path = "api/canciones",produces = {MediaType.APPLICATION_JSON_VALUE})
public class CancionController {

    CancionServises cancionServises;
    GeneroServices generoServices;
    ArtistaServices artistaServices;
    CancionRepository cancionRepository;

    @GetMapping()
    public ResponseEntity<RespuestaCancionesDto> getAllCanciones(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new RespuestaCancionesDto(
                        ConstanstMessages.STATUS_200,
                        ConstanstMessages.MESSAGE_200,
                        cancionServises.getAllCanciones(nombre)
                ));
    }

    @GetMapping(path = "/generos")
    public ResponseEntity<RespuestaGeneroDto> getAllGeneros(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new RespuestaGeneroDto(
                        ConstanstMessages.STATUS_200,
                        ConstanstMessages.MESSAGE_200,
                        generoServices.getAllGeneros(nombre)
                ));
    }

    @GetMapping(path = "/artistas")
    public ResponseEntity<List<ArtistaDto>> getAllArtistas(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(artistaServices.allArtistas(nombre));
    }

    @GetMapping(path = "/album")
    public ResponseEntity<List<CancionDto>> getAllByAlbum(
            @RequestParam(name = "nombre", defaultValue = "") String nombre
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CancionMapper.mapToCancionesDto(cancionRepository.findByAlbumLikeIgnoreCaseOrderByAlbumDesc(nombre+"%")));
    }


}
