package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_agrupacioninteresados;
import com.example.catastral.Repositories.ric_agrupacioninteresadosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_agrupacioninteresadosService {
    private ric_agrupacioninteresadosRepository repository;

    public ric_agrupacioninteresadosService (ric_agrupacioninteresadosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_agrupacioninteresados> todo () {
        return (ArrayList<Ric_agrupacioninteresados>) repository.findAll();
    }

    public Ric_agrupacioninteresados ric_agrupacioninteresados (Integer t_id) {
        return repository.findById(t_id).get();
    }
    public Ric_agrupacioninteresados ric_agrupacioninteresadosInsertar (Ric_agrupacioninteresados ric_agrupacioninteresados) {
        ric_agrupacioninteresados.setT_ili_tid(repository.t_ili_tid());
        if (ric_agrupacioninteresados.getCol_grupointeresadotipo() != null) {
            repository.save(ric_agrupacioninteresados);
            if (repository.findById(ric_agrupacioninteresados.getT_id()).isPresent()) {
                return repository.findById(ric_agrupacioninteresados.getT_id()).get();
            } else {
                return new Ric_agrupacioninteresados();
            }
        } else {
            return new Ric_agrupacioninteresados();
        }
    }
}