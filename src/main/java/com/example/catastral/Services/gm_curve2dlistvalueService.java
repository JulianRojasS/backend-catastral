package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_curve2dlistvalue;
import com.example.catastral.Repositories.gm_curve2dlistvalueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_curve2dlistvalueService {
    private gm_curve2dlistvalueRepository repository;

    public gm_curve2dlistvalueService (gm_curve2dlistvalueRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_curve2dlistvalue> todo () {
        return (ArrayList<Gm_curve2dlistvalue>) repository.findAll();
    }

    public Gm_curve2dlistvalue gm_curve2dlistvalue (Integer t_id) {
        return repository.findById(t_id).get();
    }
}