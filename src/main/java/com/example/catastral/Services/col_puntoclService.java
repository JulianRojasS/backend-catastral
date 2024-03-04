package com.example.catastral.Services;

import com.example.catastral.Entities.Col_puntocl;
import com.example.catastral.Repositories.col_puntoclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_puntoclService {
    private col_puntoclRepository repository;

    public col_puntoclService (col_puntoclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_puntocl> todo () {
        return (ArrayList<Col_puntocl>) repository.findAll();
    }

    public Col_puntocl col_puntocl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}