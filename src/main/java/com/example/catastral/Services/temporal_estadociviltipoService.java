package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_estadociviltipo;
import com.example.catastral.Repositories.temporal_estadociviltipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_estadociviltipoService {
    private temporal_estadociviltipoRepository repository;

    public temporal_estadociviltipoService (temporal_estadociviltipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_estadociviltipo> todo () {
        return (ArrayList<Temporal_estadociviltipo>) repository.findAll();
    }

    public Temporal_estadociviltipo temporal_estadociviltipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}