package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_tramitecatastral;
import com.example.catastral.Repositories.ric_tramitecatastralRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_tramitecatastralService {
    private ric_tramitecatastralRepository repository;

    public ric_tramitecatastralService (ric_tramitecatastralRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_tramitecatastral> todo () {
        return (ArrayList<Ric_tramitecatastral>) repository.findAll();
    }

    public Ric_tramitecatastral ric_tramitecatastral (Integer t_id) {
        return repository.findById(t_id).get();
    }
}