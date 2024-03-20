package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_forma_presentacion_codigo;
import com.example.catastral.Repositories.temporal_forma_presentacion_codigoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_forma_presentacion_codigoService {
    private temporal_forma_presentacion_codigoRepository repository;

    public temporal_forma_presentacion_codigoService (temporal_forma_presentacion_codigoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_forma_presentacion_codigo> todo () {
        return (ArrayList<Temporal_forma_presentacion_codigo>) repository.findAll();
    }

    public Temporal_forma_presentacion_codigo temporal_forma_presentacion_codigo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}