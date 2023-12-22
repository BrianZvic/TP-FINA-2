package com.tpfinal2.tpfinal2.repository;

import com.tpfinal2.tpfinal2.dominio.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID> {

    Genero findByNombre(String nombre);
    List<Genero> findByNombreLikeIgnoreCase(String string);
}
