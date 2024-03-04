package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_unidadconstruccion;
import com.example.catastral.Repositories.ric_unidadconstruccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_unidadconstruccionService {
    private ric_unidadconstruccionRepository repository;

    public ric_unidadconstruccionService (ric_unidadconstruccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_unidadconstruccion> todo () {
        return (ArrayList<Ric_unidadconstruccion>) repository.findAll();
    }

    public Ric_unidadconstruccion ric_unidadconstruccion (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public List GeometriasUnidadConstruccion (ArrayList<Ric_unidadconstruccion> unidadconstruccions) {
        List geometrias = new ArrayList();
        for (Ric_unidadconstruccion unidadconstruccion : unidadconstruccions) {
            geometrias.add(unidadconstruccion.getGeometria());
        }
        return geometrias;
    }
}