package com.example.catastral.Services;

import com.example.catastral.Entities.Col_baunitcomointeresado;
import com.example.catastral.Repositories.col_baunitcomointeresadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_baunitcomointeresadoService {
    private col_baunitcomointeresadoRepository repository;

    public col_baunitcomointeresadoService (col_baunitcomointeresadoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_baunitcomointeresado> todo () {
        return (ArrayList<Col_baunitcomointeresado>) repository.findAll();
    }

    public Col_baunitcomointeresado col_baunitcomointeresado (Integer t_id) {
        return repository.findById(t_id).get();
    }
}