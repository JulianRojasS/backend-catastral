package com.example.catastral.Repositories;

import com.example.catastral.Entities.Entidades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface entidadesRepository extends CrudRepository<Entidades, Integer> {

}
