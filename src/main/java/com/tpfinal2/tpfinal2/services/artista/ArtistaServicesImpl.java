package com.tpfinal2.tpfinal2.services.artista;

import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.mapper.ArtistaMapper;
import com.tpfinal2.tpfinal2.repository.ArtistaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Data
public class ArtistaServicesImpl implements ArtistaServices{

    ArtistaRepository artistaRepository;

    @Override
    public List<ArtistaDto> allArtistas(String nombre) {
        List<Artista> artistaList;
        List<ArtistaDto> artistaDtos = new ArrayList<>();
        if(!ObjectUtils.isEmpty(nombre)){
            artistaDtos = getAllArtistaStartingWith(nombre);
        }else {
            artistaList = artistaRepository.findAll();
            for (Artista artista : artistaList) {
                artistaDtos.add(ArtistaMapper.mapToArtistaDto(artista));
            }
        }


        return artistaDtos;
    }

    @Override
    public ArtistaDto getArtistaById(UUID idArtista) {
        Artista artista = artistaRepository.findById(idArtista).orElseThrow(()-> new RuntimeException("valor"));
        return ArtistaMapper.mapToArtistaDto(artista);

    }

    @Override
    public List<ArtistaDto> getAllArtistaStartingWith(String name) {
        List<Artista> artistaList = artistaRepository.findByNombreLikeIgnoreCase(name+"%");
        return ArtistaMapper.mapToArtistasDto(artistaList);
    }
}
