package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_caracteristicasunidadconstruccion;
import com.example.catastral.Repositories.ric_caracteristicasunidadconstruccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_caracteristicasunidadconstruccionService {
    private ric_caracteristicasunidadconstruccionRepository repository;

    public ric_caracteristicasunidadconstruccionService (ric_caracteristicasunidadconstruccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_caracteristicasunidadconstruccion> todo () {
        return (ArrayList<Ric_caracteristicasunidadconstruccion>) repository.findAll();
    }

    public Ric_caracteristicasunidadconstruccion ric_caracteristicasunidadconstruccion (Integer t_id) {
        return repository.findById(t_id).get();
    }

}