package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_estadociviltipo;
import com.example.catastral.Repositories.ric_estadociviltipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_estadociviltipoService {
    private ric_estadociviltipoRepository repository;

    public ric_estadociviltipoService (ric_estadociviltipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_estadociviltipo> todo () {
        return (ArrayList<Ric_estadociviltipo>) repository.findAll();
    }

    public Ric_estadociviltipo ric_estadociviltipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}