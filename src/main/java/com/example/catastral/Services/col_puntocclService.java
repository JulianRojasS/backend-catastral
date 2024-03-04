package com.example.catastral.Services;

import com.example.catastral.Entities.Col_puntoccl;
import com.example.catastral.Repositories.col_puntocclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_puntocclService {
    private col_puntocclRepository repository;

    public col_puntocclService (col_puntocclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_puntoccl> todo () {
        return (ArrayList<Col_puntoccl>) repository.findAll();
    }

    public Col_puntoccl col_puntoccl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}