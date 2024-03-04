package com.example.catastral.Services;

import com.example.catastral.Entities.Extredserviciosfisica;
import com.example.catastral.Repositories.extredserviciosfisicaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extredserviciosfisicaService {
    private extredserviciosfisicaRepository repository;

    public extredserviciosfisicaService (extredserviciosfisicaRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extredserviciosfisica> todo () {
        return (ArrayList<Extredserviciosfisica>) repository.findAll();
    }

    public Extredserviciosfisica extredserviciosfisica (Integer t_id) {
        return repository.findById(t_id).get();
    }
}