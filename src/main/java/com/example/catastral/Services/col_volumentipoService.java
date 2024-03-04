package com.example.catastral.Services;

import com.example.catastral.Entities.Col_volumentipo;
import com.example.catastral.Repositories.col_volumentipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_volumentipoService {
    private col_volumentipoRepository repository;

    public col_volumentipoService (col_volumentipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_volumentipo> todo () {
        return (ArrayList<Col_volumentipo>) repository.findAll();
    }

    public Col_volumentipo col_volumentipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}