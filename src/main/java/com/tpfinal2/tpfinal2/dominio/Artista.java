package com.tpfinal2.tpfinal2.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Artista extends EntidadBase{


    @ManyToMany(mappedBy = "artista")
    private List<Cancion> canciones = new ArrayList<>();




}
