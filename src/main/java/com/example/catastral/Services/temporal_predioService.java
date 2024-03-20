package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_predio;
import com.example.catastral.Repositories.temporal_predioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_predioService {
    private temporal_predioRepository repository;

    public temporal_predioService (temporal_predioRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_predio> todo () {
        return (ArrayList<Temporal_predio>) repository.findAll();
    }

    public Temporal_predio temporal_predio (Integer t_id) {
        return repository.findById(t_id).get();
    }
}