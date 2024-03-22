package com.example.catastral.Repositories;

import com.example.catastral.Entities.Col_miembros;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface col_miembrosRepository extends CrudRepository<Col_miembros, Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO col_miembros (interesado_ric_interesado, interesado_ric_agrupacioninteresados, agrupacion, participacion) values (:interesado, null, :agrupacion, :participacion)", nativeQuery = true)
    Integer insertar (@Param("interesado") Integer interesado, @Param("agrupacion") Integer agrupacion, @Param("participacion") Float participacion);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM col_miembros WHERE t_id = :t_id", nativeQuery = true)
    Integer eliminar (@Param("t_id") Integer t_id);
}
