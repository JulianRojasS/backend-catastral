package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_construccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ric_construccionRepository extends CrudRepository<Ric_construccion, Integer> {

}
