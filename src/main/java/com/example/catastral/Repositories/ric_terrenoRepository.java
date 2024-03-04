package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_terreno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ric_terrenoRepository extends CrudRepository<Ric_terreno, Integer> {

}
