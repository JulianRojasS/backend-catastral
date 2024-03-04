package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_dominioconstrucciontipo;
import com.example.catastral.Repositories.ric_dominioconstrucciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_dominioconstrucciontipoService {
    private ric_dominioconstrucciontipoRepository repository;

    public ric_dominioconstrucciontipoService (ric_dominioconstrucciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_dominioconstrucciontipo> todo () {
        return (ArrayList<Ric_dominioconstrucciontipo>) repository.findAll();
    }

    public Ric_dominioconstrucciontipo ric_dominioconstrucciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}