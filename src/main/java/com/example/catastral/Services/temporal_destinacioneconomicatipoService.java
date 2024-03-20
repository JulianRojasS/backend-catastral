package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_destinacioneconomicatipo;
import com.example.catastral.Repositories.temporal_destinacioneconomicatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_destinacioneconomicatipoService {
    private temporal_destinacioneconomicatipoRepository repository;

    public temporal_destinacioneconomicatipoService (temporal_destinacioneconomicatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_destinacioneconomicatipo> todo () {
        return (ArrayList<Temporal_destinacioneconomicatipo>) repository.findAll();
    }

    public Temporal_destinacioneconomicatipo temporal_destinacioneconomicatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}