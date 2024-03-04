package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_relacionnecesariabaunits;
import com.example.catastral.Repositories.ric_nu_relacionnecesariabaunitsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_relacionnecesariabaunitsService {
    private ric_nu_relacionnecesariabaunitsRepository repository;

    public ric_nu_relacionnecesariabaunitsService (ric_nu_relacionnecesariabaunitsRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_relacionnecesariabaunits> todo () {
        return (ArrayList<Ric_nu_relacionnecesariabaunits>) repository.findAll();
    }

    public Ric_nu_relacionnecesariabaunits ric_nu_relacionnecesariabaunits (Integer t_id) {
        return repository.findById(t_id).get();
    }
}