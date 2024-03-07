package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_interesados;
import com.example.catastral.Repositories.temporal_interesadosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_interesadosService {
    private temporal_interesadosRepository repository;

    public temporal_interesadosService (temporal_interesadosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_interesados> todo () {
        return (ArrayList<Temporal_interesados>) repository.findAll();
    }

    public Temporal_interesados temporal_interesados (Integer t_id) {
        return repository.findById(t_id).get();
    }
}