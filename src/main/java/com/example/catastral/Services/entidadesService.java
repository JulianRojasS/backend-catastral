package com.example.catastral.Services;

import com.example.catastral.Entities.Entidades;
import com.example.catastral.Repositories.entidadesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class entidadesService {
    private entidadesRepository repository;

    public entidadesService (entidadesRepository repository){
        this.repository = repository;
    }

    public ArrayList<Entidades> todo () {
        return (ArrayList<Entidades>) repository.findAll();
    }

    public Entidades entidades (Integer t_id) {
        return repository.findById(t_id).get();
    }
}