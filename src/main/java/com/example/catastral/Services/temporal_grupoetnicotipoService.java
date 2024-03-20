package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_grupoetnicotipo;
import com.example.catastral.Repositories.temporal_grupoetnicotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_grupoetnicotipoService {
    private temporal_grupoetnicotipoRepository repository;

    public temporal_grupoetnicotipoService (temporal_grupoetnicotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_grupoetnicotipo> todo () {
        return (ArrayList<Temporal_grupoetnicotipo>) repository.findAll();
    }

    public Temporal_grupoetnicotipo temporal_grupoetnicotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}