package com.example.catastral.Services;

import com.example.catastral.Entities.Col_estadodisponibilidadtipo;
import com.example.catastral.Repositories.col_estadodisponibilidadtipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_estadodisponibilidadtipoService {
    private col_estadodisponibilidadtipoRepository repository;

    public col_estadodisponibilidadtipoService (col_estadodisponibilidadtipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_estadodisponibilidadtipo> todo () {
        return (ArrayList<Col_estadodisponibilidadtipo>) repository.findAll();
    }

    public Col_estadodisponibilidadtipo col_estadodisponibilidadtipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}