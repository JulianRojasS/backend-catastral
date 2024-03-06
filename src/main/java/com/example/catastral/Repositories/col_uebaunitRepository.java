package com.example.catastral.Repositories;

import com.example.catastral.Entities.Col_uebaunit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface col_uebaunitRepository extends CrudRepository<Col_uebaunit, Integer> {
    @Query(value = "select public.ST_AsText(public.ST_Transform(rt.geometria, 4326)) from ric.ric_terreno rt where rt.t_id = :t_id", nativeQuery = true)
    String convertirCoordenadasTerreno(@Param("t_id") Integer t_id);

    @Query(value = "select public.ST_AsText(public.ST_Transform(ru.geometria, 4326)) from ric.ric_unidadconstruccion ru where ru.t_id = :t_id", nativeQuery = true)
    String convertirCoordenadasUnidadConstruccion(@Param("t_id") Integer t_id);

    @Query(value = "select public.ST_AsText(public.ST_Transform(rc.geometria, 4326)) from ric.ric_construccion rc where rc.t_id = :t_id", nativeQuery = true)
    String convertirCoordenadasContruccion(@Param("t_id") Integer t_id);

}
