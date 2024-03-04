package com.example.catastral.Services;

import com.example.catastral.Entities.Col_miembros;
import com.example.catastral.Repositories.col_miembrosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_miembrosService {
    private col_miembrosRepository repository;

    public col_miembrosService (col_miembrosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_miembros> todo () {
        return (ArrayList<Col_miembros>) repository.findAll();
    }

    public Col_miembros col_miembros (Integer t_id) {
        return repository.findById(t_id).get();
    }
}