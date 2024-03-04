package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_terreno;
import com.example.catastral.Repositories.ric_terrenoRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_terrenoService {
    private ric_terrenoRepository repository;

    public ric_terrenoService (ric_terrenoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_terreno> todo () {
        return (ArrayList<Ric_terreno>) repository.findAll();
    }

    public Ric_terreno ric_terreno (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public List GeometriasTerreno (ArrayList<Ric_terreno> terrenos) {
        List geometrias = new ArrayList();
        for (Ric_terreno terreno : terrenos) {
            geometrias.add(terreno.getGeometria());
        }
        return geometrias;
    }
}