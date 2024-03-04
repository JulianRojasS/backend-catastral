package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_geometry2dlistvalue;
import com.example.catastral.Repositories.gm_geometry2dlistvalueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_geometry2dlistvalueService {
    private gm_geometry2dlistvalueRepository repository;

    public gm_geometry2dlistvalueService (gm_geometry2dlistvalueRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_geometry2dlistvalue> todo () {
        return (ArrayList<Gm_geometry2dlistvalue>) repository.findAll();
    }

    public Gm_geometry2dlistvalue gm_geometry2dlistvalue (Integer t_id) {
        return repository.findById(t_id).get();
    }
}