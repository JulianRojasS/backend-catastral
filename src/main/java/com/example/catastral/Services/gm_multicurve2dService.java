package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_multicurve2d;
import com.example.catastral.Repositories.gm_multicurve2dRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_multicurve2dService {
    private gm_multicurve2dRepository repository;

    public gm_multicurve2dService (gm_multicurve2dRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_multicurve2d> todo () {
        return (ArrayList<Gm_multicurve2d>) repository.findAll();
    }

    public Gm_multicurve2d gm_multicurve2d (Integer t_id) {
        return repository.findById(t_id).get();
    }
}