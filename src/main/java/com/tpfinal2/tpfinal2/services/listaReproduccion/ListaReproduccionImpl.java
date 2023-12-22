package com.tpfinal2.tpfinal2.services.listaReproduccion;

import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionAnyCancionesDto;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import com.tpfinal2.tpfinal2.mapper.ListaReproduccionAnyCancionesMapper;
import com.tpfinal2.tpfinal2.mapper.ListaReproduccionMapper;
import com.tpfinal2.tpfinal2.repository.ListaReproduccionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListaReproduccionImpl implements ListaReproduccionServices{
    ListaReproduccionRepository listaReproduccionRepository;

    @Override
    public List<ListaReproduccionAnyCancionesDto> getAllListaReproducionUsuario() {
        return ListaReproduccionAnyCancionesMapper.mapToListReproduccionAnyCancionesDto(listaReproduccionRepository.findAll());
    }

    @Override
    public List<ListaReproduccionDtos> getListaReproduccionByName() {
        return ListaReproduccionMapper.mapToListaReproduccioListDto(listaReproduccionRepository.findAll());
    }
}
