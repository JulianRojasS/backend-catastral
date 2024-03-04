package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_estadotipo;
import com.example.catastral.Repositories.ric_estadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_estadotipoService {
    private ric_estadotipoRepository repository;

    public ric_estadotipoService (ric_estadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_estadotipo> todo () {
        return (ArrayList<Ric_estadotipo>) repository.findAll();
    }

    public Ric_estadotipo ric_estadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}