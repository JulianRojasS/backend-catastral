package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_catastrotipo;
import com.example.catastral.Repositories.temporal_catastrotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_catastrotipoService {
    private temporal_catastrotipoRepository repository;

    public temporal_catastrotipoService (temporal_catastrotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_catastrotipo> todo () {
        return (ArrayList<Temporal_catastrotipo>) repository.findAll();
    }

    public Temporal_catastrotipo temporal_catastrotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}