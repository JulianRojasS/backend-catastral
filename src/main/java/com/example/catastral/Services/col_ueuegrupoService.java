package com.example.catastral.Services;

import com.example.catastral.Entities.Col_ueuegrupo;
import com.example.catastral.Repositories.col_ueuegrupoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_ueuegrupoService {
    private col_ueuegrupoRepository repository;

    public col_ueuegrupoService (col_ueuegrupoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_ueuegrupo> todo () {
        return (ArrayList<Col_ueuegrupo>) repository.findAll();
    }

    public Col_ueuegrupo col_ueuegrupo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}