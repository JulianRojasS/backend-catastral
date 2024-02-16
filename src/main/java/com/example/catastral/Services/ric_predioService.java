package com.example.catastral.Services;

import com.example.catastral.Entities.ric_predio;
import com.example.catastral.Repositories.ric_predioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<Map<String, Object>> predioDetalleInteresado (Integer t_id) {
        return repository.detalleConsultaInteresado(t_id);
    }
}
