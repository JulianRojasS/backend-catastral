package com.example.catastral.Services;

import com.example.catastral.Entities.Fraccion;
import com.example.catastral.Repositories.fraccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class fraccionService {
    private fraccionRepository repository;

    public fraccionService (fraccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Fraccion> todo () {
        return (ArrayList<Fraccion>) repository.findAll();
    }

    public Fraccion fraccion (Integer t_id) {
        return repository.findById(t_id).get();
    }
}