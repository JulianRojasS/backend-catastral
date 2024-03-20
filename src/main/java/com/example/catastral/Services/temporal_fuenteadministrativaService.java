package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_fuenteadministrativa;
import com.example.catastral.Repositories.temporal_fuenteadministrativaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_fuenteadministrativaService {
    private temporal_fuenteadministrativaRepository repository;

    public temporal_fuenteadministrativaService (temporal_fuenteadministrativaRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_fuenteadministrativa> todo () {
        return (ArrayList<Temporal_fuenteadministrativa>) repository.findAll();
    }

    public Temporal_fuenteadministrativa temporal_fuenteadministrativa (Integer t_id) {
        return repository.findById(t_id).get();
    }
}