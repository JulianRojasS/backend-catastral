package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_estadotipo;
import com.example.catastral.Repositories.temporal_estadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_estadotipoService {
    private temporal_estadotipoRepository repository;

    public temporal_estadotipoService (temporal_estadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_estadotipo> todo () {
        return (ArrayList<Temporal_estadotipo>) repository.findAll();
    }

    public Temporal_estadotipo temporal_estadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}