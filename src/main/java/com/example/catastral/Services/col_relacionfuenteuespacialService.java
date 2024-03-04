package com.example.catastral.Services;

import com.example.catastral.Entities.Col_relacionfuenteuespacial;
import com.example.catastral.Repositories.col_relacionfuenteuespacialRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_relacionfuenteuespacialService {
    private col_relacionfuenteuespacialRepository repository;

    public col_relacionfuenteuespacialService (col_relacionfuenteuespacialRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_relacionfuenteuespacial> todo () {
        return (ArrayList<Col_relacionfuenteuespacial>) repository.findAll();
    }

    public Col_relacionfuenteuespacial col_relacionfuenteuespacial (Integer t_id) {
        return repository.findById(t_id).get();
    }
}