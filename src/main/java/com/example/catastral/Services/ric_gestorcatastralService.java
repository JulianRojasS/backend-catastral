package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_gestorcatastral;
import com.example.catastral.Repositories.ric_gestorcatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_gestorcatastralService {
    private ric_gestorcatastralRepository repository;

    public ric_gestorcatastralService (ric_gestorcatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_gestorcatastral> todo () {
        return (ArrayList<Ric_gestorcatastral>) repository.findAll();
    }

    public Ric_gestorcatastral ric_gestorcatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}