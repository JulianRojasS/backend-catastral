package com.example.catastral.Services;

import com.example.catastral.Entities.Extdireccion_clase_via_principal;
import com.example.catastral.Repositories.extdireccion_clase_via_principalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extdireccion_clase_via_principalService {
    private extdireccion_clase_via_principalRepository repository;

    public extdireccion_clase_via_principalService (extdireccion_clase_via_principalRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extdireccion_clase_via_principal> todo () {
        return (ArrayList<Extdireccion_clase_via_principal>) repository.findAll();
    }

    public Extdireccion_clase_via_principal extdireccion_clase_via_principal (Integer t_id) {
        return repository.findById(t_id).get();
    }
}