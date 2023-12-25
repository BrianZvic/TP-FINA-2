package com.tpfinal2.tpfinal2.services.listaReproduccion;

import com.tpfinal2.tpfinal2.constantsMessages.ConstanstMessages;
import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionUsuarioDto;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RepuestaListaReproduccionDto;
import com.tpfinal2.tpfinal2.mapper.ListaReproduccionUsuario;
import com.tpfinal2.tpfinal2.mapper.ListaReproduccionMapper;
import com.tpfinal2.tpfinal2.repository.ListaReproduccionRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ListaReproduccionImpl implements ListaReproduccionServices{
    @Autowired
    ListaReproduccionRepository listaReproduccionRepository;

    @Override
    public List<ListaReproduccion> getAllListaReproducionUsuario(UUID id) {

        return listaReproduccionRepository.getAllListaReproducionUsuario(id);
    }

    @Override
    public RepuestaListaReproduccionDto getListaNameAndPublica(String nombre) {
        List<ListaReproduccionDtos> listrepro = ListaReproduccionMapper
                .mapToListaReproduccioListDto(
                        listaReproduccionRepository.findByNombreAndIspublic(nombre+"%")
                );
        if (ObjectUtils.isEmpty(listrepro)){
            return new RepuestaListaReproduccionDto(
                    ConstanstMessages.STATUS_200,
                    ConstanstMessages.MESSAGE_200,
                    new ArrayList<>()
            );
        }else {
            return new RepuestaListaReproduccionDto(
                    ConstanstMessages.STATUS_200,
                    ConstanstMessages.MESSAGE_200,
                    listrepro);
        }

    }
}
