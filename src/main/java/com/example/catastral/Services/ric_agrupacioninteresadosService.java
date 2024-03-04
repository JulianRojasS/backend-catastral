package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_agrupacioninteresados;
import com.example.catastral.Repositories.ric_agrupacioninteresadosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_agrupacioninteresadosService {
    private ric_agrupacioninteresadosRepository repository;

    public ric_agrupacioninteresadosService (ric_agrupacioninteresadosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_agrupacioninteresados> todo () {
        return (ArrayList<Ric_agrupacioninteresados>) repository.findAll();
    }

    public Ric_agrupacioninteresados ric_agrupacioninteresados (Integer t_id) {
        return repository.findById(t_id).get();
    }
}