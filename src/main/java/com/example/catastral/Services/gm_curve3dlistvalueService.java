package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_curve3dlistvalue;
import com.example.catastral.Repositories.gm_curve3dlistvalueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_curve3dlistvalueService {
    private gm_curve3dlistvalueRepository repository;

    public gm_curve3dlistvalueService (gm_curve3dlistvalueRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_curve3dlistvalue> todo () {
        return (ArrayList<Gm_curve3dlistvalue>) repository.findAll();
    }

    public Gm_curve3dlistvalue gm_curve3dlistvalue (Integer t_id) {
        return repository.findById(t_id).get();
    }
}