package com.example.catastral.Repositories;

import com.example.catastral.Entities.Fraccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fraccionRepository extends CrudRepository<Fraccion, Integer> {

}
