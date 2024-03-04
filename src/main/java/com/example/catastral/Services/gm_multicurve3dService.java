package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_multicurve3d;
import com.example.catastral.Repositories.gm_multicurve3dRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_multicurve3dService {
    private gm_multicurve3dRepository repository;

    public gm_multicurve3dService (gm_multicurve3dRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_multicurve3d> todo () {
        return (ArrayList<Gm_multicurve3d>) repository.findAll();
    }

    public Gm_multicurve3d gm_multicurve3d (Integer t_id) {
        return repository.findById(t_id).get();
    }
}