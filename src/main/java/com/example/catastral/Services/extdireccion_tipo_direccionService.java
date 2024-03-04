package com.example.catastral.Services;

import com.example.catastral.Entities.Extdireccion_tipo_direccion;
import com.example.catastral.Repositories.extdireccion_tipo_direccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extdireccion_tipo_direccionService {
    private extdireccion_tipo_direccionRepository repository;

    public extdireccion_tipo_direccionService (extdireccion_tipo_direccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extdireccion_tipo_direccion> todo () {
        return (ArrayList<Extdireccion_tipo_direccion>) repository.findAll();
    }

    public Extdireccion_tipo_direccion extdireccion_tipo_direccion (Integer t_id) {
        return repository.findById(t_id).get();
    }
}