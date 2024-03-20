package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_condicionprediotipo;
import com.example.catastral.Repositories.temporal_condicionprediotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_condicionprediotipoService {
    private temporal_condicionprediotipoRepository repository;

    public temporal_condicionprediotipoService (temporal_condicionprediotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_condicionprediotipo> todo () {
        return (ArrayList<Temporal_condicionprediotipo>) repository.findAll();
    }

    public Temporal_condicionprediotipo temporal_condicionprediotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}