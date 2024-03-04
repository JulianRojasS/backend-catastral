package com.example.catastral.Services;

import com.example.catastral.Entities.Col_puntofuente;
import com.example.catastral.Repositories.col_puntofuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_puntofuenteService {
    private col_puntofuenteRepository repository;

    public col_puntofuenteService (col_puntofuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_puntofuente> todo () {
        return (ArrayList<Col_puntofuente>) repository.findAll();
    }

    public Col_puntofuente col_puntofuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}