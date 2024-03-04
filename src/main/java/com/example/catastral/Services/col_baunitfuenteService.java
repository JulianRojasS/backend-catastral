package com.example.catastral.Services;

import com.example.catastral.Entities.Col_baunitfuente;
import com.example.catastral.Repositories.col_baunitfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_baunitfuenteService {
    private col_baunitfuenteRepository repository;

    public col_baunitfuenteService (col_baunitfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_baunitfuente> todo () {
        return (ArrayList<Col_baunitfuente>) repository.findAll();
    }

    public Col_baunitfuente col_baunitfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }
}