package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_interesadotipo;
import com.example.catastral.Repositories.temporal_interesadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_interesadotipoService {
    private temporal_interesadotipoRepository repository;

    public temporal_interesadotipoService (temporal_interesadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_interesadotipo> todo () {
        return (ArrayList<Temporal_interesadotipo>) repository.findAll();
    }

    public Temporal_interesadotipo temporal_interesadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}