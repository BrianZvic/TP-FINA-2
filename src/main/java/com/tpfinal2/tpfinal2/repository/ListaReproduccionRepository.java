package com.tpfinal2.tpfinal2.repository;

import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, UUID> {

    List<ListaReproduccion> findByUsuarioId(UUID id);
}
