package com.example.catastral.Services;

import java.util.List;
import java.util.Map;

import com.example.catastral.Entities.ric_interesado;
import com.example.catastral.Repositories.ric_interesadoRepository;
import org.springframework.stereotype.Service;

@Service
public class ric_interesadoService {
    private ric_interesadoRepository repository;

    public ric_interesadoService(ric_interesadoRepository repository) {
        this.repository = repository;
    }

    public List<ric_interesado> interesadoByLike (String column, String value) {
        String uppervalue = value.toUpperCase();
        return repository.buscarPorValor(column, uppervalue);
    }

    public List<Map<String, Object>> interesadosByDocument (Integer t_id) {
        return repository.detalleConsulta(t_id);
    }

    public List<Map<String, Object>> predioDetalle (Integer t_id) {
        return repository.detalleConsultaPredio(t_id);
    }
}