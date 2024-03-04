package com.example.catastral.Services;

import com.example.catastral.Entities.Extdireccion;
import com.example.catastral.Repositories.extdireccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extdireccionService {
    private extdireccionRepository repository;

    public extdireccionService (extdireccionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extdireccion> todo () {
        return (ArrayList<Extdireccion>) repository.findAll();
    }

    public Extdireccion extdireccion (Integer t_id) {
        return repository.findById(t_id).get();
    }
    public ArrayList<Extdireccion> direccionPredio (Integer t_id) {
        ArrayList<Extdireccion> direcciones = this.todo();
        ArrayList<Extdireccion> response = new ArrayList<Extdireccion>();
        for (Extdireccion direccion : direcciones) {
            if (direccion.getRic_predio().getT_id().equals(t_id) && direccion != null) {
                response.add(direccion);
            }
        }
        return response;
    }
}