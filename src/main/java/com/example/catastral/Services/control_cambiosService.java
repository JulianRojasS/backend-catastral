package com.example.catastral.Services;

import com.example.catastral.Entities.Control_cambios;
import com.example.catastral.Repositories.control_cambiosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class control_cambiosService {
    private control_cambiosRepository repository;

    public control_cambiosService (control_cambiosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Control_cambios> todo () {
        return (ArrayList<Control_cambios>) repository.findAll();
    }

    public Control_cambios control_cambios (Integer t_id) {
        return repository.findById(t_id).get();
    }
    public Boolean insertar (Control_cambios control_cambios) {
        if (control_cambios.getEntidades() != null && control_cambios.getestado_nuevo() != null) {
            repository.save(control_cambios);
            return repository.findById(control_cambios.getId()).isPresent();
        } else {
            return false;
        }
    }
    public ArrayList<Control_cambios> control_cambiosPorEntidad (Integer entidad) {
        ArrayList<Control_cambios> control_cambios = this.todo();
        ArrayList<Control_cambios> response = new ArrayList<Control_cambios>();
        for (Control_cambios cambios: control_cambios) {
            if (cambios.getEntidades().getId().equals(entidad)) {
                response.add(cambios);
            }
        }
        return response;
    }
}