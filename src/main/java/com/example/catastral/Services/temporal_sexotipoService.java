package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_sexotipo;
import com.example.catastral.Repositories.temporal_sexotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_sexotipoService {
    private temporal_sexotipoRepository repository;

    public temporal_sexotipoService (temporal_sexotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_sexotipo> todo () {
        return (ArrayList<Temporal_sexotipo>) repository.findAll();
    }

    public Temporal_sexotipo temporal_sexotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}