package com.example.catastral.Repositories;

import com.example.catastral.Entities.Extdireccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface extdireccionRepository extends CrudRepository<Extdireccion, Integer> {

}
