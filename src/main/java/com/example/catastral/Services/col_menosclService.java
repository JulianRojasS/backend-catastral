package com.example.catastral.Services;

import com.example.catastral.Entities.Col_menoscl;
import com.example.catastral.Repositories.col_menosclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_menosclService {
    private col_menosclRepository repository;

    public col_menosclService (col_menosclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_menoscl> todo () {
        return (ArrayList<Col_menoscl>) repository.findAll();
    }

    public Col_menoscl col_menoscl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}