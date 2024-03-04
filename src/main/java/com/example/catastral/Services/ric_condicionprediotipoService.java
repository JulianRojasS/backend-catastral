package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_condicionprediotipo;
import com.example.catastral.Repositories.ric_condicionprediotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_condicionprediotipoService {
    private ric_condicionprediotipoRepository repository;

    public ric_condicionprediotipoService (ric_condicionprediotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_condicionprediotipo> todo () {
        return (ArrayList<Ric_condicionprediotipo>) repository.findAll();
    }

    public Ric_condicionprediotipo ric_condicionprediotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}