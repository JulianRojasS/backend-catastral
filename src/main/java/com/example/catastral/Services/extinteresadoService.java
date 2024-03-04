package com.example.catastral.Services;

import com.example.catastral.Entities.Extinteresado;
import com.example.catastral.Repositories.extinteresadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extinteresadoService {
    private extinteresadoRepository repository;

    public extinteresadoService (extinteresadoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extinteresado> todo () {
        return (ArrayList<Extinteresado>) repository.findAll();
    }

    public Extinteresado extinteresado (Integer t_id) {
        return repository.findById(t_id).get();
    }
}