package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_estadodisponibilidadtipo;
import com.example.catastral.Repositories.temporal_estadodisponibilidadtipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_estadodisponibilidadtipoService {
    private temporal_estadodisponibilidadtipoRepository repository;

    public temporal_estadodisponibilidadtipoService (temporal_estadodisponibilidadtipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_estadodisponibilidadtipo> todo () {
        return (ArrayList<Temporal_estadodisponibilidadtipo>) repository.findAll();
    }

    public Temporal_estadodisponibilidadtipo temporal_estadodisponibilidadtipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}