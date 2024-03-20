package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_fuenteadministrativatipo;
import com.example.catastral.Repositories.temporal_fuenteadministrativatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_fuenteadministrativatipoService {
    private temporal_fuenteadministrativatipoRepository repository;

    public temporal_fuenteadministrativatipoService (temporal_fuenteadministrativatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_fuenteadministrativatipo> todo () {
        return (ArrayList<Temporal_fuenteadministrativatipo>) repository.findAll();
    }

    public Temporal_fuenteadministrativatipo temporal_fuenteadministrativatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}