package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_interesadodocumentotipo;
import com.example.catastral.Repositories.ric_interesadodocumentotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_interesadodocumentotipoService {
    private ric_interesadodocumentotipoRepository repository;

    public ric_interesadodocumentotipoService (ric_interesadodocumentotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_interesadodocumentotipo> todo () {
        return (ArrayList<Ric_interesadodocumentotipo>) repository.findAll();
    }

    public Ric_interesadodocumentotipo ric_interesadodocumentotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}