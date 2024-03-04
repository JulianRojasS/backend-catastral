package com.example.catastral.Services;

import com.example.catastral.Entities.Col_rrrfuente;
import com.example.catastral.Repositories.col_rrrfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_rrrfuenteService {
    private col_rrrfuenteRepository repository;

    public col_rrrfuenteService (col_rrrfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_rrrfuente> todo () {
        return (ArrayList<Col_rrrfuente>) repository.findAll();
    }

    public Col_rrrfuente col_rrrfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}