package com.example.catastral.Services;

import com.example.catastral.Entities.Col_dimensiontipo;
import com.example.catastral.Repositories.col_dimensiontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_dimensiontipoService {
    private col_dimensiontipoRepository repository;

    public col_dimensiontipoService (col_dimensiontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_dimensiontipo> todo () {
        return (ArrayList<Col_dimensiontipo>) repository.findAll();
    }

    public Col_dimensiontipo col_dimensiontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}