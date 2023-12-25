package com.tpfinal2.tpfinal2.repository;

import com.tpfinal2.tpfinal2.dominio.ListaReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, UUID> {

    List<ListaReproduccion> findByUsuarioId(UUID id);

    @Query(value = "SELECT * FROM LISTA_REPRODUCCION WHERE NOMBRE LIKE :nombre AND IS_PRIVADA = FALSE",nativeQuery = true)
    List<ListaReproduccion> findByNombreAndIspublic(String nombre);

    @Query(value = "SELECT * FROM LISTA_REPRODUCCION WHERE USUARIO_ID = :id",nativeQuery = true)
    List<ListaReproduccion> getAllListaReproducionUsuario(UUID id);


}
