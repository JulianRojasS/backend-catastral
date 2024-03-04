package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_catastrotipo;
import com.example.catastral.Repositories.ric_catastrotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_catastrotipoService {
    private ric_catastrotipoRepository repository;

    public ric_catastrotipoService (ric_catastrotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_catastrotipo> todo () {
        return (ArrayList<Ric_catastrotipo>) repository.findAll();
    }

    public Ric_catastrotipo ric_catastrotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}