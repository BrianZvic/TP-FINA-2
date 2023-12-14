package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Genero extends EntidadBase{

    @ManyToMany(mappedBy = "generos")
    /*@JoinTable(
            name = "cancion_genero", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "genero_id"),
            inverseJoinColumns = @JoinColumn(name = "cancion_id")
    )*/
    private List<Cancion> canciones;


}
