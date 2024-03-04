package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_cadenacaraslimite;
import com.example.catastral.Repositories.ric_nu_cadenacaraslimiteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_cadenacaraslimiteService {
    private ric_nu_cadenacaraslimiteRepository repository;

    public ric_nu_cadenacaraslimiteService (ric_nu_cadenacaraslimiteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_cadenacaraslimite> todo () {
        return (ArrayList<Ric_nu_cadenacaraslimite>) repository.findAll();
    }

    public Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite (Integer t_id) {
        return repository.findById(t_id).get();
    }
}