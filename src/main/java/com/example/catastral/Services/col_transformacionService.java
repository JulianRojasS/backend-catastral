package com.example.catastral.Services;

import com.example.catastral.Entities.Col_transformacion;
import com.example.catastral.Repositories.col_transformacionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_transformacionService {
    private col_transformacionRepository repository;

    public col_transformacionService (col_transformacionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_transformacion> todo () {
        return (ArrayList<Col_transformacion>) repository.findAll();
    }

    public Col_transformacion col_transformacion (Integer t_id) {
        return repository.findById(t_id).get();
    }
}