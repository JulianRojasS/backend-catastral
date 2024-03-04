package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_surface2dlistvalue;
import com.example.catastral.Repositories.gm_surface2dlistvalueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_surface2dlistvalueService {
    private gm_surface2dlistvalueRepository repository;

    public gm_surface2dlistvalueService (gm_surface2dlistvalueRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_surface2dlistvalue> todo () {
        return (ArrayList<Gm_surface2dlistvalue>) repository.findAll();
    }

    public Gm_surface2dlistvalue gm_surface2dlistvalue (Integer t_id) {
        return repository.findById(t_id).get();
    }
}