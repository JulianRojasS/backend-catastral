package com.example.catastral.Services;

import com.example.catastral.Entities.Col_grupointeresadotipo;
import com.example.catastral.Repositories.col_grupointeresadotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_grupointeresadotipoService {
    private col_grupointeresadotipoRepository repository;

    public col_grupointeresadotipoService (col_grupointeresadotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_grupointeresadotipo> todo () {
        return (ArrayList<Col_grupointeresadotipo>) repository.findAll();
    }

    public Col_grupointeresadotipo col_grupointeresadotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}