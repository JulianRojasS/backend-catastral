package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_catastrotipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ric_catastrotipoRepository extends CrudRepository<Ric_catastrotipo, Integer> {

}
