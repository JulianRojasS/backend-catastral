package com.example.catastral.Services;

import com.example.catastral.Entities.ric_derecho;
import com.example.catastral.Repositories.ric_derechoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ric_derechoService {
    private ric_derechoRepository repository;

    public ric_derechoService (ric_derechoRepository repository) {
        this.repository = repository;
    }

    public List<Map<String, Object>> derechoPorPredio (Integer t_id) {
        return repository.derechoPredio(t_id);
    }
}
