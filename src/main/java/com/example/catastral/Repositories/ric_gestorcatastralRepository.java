package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_gestorcatastral;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ric_gestorcatastralRepository extends CrudRepository<Ric_gestorcatastral, Integer> {

}
