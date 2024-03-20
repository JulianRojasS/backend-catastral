package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_derecho;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

@Repository
public interface ric_derechoRepository extends CrudRepository<Ric_derecho, Integer> {
    @Modifying
    @Transactional
    @Query(value = "update ric_derecho set tipo = :tipo, fraccion_derecho = :fraccion, fecha_inicio_tenencia = :fit, descripcion = :descipcion ,interesado_ric_interesado = :interesado, interesado_ric_agrupacioninteresados = :agrupacion where t_id = :derecho", nativeQuery = true)
    Integer actualizarDerecho (@Param("tipo") Integer tipo, @Param("fraccion") Float fraccion, @Param("fit") Date fit, @Param("descipcion") String descripcion, @Param("interesado") Integer interesado, @Param("agrupacion") Integer agrupacion, @Param("derecho") Integer derecho);
}
