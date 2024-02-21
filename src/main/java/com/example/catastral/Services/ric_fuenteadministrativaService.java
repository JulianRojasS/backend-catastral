package com.example.catastral.Services;

import com.example.catastral.Entities.ric_fuenteadministrativa;
import com.example.catastral.Repositories.ric_fuenteadministrativaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ric_fuenteadministrativaService {
    private ric_fuenteadministrativaRepository repository;

    public ric_fuenteadministrativaService (ric_fuenteadministrativaRepository repository) {
        this.repository = repository;
    }

    public List<ric_fuenteadministrativa> fuenteadministrativaPredio (Integer t_id) {
        return repository.fuenteadministrativaPredio(t_id);
    }
}
