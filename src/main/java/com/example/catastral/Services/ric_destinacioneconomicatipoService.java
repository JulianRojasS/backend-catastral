package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_destinacioneconomicatipo;
import com.example.catastral.Repositories.ric_destinacioneconomicatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_destinacioneconomicatipoService {
    private ric_destinacioneconomicatipoRepository repository;

    public ric_destinacioneconomicatipoService (ric_destinacioneconomicatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_destinacioneconomicatipo> todo () {
        return (ArrayList<Ric_destinacioneconomicatipo>) repository.findAll();
    }

    public Ric_destinacioneconomicatipo ric_destinacioneconomicatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}