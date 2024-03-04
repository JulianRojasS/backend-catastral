package com.example.catastral.Services;

import com.example.catastral.Entities.Col_mascl;
import com.example.catastral.Repositories.col_masclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_masclService {
    private col_masclRepository repository;

    public col_masclService (col_masclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_mascl> todo () {
        return (ArrayList<Col_mascl>) repository.findAll();
    }

    public Col_mascl col_mascl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}