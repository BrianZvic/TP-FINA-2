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


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    private List<Artista> artista;
    @ManyToMany()
    private List<Genero> genero;

    @Column
    private int duracion;
    @Column
    private String album;

    @Column
    private int ranking;





}
