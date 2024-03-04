package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_caraslindero;
import com.example.catastral.Repositories.ric_nu_caraslinderoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_caraslinderoService {
    private ric_nu_caraslinderoRepository repository;

    public ric_nu_caraslinderoService (ric_nu_caraslinderoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_caraslindero> todo () {
        return (ArrayList<Ric_nu_caraslindero>) repository.findAll();
    }

    public Ric_nu_caraslindero ric_nu_caraslindero (Integer t_id) {
        return repository.findById(t_id).get();
    }
}