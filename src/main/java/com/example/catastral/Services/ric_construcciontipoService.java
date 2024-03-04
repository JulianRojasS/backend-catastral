package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_construcciontipo;
import com.example.catastral.Repositories.ric_construcciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_construcciontipoService {
    private ric_construcciontipoRepository repository;

    public ric_construcciontipoService (ric_construcciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_construcciontipo> todo () {
        return (ArrayList<Ric_construcciontipo>) repository.findAll();
    }

    public Ric_construcciontipo ric_construcciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}