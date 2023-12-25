package com.tpfinal2.tpfinal2.repository;

import com.tpfinal2.tpfinal2.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, UUID> {

    List<Cancion> findByNombreLikeIgnoreCaseOrderByRankingDesc(String nombre);
    List<Cancion> findByAlbumLikeIgnoreCaseOrderByAlbumDesc(String nombre);
}
