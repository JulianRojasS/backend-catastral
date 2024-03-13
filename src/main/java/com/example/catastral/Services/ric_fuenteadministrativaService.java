package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_fuenteadministrativa;
import com.example.catastral.Repositories.ric_fuenteadministrativaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ric_fuenteadministrativaService {
    private ric_fuenteadministrativaRepository repository;

    public ric_fuenteadministrativaService (ric_fuenteadministrativaRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_fuenteadministrativa> todo () {
        return (ArrayList<Ric_fuenteadministrativa>) repository.findAll();
    }

    public Ric_fuenteadministrativa ric_fuenteadministrativa (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public Ric_fuenteadministrativa insertarFuenteadministrativa (Ric_fuenteadministrativa fuenteadministrativa) {
        fuenteadministrativa.setT_ili_tid(repository.t_ili_tid());
        if (fuenteadministrativa.getCol_fuenteadministrativatipo() != null) {
            repository.save(fuenteadministrativa);
            if (repository.findById(fuenteadministrativa.getT_id()).isPresent()){
                return repository.findById(fuenteadministrativa.getT_id()).get();
            } else {
                return new Ric_fuenteadministrativa();
            }
        } else {
            return new Ric_fuenteadministrativa();
        }
    }
}