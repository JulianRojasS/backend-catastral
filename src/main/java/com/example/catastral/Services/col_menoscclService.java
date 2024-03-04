package com.example.catastral.Services;

import com.example.catastral.Entities.Col_menosccl;
import com.example.catastral.Repositories.col_menoscclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_menoscclService {
    private col_menoscclRepository repository;

    public col_menoscclService (col_menoscclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_menosccl> todo () {
        return (ArrayList<Col_menosccl>) repository.findAll();
    }

    public Col_menosccl col_menosccl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}