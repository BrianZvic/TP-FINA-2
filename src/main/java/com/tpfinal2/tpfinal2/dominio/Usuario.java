package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends EntidadBase{
    @Column
    private String nombreUsuario;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "usuario", cascade = CascadeType.PERSIST)
    private List<ListaReproduccion> listaReproducciones =new ArrayList<>();
}
