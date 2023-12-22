package com.tpfinal2.tpfinal2.services.respuestaDto;


import com.tpfinal2.tpfinal2.constantsMessages.ConstanstMessages;
import com.tpfinal2.tpfinal2.dto.artyista.ArtistaDto;
import com.tpfinal2.tpfinal2.dto.respuestaDto.RespuestaArtistaDto;
import com.tpfinal2.tpfinal2.services.artista.ArtistaServices;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.UUID;

@Service
@Data
public class RespuestaDtoServicesImpl implements RespuestaDtoServices{

    ArtistaServices artistaServices;

    @Override
    public RespuestaArtistaDto getArtistaRepuesta(UUID id) {
        ArtistaDto artistaDto = artistaServices.getArtistaById(id);
        if (!ObjectUtils.isEmpty(artistaDto)){
            return new RespuestaArtistaDto(ConstanstMessages.MESSAGE_200,ConstanstMessages.STATUS_200,artistaDto);
        }else {
            return new RespuestaArtistaDto(ConstanstMessages.STATUS_200,ConstanstMessages.NO_SE_HA_OBTENIDO_RESULTADOS,new ArtistaDto());
        }
    }
}
