package com.example.catastral.Services;

import com.example.catastral.Entities.Col_estadoredserviciostipo;
import com.example.catastral.Repositories.col_estadoredserviciostipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_estadoredserviciostipoService {
    private col_estadoredserviciostipoRepository repository;

    public col_estadoredserviciostipoService (col_estadoredserviciostipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_estadoredserviciostipo> todo () {
        return (ArrayList<Col_estadoredserviciostipo>) repository.findAll();
    }

    public Col_estadoredserviciostipo col_estadoredserviciostipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}