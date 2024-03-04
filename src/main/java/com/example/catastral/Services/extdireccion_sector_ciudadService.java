package com.example.catastral.Services;

import com.example.catastral.Entities.Extdireccion_sector_ciudad;
import com.example.catastral.Repositories.extdireccion_sector_ciudadRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extdireccion_sector_ciudadService {
    private extdireccion_sector_ciudadRepository repository;

    public extdireccion_sector_ciudadService (extdireccion_sector_ciudadRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extdireccion_sector_ciudad> todo () {
        return (ArrayList<Extdireccion_sector_ciudad>) repository.findAll();
    }

    public Extdireccion_sector_ciudad extdireccion_sector_ciudad (Integer t_id) {
        return repository.findById(t_id).get();
    }
}