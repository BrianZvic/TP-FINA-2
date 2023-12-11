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
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "cancion_lista_reproduccion",
            joinColumns = {@JoinColumn(name = "cancion_id")},
            inverseJoinColumns = {@JoinColumn(name = "listareproduccion_id")})
    private List<Cancion> canciones;

    private boolean repetirFinal;
    private boolean reproduccionAleatoria;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
}
