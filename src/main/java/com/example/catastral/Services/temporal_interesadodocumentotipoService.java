package com.example.catastral.Services;

import com.example.catastral.Entities.Temporal_interesadodocumentotipo;
import com.example.catastral.Repositories.temporal_interesadodocumentotipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class temporal_interesadodocumentotipoService {
    private temporal_interesadodocumentotipoRepository repository;

    public temporal_interesadodocumentotipoService (temporal_interesadodocumentotipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Temporal_interesadodocumentotipo> todo () {
        return (ArrayList<Temporal_interesadodocumentotipo>) repository.findAll();
    }

    public Temporal_interesadodocumentotipo temporal_interesadodocumentotipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}