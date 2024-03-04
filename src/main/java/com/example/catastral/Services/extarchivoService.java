package com.example.catastral.Services;

import com.example.catastral.Entities.Extarchivo;
import com.example.catastral.Repositories.extarchivoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extarchivoService {
    private extarchivoRepository repository;

    public extarchivoService (extarchivoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extarchivo> todo () {
        return (ArrayList<Extarchivo>) repository.findAll();
    }

    public Extarchivo extarchivo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}