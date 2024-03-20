package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_miembros;
import com.example.catastral.Repositories.temporal_miembrosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_miembrosService {
    private temporal_miembrosRepository repository;

    public temporal_miembrosService (temporal_miembrosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_miembros> todo () {
        return (ArrayList<Temporal_miembros>) repository.findAll();
    }

    public Temporal_miembros temporal_miembros (Integer t_id) {
        return repository.findById(t_id).get();
    }
}