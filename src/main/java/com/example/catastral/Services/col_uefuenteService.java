package com.example.catastral.Services;

import com.example.catastral.Entities.Col_uefuente;
import com.example.catastral.Repositories.col_uefuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_uefuenteService {
    private col_uefuenteRepository repository;

    public col_uefuenteService (col_uefuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_uefuente> todo () {
        return (ArrayList<Col_uefuente>) repository.findAll();
    }

    public Col_uefuente col_uefuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}