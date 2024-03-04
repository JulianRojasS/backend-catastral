package com.example.catastral.Repositories;

import com.example.catastral.Entities.Extarchivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface extarchivoRepository extends CrudRepository<Extarchivo, Integer> {

}
