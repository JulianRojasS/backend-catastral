package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_agrupacioninteresados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ric_agrupacioninteresadosRepository extends CrudRepository<Ric_agrupacioninteresados, Integer> {
    @Query(value = "select  public.uuid_generate_v4();", nativeQuery = true)
    UUID t_ili_tid();
}
