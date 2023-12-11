package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Cancion extends EntidadBase{


    @ManyToMany(mappedBy = "canciones")
    private List<Artista> artista;
    @ManyToMany(mappedBy = "canciones")
    private List<Genero> generos;

    @Column
    private int duracion;
    @Column
    private String album;



}
