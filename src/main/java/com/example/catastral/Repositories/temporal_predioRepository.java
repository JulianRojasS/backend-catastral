package com.example.catastral.Repositories;

import com.example.catastral.Entities.Temporal_predio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface temporal_predioRepository extends CrudRepository<Temporal_predio, Integer> {

}
