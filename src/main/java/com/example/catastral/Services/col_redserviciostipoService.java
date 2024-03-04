package com.example.catastral.Services;

import com.example.catastral.Entities.Col_redserviciostipo;
import com.example.catastral.Repositories.col_redserviciostipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_redserviciostipoService {
    private col_redserviciostipoRepository repository;

    public col_redserviciostipoService (col_redserviciostipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_redserviciostipo> todo () {
        return (ArrayList<Col_redserviciostipo>) repository.findAll();
    }

    public Col_redserviciostipo col_redserviciostipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}