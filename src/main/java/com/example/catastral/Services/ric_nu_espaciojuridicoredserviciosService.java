package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_espaciojuridicoredservicios;
import com.example.catastral.Repositories.ric_nu_espaciojuridicoredserviciosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_espaciojuridicoredserviciosService {
    private ric_nu_espaciojuridicoredserviciosRepository repository;

    public ric_nu_espaciojuridicoredserviciosService (ric_nu_espaciojuridicoredserviciosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_espaciojuridicoredservicios> todo () {
        return (ArrayList<Ric_nu_espaciojuridicoredservicios>) repository.findAll();
    }

    public Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios (Integer t_id) {
        return repository.findById(t_id).get();
    }
}