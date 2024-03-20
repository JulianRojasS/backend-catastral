package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_interesado;
import com.example.catastral.Repositories.temporal_interesadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_interesadoService {
    private temporal_interesadoRepository repository;

    public temporal_interesadoService (temporal_interesadoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_interesado> todo () {
        return (ArrayList<Temporal_interesado>) repository.findAll();
    }

    public Temporal_interesado temporal_interesado (Integer t_id) {
        return repository.findById(t_id).get();
    }
}