package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_zonatipo;
import com.example.catastral.Repositories.temporal_zonatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_zonatipoService {
    private temporal_zonatipoRepository repository;

    public temporal_zonatipoService (temporal_zonatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_zonatipo> todo () {
        return (ArrayList<Temporal_zonatipo>) repository.findAll();
    }

    public Temporal_zonatipo temporal_zonatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}