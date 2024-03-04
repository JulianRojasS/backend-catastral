package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_datosphcondominio;
import com.example.catastral.Repositories.ric_datosphcondominioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_datosphcondominioService {
    private ric_datosphcondominioRepository repository;

    public ric_datosphcondominioService (ric_datosphcondominioRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_datosphcondominio> todo () {
        return (ArrayList<Ric_datosphcondominio>) repository.findAll();
    }

    public Ric_datosphcondominio ric_datosphcondominio (Integer t_id) {
        return repository.findById(t_id).get();
    }
}