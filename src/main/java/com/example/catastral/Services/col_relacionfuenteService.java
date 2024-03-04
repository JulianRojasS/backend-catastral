package com.example.catastral.Services;

import com.example.catastral.Entities.Col_relacionfuente;
import com.example.catastral.Repositories.col_relacionfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_relacionfuenteService {
    private col_relacionfuenteRepository repository;

    public col_relacionfuenteService (col_relacionfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_relacionfuente> todo () {
        return (ArrayList<Col_relacionfuente>) repository.findAll();
    }

    public Col_relacionfuente col_relacionfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}