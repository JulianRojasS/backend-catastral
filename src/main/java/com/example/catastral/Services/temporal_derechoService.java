package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_derecho;
import com.example.catastral.Repositories.temporal_derechoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_derechoService {
    private temporal_derechoRepository repository;

    public temporal_derechoService (temporal_derechoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_derecho> todo () {
        return (ArrayList<Temporal_derecho>) repository.findAll();
    }

    public Temporal_derecho temporal_derecho (Integer t_id) {
        return repository.findById(t_id).get();
    }
}