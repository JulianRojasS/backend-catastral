package com.example.catastral.Services;

import com.example.catastral.Entities.Col_interpolaciontipo;
import com.example.catastral.Repositories.col_interpolaciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_interpolaciontipoService {
    private col_interpolaciontipoRepository repository;

    public col_interpolaciontipoService (col_interpolaciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_interpolaciontipo> todo () {
        return (ArrayList<Col_interpolaciontipo>) repository.findAll();
    }

    public Col_interpolaciontipo col_interpolaciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}