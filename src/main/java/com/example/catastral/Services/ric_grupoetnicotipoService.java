package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_grupoetnicotipo;
import com.example.catastral.Repositories.ric_grupoetnicotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_grupoetnicotipoService {
    private ric_grupoetnicotipoRepository repository;

    public ric_grupoetnicotipoService (ric_grupoetnicotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_grupoetnicotipo> todo () {
        return (ArrayList<Ric_grupoetnicotipo>) repository.findAll();
    }

    public Ric_grupoetnicotipo ric_grupoetnicotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}