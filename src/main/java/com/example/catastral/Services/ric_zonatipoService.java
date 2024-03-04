package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_zonatipo;
import com.example.catastral.Repositories.ric_zonatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_zonatipoService {
    private ric_zonatipoRepository repository;

    public ric_zonatipoService (ric_zonatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_zonatipo> todo () {
        return (ArrayList<Ric_zonatipo>) repository.findAll();
    }

    public Ric_zonatipo ric_zonatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}