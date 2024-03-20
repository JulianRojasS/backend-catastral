package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_operadorcatastral;
import com.example.catastral.Repositories.temporal_operadorcatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_operadorcatastralService {
    private temporal_operadorcatastralRepository repository;

    public temporal_operadorcatastralService (temporal_operadorcatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_operadorcatastral> todo () {
        return (ArrayList<Temporal_operadorcatastral>) repository.findAll();
    }

    public Temporal_operadorcatastral temporal_operadorcatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}