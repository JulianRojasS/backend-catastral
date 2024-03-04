package com.example.catastral.Services;

import com.example.catastral.Entities.Ci_forma_presentacion_codigo;
import com.example.catastral.Repositories.ci_forma_presentacion_codigoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ci_forma_presentacion_codigoService {
    private ci_forma_presentacion_codigoRepository repository;

    public ci_forma_presentacion_codigoService (ci_forma_presentacion_codigoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ci_forma_presentacion_codigo> todo () {
        return (ArrayList<Ci_forma_presentacion_codigo>) repository.findAll();
    }

    public Ci_forma_presentacion_codigo ci_forma_presentacion_codigo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}