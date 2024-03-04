package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_operadorcatastral;
import com.example.catastral.Repositories.ric_operadorcatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_operadorcatastralService {
    private ric_operadorcatastralRepository repository;

    public ric_operadorcatastralService (ric_operadorcatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_operadorcatastral> todo () {
        return (ArrayList<Ric_operadorcatastral>) repository.findAll();
    }

    public Ric_operadorcatastral ric_operadorcatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}