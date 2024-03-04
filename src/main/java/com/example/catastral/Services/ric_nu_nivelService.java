package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_nivel;
import com.example.catastral.Repositories.ric_nu_nivelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_nivelService {
    private ric_nu_nivelRepository repository;

    public ric_nu_nivelService (ric_nu_nivelRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_nivel> todo () {
        return (ArrayList<Ric_nu_nivel>) repository.findAll();
    }

    public Ric_nu_nivel ric_nu_nivel (Integer t_id) {
        return repository.findById(t_id).get();
    }
}