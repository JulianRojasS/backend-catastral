package com.example.catastral.Services;

import com.example.catastral.Entities.Col_responsablefuente;
import com.example.catastral.Repositories.col_responsablefuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_responsablefuenteService {
    private col_responsablefuenteRepository repository;

    public col_responsablefuenteService (col_responsablefuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_responsablefuente> todo () {
        return (ArrayList<Col_responsablefuente>) repository.findAll();
    }

    public Col_responsablefuente col_responsablefuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}