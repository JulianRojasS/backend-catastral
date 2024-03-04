package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_interesadotipo;
import com.example.catastral.Repositories.ric_interesadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_interesadotipoService {
    private ric_interesadotipoRepository repository;

    public ric_interesadotipoService (ric_interesadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_interesadotipo> todo () {
        return (ArrayList<Ric_interesadotipo>) repository.findAll();
    }

    public Ric_interesadotipo ric_interesadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}