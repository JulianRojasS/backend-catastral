package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_predio_tramitecatastral;
import com.example.catastral.Repositories.ric_predio_tramitecatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_predio_tramitecatastralService {
    private ric_predio_tramitecatastralRepository repository;

    public ric_predio_tramitecatastralService (ric_predio_tramitecatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_predio_tramitecatastral> todo () {
        return (ArrayList<Ric_predio_tramitecatastral>) repository.findAll();
    }

    public Ric_predio_tramitecatastral ric_predio_tramitecatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}