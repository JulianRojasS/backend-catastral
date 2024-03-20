package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_gestorcatastral;
import com.example.catastral.Repositories.temporal_gestorcatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_gestorcatastralService {
    private temporal_gestorcatastralRepository repository;

    public temporal_gestorcatastralService (temporal_gestorcatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_gestorcatastral> todo () {
        return (ArrayList<Temporal_gestorcatastral>) repository.findAll();
    }

    public Temporal_gestorcatastral temporal_gestorcatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}