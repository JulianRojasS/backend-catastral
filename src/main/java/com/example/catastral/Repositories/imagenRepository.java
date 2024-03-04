package com.example.catastral.Repositories;

import com.example.catastral.Entities.Imagen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface imagenRepository extends CrudRepository<Imagen, Integer> {

}
