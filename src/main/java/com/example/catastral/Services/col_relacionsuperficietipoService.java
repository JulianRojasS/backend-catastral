package com.example.catastral.Services;

import com.example.catastral.Entities.Col_relacionsuperficietipo;
import com.example.catastral.Repositories.col_relacionsuperficietipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_relacionsuperficietipoService {
    private col_relacionsuperficietipoRepository repository;

    public col_relacionsuperficietipoService (col_relacionsuperficietipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_relacionsuperficietipo> todo () {
        return (ArrayList<Col_relacionsuperficietipo>) repository.findAll();
    }

    public Col_relacionsuperficietipo col_relacionsuperficietipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}