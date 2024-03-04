package com.example.catastral.Repositories;

import com.example.catastral.Entities.Extinteresado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface extinteresadoRepository extends CrudRepository<Extinteresado, Integer> {

}
