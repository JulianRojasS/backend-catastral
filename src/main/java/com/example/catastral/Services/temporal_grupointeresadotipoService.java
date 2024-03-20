package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_grupointeresadotipo;
import com.example.catastral.Repositories.temporal_grupointeresadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_grupointeresadotipoService {
    private temporal_grupointeresadotipoRepository repository;

    public temporal_grupointeresadotipoService (temporal_grupointeresadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_grupointeresadotipo> todo () {
        return (ArrayList<Temporal_grupointeresadotipo>) repository.findAll();
    }

    public Temporal_grupointeresadotipo temporal_grupointeresadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}