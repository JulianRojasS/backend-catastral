package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_agrupacioninteresados;
import com.example.catastral.Repositories.temporal_agrupacioninteresadosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_agrupacioninteresadosService {
    private temporal_agrupacioninteresadosRepository repository;

    public temporal_agrupacioninteresadosService (temporal_agrupacioninteresadosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_agrupacioninteresados> todo () {
        return (ArrayList<Temporal_agrupacioninteresados>) repository.findAll();
    }

    public Temporal_agrupacioninteresados temporal_agrupacioninteresados (Integer t_id) {
        return repository.findById(t_id).get();
    }
}