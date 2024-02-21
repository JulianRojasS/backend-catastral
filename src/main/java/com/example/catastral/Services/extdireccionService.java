package com.example.catastral.Services;

import com.example.catastral.Entities.extdireccion;
import com.example.catastral.Repositories.extdireccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class extdireccionService {
    private extdireccionRepository repository;

    public extdireccionService (extdireccionRepository repository){
        this.repository = repository;
    }

    public List<Map<String, Object>> direccionPorPredio (Integer t_id) {
        return repository.direccionPredio(t_id);
    }
}
