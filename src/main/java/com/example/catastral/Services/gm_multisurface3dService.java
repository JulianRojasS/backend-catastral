package com.example.catastral.Services;

import com.example.catastral.Entities.Gm_multisurface3d;
import com.example.catastral.Repositories.gm_multisurface3dRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class gm_multisurface3dService {
    private gm_multisurface3dRepository repository;

    public gm_multisurface3dService (gm_multisurface3dRepository repository){
        this.repository = repository;
    }

    public ArrayList<Gm_multisurface3d> todo () {
        return (ArrayList<Gm_multisurface3d>) repository.findAll();
    }

    public Gm_multisurface3d gm_multisurface3d (Integer t_id) {
        return repository.findById(t_id).get();
    }
}