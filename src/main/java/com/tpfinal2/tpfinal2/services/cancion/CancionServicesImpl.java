package com.tpfinal2.tpfinal2.services.cancion;

import com.tpfinal2.tpfinal2.dto.canciones.CancionDto;
import com.tpfinal2.tpfinal2.mapper.CancionMapper;
import com.tpfinal2.tpfinal2.repository.CancionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class CancionServicesImpl implements CancionServises{
    CancionRepository cancionRepository;

    @Override
    public List<CancionDto> getAllCanciones(String nombre) {

        if (!ObjectUtils.isEmpty(nombre)){
            return CancionMapper.mapToCancionesDto(cancionRepository.findByNombreLikeIgnoreCaseOrderByRankingDesc(nombre+"%"));
        }
        return CancionMapper.mapToCancionesDto(cancionRepository.findAll());
    }
}
