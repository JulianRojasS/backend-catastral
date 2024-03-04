package com.example.catastral.Services;

import com.example.catastral.Entities.Col_fuenteadministrativatipo;
import com.example.catastral.Repositories.col_fuenteadministrativatipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_fuenteadministrativatipoService {
    private col_fuenteadministrativatipoRepository repository;

    public col_fuenteadministrativatipoService (col_fuenteadministrativatipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_fuenteadministrativatipo> todo () {
        return (ArrayList<Col_fuenteadministrativatipo>) repository.findAll();
    }

    public Col_fuenteadministrativatipo col_fuenteadministrativatipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}