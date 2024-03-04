package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_unidadconstrucciontipo;
import com.example.catastral.Repositories.ric_unidadconstrucciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_unidadconstrucciontipoService {
    private ric_unidadconstrucciontipoRepository repository;

    public ric_unidadconstrucciontipoService (ric_unidadconstrucciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_unidadconstrucciontipo> todo () {
        return (ArrayList<Ric_unidadconstrucciontipo>) repository.findAll();
    }

    public Ric_unidadconstrucciontipo ric_unidadconstrucciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}