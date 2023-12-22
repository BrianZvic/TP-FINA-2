package com.tpfinal2.tpfinal2.services.artista;

import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.usuario.UsuarioDto;

import java.util.List;
import java.util.UUID;

public interface ArtistaServices {

    List<ArtistaDto> allArtistas(String nombre);
    ArtistaDto getArtistaById(UUID idArtista);

    List<ArtistaDto> getAllArtistaStartingWith(String name);
}
