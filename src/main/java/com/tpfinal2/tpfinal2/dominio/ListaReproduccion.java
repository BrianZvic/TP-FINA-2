package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class ListaReproduccion extends EntidadBase{
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Lista-Canciones", joinColumns = @JoinColumn(name = "listareproduccionid"), inverseJoinColumns = @JoinColumn(name = "cancionid"))
    private List<Cancion> canciones;

    private boolean repetirFinal;
    private boolean reproduccionAleatoria;
    private boolean isPrivada;
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
}
