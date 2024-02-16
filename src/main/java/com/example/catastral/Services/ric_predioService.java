package com.example.catastral.Services;

import com.example.catastral.Entities.ric_predio;
import com.example.catastral.Repositories.ric_predioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ric_predioService {

    ric_predioRepository repository;

    public ric_predioService (ric_predioRepository repository) {
        this.repository = repository;
    }

    public List<ric_predio> predioByLike (String column, String value) {
        String uppervalue = value.toUpperCase();

        return repository.buscarValor(column, uppervalue);
    }
}
