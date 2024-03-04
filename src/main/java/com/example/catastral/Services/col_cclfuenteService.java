package com.example.catastral.Services;

import com.example.catastral.Entities.Col_cclfuente;
import com.example.catastral.Repositories.col_cclfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_cclfuenteService {
    private col_cclfuenteRepository repository;

    public col_cclfuenteService (col_cclfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_cclfuente> todo () {
        return (ArrayList<Col_cclfuente>) repository.findAll();
    }

    public Col_cclfuente col_cclfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}