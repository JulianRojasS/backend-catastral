package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_punto;
import com.example.catastral.Repositories.ric_nu_puntoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_puntoService {
    private ric_nu_puntoRepository repository;

    public ric_nu_puntoService (ric_nu_puntoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_punto> todo () {
        return (ArrayList<Ric_nu_punto>) repository.findAll();
    }

    public Ric_nu_punto ric_nu_punto (Integer t_id) {
        return repository.findById(t_id).get();
    }
}