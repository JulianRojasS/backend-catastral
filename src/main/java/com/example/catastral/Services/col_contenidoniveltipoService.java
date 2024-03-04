package com.example.catastral.Services;

import com.example.catastral.Entities.Col_contenidoniveltipo;
import com.example.catastral.Repositories.col_contenidoniveltipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_contenidoniveltipoService {
    private col_contenidoniveltipoRepository repository;

    public col_contenidoniveltipoService (col_contenidoniveltipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_contenidoniveltipo> todo () {
        return (ArrayList<Col_contenidoniveltipo>) repository.findAll();
    }

    public Col_contenidoniveltipo col_contenidoniveltipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}