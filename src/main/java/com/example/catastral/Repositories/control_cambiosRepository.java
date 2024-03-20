package com.example.catastral.Repositories;

import com.example.catastral.Entities.Control_cambios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface control_cambiosRepository extends CrudRepository<Control_cambios, Integer> {

}
