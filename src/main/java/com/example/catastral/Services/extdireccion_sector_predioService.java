package com.example.catastral.Services;

import com.example.catastral.Entities.Extdireccion_sector_predio;
import com.example.catastral.Repositories.extdireccion_sector_predioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extdireccion_sector_predioService {
    private extdireccion_sector_predioRepository repository;

    public extdireccion_sector_predioService (extdireccion_sector_predioRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extdireccion_sector_predio> todo () {
        return (ArrayList<Extdireccion_sector_predio>) repository.findAll();
    }

    public Extdireccion_sector_predio extdireccion_sector_predio (Integer t_id) {
        return repository.findById(t_id).get();
    }
}