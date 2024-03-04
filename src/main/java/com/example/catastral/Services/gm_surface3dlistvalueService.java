package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_surface3dlistvalue;
import com.example.catastral.Repositories.gm_surface3dlistvalueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_surface3dlistvalueService {
    private gm_surface3dlistvalueRepository repository;

    public gm_surface3dlistvalueService (gm_surface3dlistvalueRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_surface3dlistvalue> todo () {
        return (ArrayList<Gm_surface3dlistvalue>) repository.findAll();
    }

    public Gm_surface3dlistvalue gm_surface3dlistvalue (Integer t_id) {
        return repository.findById(t_id).get();
    }
}