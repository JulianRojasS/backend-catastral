package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_sexotipo;
import com.example.catastral.Repositories.ric_sexotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_sexotipoService {
    private ric_sexotipoRepository repository;

    public ric_sexotipoService (ric_sexotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_sexotipo> todo () {
        return (ArrayList<Ric_sexotipo>) repository.findAll();
    }

    public Ric_sexotipo ric_sexotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}