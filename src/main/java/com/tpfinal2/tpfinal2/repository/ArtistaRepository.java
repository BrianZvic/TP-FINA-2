package com.tpfinal2.tpfinal2.repository;

import com.tpfinal2.tpfinal2.dominio.Artista;
import com.tpfinal2.tpfinal2.dominio.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, UUID> {
    Artista findAllById(UUID idArtista);
    List<Artista> findByNombreLikeIgnoreCase(String nombre);
    Artista findByNombre(String nombre);
}
