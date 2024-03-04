package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_fuenteespacial;
import com.example.catastral.Repositories.ric_fuenteespacialRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_fuenteespacialService {
    private ric_fuenteespacialRepository repository;

    public ric_fuenteespacialService (ric_fuenteespacialRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_fuenteespacial> todo () {
        return (ArrayList<Ric_fuenteespacial>) repository.findAll();
    }

    public Ric_fuenteespacial ric_fuenteespacial (Integer t_id) {
        return repository.findById(t_id).get();
    }
}