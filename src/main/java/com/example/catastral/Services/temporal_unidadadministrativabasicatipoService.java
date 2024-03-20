package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_unidadadministrativabasicatipo;
import com.example.catastral.Repositories.temporal_unidadadministrativabasicatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_unidadadministrativabasicatipoService {
    private temporal_unidadadministrativabasicatipoRepository repository;

    public temporal_unidadadministrativabasicatipoService (temporal_unidadadministrativabasicatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_unidadadministrativabasicatipo> todo () {
        return (ArrayList<Temporal_unidadadministrativabasicatipo>) repository.findAll();
    }

    public Temporal_unidadadministrativabasicatipo temporal_unidadadministrativabasicatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}