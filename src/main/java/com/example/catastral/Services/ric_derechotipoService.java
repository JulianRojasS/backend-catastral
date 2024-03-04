package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_derechotipo;
import com.example.catastral.Repositories.ric_derechotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_derechotipoService {
    private ric_derechotipoRepository repository;

    public ric_derechotipoService (ric_derechotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_derechotipo> todo () {
        return (ArrayList<Ric_derechotipo>) repository.findAll();
    }

    public Ric_derechotipo ric_derechotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}