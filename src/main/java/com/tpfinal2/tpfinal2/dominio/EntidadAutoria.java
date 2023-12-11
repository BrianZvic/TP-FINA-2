package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;

@MappedSuperclass
public class EntidadAutoria {
    private LocalDateTime creadoEn;
    private String creadoPor;
    private String actualizadoPor;
    private LocalDateTime actualizadoEn;


}
