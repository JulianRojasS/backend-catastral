package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_construccion;
import com.example.catastral.Entities.Ric_unidadconstruccion;
import com.example.catastral.Repositories.ric_construccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_construccionService {
    private ric_construccionRepository repository;

    public ric_construccionService (ric_construccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_construccion> todo () {
        return (ArrayList<Ric_construccion>) repository.findAll();
    }

    public Ric_construccion ric_construccion (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public List GeometriasConstruccion (ArrayList<Ric_construccion> construccions) {
        List geometrias = new ArrayList();
        for (Ric_construccion construccion : construccions) {
            geometrias.add(construccion.getGeometria());
        }
        return geometrias;
    }
}