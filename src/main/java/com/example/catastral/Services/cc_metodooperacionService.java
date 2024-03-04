package com.example.catastral.Services;

import com.example.catastral.Entities.Cc_metodooperacion;
import com.example.catastral.Repositories.cc_metodooperacionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class cc_metodooperacionService {
    private cc_metodooperacionRepository repository;

    public cc_metodooperacionService (cc_metodooperacionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Cc_metodooperacion> todo () {
        return (ArrayList<Cc_metodooperacion>) repository.findAll();
    }

    public Cc_metodooperacion cc_metodooperacion (Integer t_id) {
        return repository.findById(t_id).get();
    }
}