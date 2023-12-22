package com.tpfinal2.tpfinal2.services.genero;

import com.tpfinal2.tpfinal2.dominio.Genero;
import com.tpfinal2.tpfinal2.dto.genero.GeneroDto;
import com.tpfinal2.tpfinal2.mapper.GeneroMapper;
import com.tpfinal2.tpfinal2.repository.GeneroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GeneroServicesImpl implements GeneroServices {

    GeneroRepository generoRepository;

    @Override
    public ArrayList<GeneroDto> getAllGeneros(String nombre) {
        List<Genero> generoLit = new ArrayList<>();
        ArrayList<GeneroDto> generoDto = new ArrayList<>();
        if(!ObjectUtils.isEmpty(nombre)){
            generoLit = generoRepository.findByNombreLikeIgnoreCase(nombre+"%");

        }else {
            generoLit = generoRepository.findAll();
        }

        for (Genero genero : generoLit) {
            generoDto.add(GeneroMapper.mapToGeneroDto(genero,new GeneroDto()));
        }

        return generoDto;
    }
}
