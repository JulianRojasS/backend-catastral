package com.example.catastral.Services;

import com.example.catastral.Entities.Col_areatipo;
import com.example.catastral.Repositories.col_areatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_areatipoService {
    private col_areatipoRepository repository;

    public col_areatipoService (col_areatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_areatipo> todo () {
        return (ArrayList<Col_areatipo>) repository.findAll();
    }

    public Col_areatipo col_areatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}