package com.example.catastral.Services;

import com.example.catastral.Entities.Col_clfuente;
import com.example.catastral.Repositories.col_clfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_clfuenteService {
    private col_clfuenteRepository repository;

    public col_clfuenteService (col_clfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_clfuente> todo () {
        return (ArrayList<Col_clfuente>) repository.findAll();
    }

    public Col_clfuente col_clfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}