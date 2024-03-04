package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_mutaciontipo;
import com.example.catastral.Repositories.ric_mutaciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_mutaciontipoService {
    private ric_mutaciontipoRepository repository;

    public ric_mutaciontipoService (ric_mutaciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_mutaciontipo> todo () {
        return (ArrayList<Ric_mutaciontipo>) repository.findAll();
    }

    public Ric_mutaciontipo ric_mutaciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}