package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_multisurface2d;
import com.example.catastral.Repositories.gm_multisurface2dRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_multisurface2dService {
    private gm_multisurface2dRepository repository;

    public gm_multisurface2dService (gm_multisurface2dRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_multisurface2d> todo () {
        return (ArrayList<Gm_multisurface2d>) repository.findAll();
    }

    public Gm_multisurface2d gm_multisurface2d (Integer t_id) {
        return repository.findById(t_id).get();
    }
}