package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_predio_informalidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ric_predio_informalidadRepository extends CrudRepository<Ric_predio_informalidad, Integer> {

}
