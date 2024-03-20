package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_derechotipo;
import com.example.catastral.Repositories.temporal_derechotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_derechotipoService {
    private temporal_derechotipoRepository repository;

    public temporal_derechotipoService (temporal_derechotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_derechotipo> todo () {
        return (ArrayList<Temporal_derechotipo>) repository.findAll();
    }

    public Temporal_derechotipo temporal_derechotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}