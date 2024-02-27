package com.example.catastral.Services;

import com.example.catastral.Entities.ric_construccion;
import com.example.catastral.Repositories.ric_construccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ric_contruccionService {
    private ric_construccionRepository repository;

    public ric_contruccionService (ric_construccionRepository repository){
        this.repository = repository;
    }

    public List<Map<String, Object>> construccionPredio (Integer baunit) {
        return repository.construccionPredio(baunit);
    }
}
