package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_predio_informalidad;
import com.example.catastral.Repositories.ric_predio_informalidadRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_predio_informalidadService {
    private ric_predio_informalidadRepository repository;

    public ric_predio_informalidadService (ric_predio_informalidadRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_predio_informalidad> todo () {
        return (ArrayList<Ric_predio_informalidad>) repository.findAll();
    }

    public Ric_predio_informalidad ric_predio_informalidad (Integer t_id) {
        return repository.findById(t_id).get();
    }
}