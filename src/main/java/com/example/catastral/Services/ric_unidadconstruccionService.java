package com.example.catastral.Services;

import com.example.catastral.Entities.ric_unidadconstruccion;
import com.example.catastral.Repositories.ric_unidadconstruccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ric_unidadconstruccionService {

    ric_unidadconstruccionRepository repository;

    public ric_unidadconstruccionService (ric_unidadconstruccionRepository repository) {
        this.repository = repository;
    }

    public ArrayList<ric_unidadconstruccion> unidadConstruccionPredio (Integer baunit) {
        return repository.unidadConstruccionPredio(baunit);
    }
}
