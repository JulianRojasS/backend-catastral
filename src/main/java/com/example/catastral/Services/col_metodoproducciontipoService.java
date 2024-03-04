package com.example.catastral.Services;

import com.example.catastral.Entities.Col_metodoproducciontipo;
import com.example.catastral.Repositories.col_metodoproducciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_metodoproducciontipoService {
    private col_metodoproducciontipoRepository repository;

    public col_metodoproducciontipoService (col_metodoproducciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_metodoproducciontipo> todo () {
        return (ArrayList<Col_metodoproducciontipo>) repository.findAll();
    }

    public Col_metodoproducciontipo col_metodoproducciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}