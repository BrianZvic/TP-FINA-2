package com.tpfinal2.tpfinal2.services.listaReproduccion;
import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import com.tpfinal2.tpfinal2.dto.listareproduccion.ListaReproduccionDtos;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RepuestaListaReproduccionDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ListaReproduccionServices {



   List<ListaReproduccion> getAllListaReproducionUsuario(UUID id);
   RepuestaListaReproduccionDto getListaNameAndPublica(String nombre);


}
