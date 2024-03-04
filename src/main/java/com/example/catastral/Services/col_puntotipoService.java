package com.example.catastral.Services;

import com.example.catastral.Entities.Col_puntotipo;
import com.example.catastral.Repositories.col_puntotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_puntotipoService {
    private col_puntotipoRepository repository;

    public col_puntotipoService (col_puntotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_puntotipo> todo () {
        return (ArrayList<Col_puntotipo>) repository.findAll();
    }

    public Col_puntotipo col_puntotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}