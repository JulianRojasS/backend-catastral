package com.example.catastral.Services;

import com.example.catastral.Entities.Col_iso19125_tipo;
import com.example.catastral.Repositories.col_iso19125_tipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_iso19125_tipoService {
    private col_iso19125_tipoRepository repository;

    public col_iso19125_tipoService (col_iso19125_tipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_iso19125_tipo> todo () {
        return (ArrayList<Col_iso19125_tipo>) repository.findAll();
    }

    public Col_iso19125_tipo col_iso19125_tipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}