package com.example.catastral.Services;

import com.example.catastral.Entities.Imagen;
import com.example.catastral.Repositories.imagenRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class imagenService {
    private imagenRepository repository;

    public imagenService (imagenRepository repository){
        this.repository = repository;
    }

    public ArrayList<Imagen> todo () {
        return (ArrayList<Imagen>) repository.findAll();
    }

    public Imagen imagen (Integer t_id) {
        return repository.findById(t_id).get();
    }
}