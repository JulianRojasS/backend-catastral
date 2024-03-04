package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_usouconstipo;
import com.example.catastral.Repositories.ric_usouconstipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_usouconstipoService {
    private ric_usouconstipoRepository repository;

    public ric_usouconstipoService (ric_usouconstipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_usouconstipo> todo () {
        return (ArrayList<Ric_usouconstipo>) repository.findAll();
    }

    public Ric_usouconstipo ric_usouconstipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}