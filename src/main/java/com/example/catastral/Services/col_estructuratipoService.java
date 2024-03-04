package com.example.catastral.Services;

import com.example.catastral.Entities.Col_estructuratipo;
import com.example.catastral.Repositories.col_estructuratipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_estructuratipoService {
    private col_estructuratipoRepository repository;

    public col_estructuratipoService (col_estructuratipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_estructuratipo> todo () {
        return (ArrayList<Col_estructuratipo>) repository.findAll();
    }

    public Col_estructuratipo col_estructuratipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}