package com.example.catastral.Services;

import com.example.catastral.Entities.Col_registrotipo;
import com.example.catastral.Repositories.col_registrotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_registrotipoService {
    private col_registrotipoRepository repository;

    public col_registrotipoService (col_registrotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_registrotipo> todo () {
        return (ArrayList<Col_registrotipo>) repository.findAll();
    }

    public Col_registrotipo col_registrotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}