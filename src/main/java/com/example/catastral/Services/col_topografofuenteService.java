package com.example.catastral.Services;

import com.example.catastral.Entities.Col_topografofuente;
import com.example.catastral.Repositories.col_topografofuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_topografofuenteService {
    private col_topografofuenteRepository repository;

    public col_topografofuenteService (col_topografofuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_topografofuente> todo () {
        return (ArrayList<Col_topografofuente>) repository.findAll();
    }

    public Col_topografofuente col_topografofuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}