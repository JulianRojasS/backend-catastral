package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_agrupacioninteresados;
import com.example.catastral.Entities.Ric_derecho;
import com.example.catastral.Entities.Ric_interesado;
import com.example.catastral.Repositories.ric_derechoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_derechoService {
    private ric_derechoRepository repository;

    public ric_derechoService (ric_derechoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_derecho> todo () {
        return (ArrayList<Ric_derecho>) repository.findAll();
    }

    public Ric_derecho ric_derecho (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public ArrayList<Ric_derecho> derechoPredio (Integer t_id) {
        ArrayList<Ric_derecho> derechos = this.todo();
        ArrayList<Ric_derecho> response = new ArrayList<Ric_derecho>();
        for (Ric_derecho derecho : derechos) {
            if (derecho.getRic_predio().getT_id().equals(t_id)) {
                response.add(derecho);
            }
        }
        return response;
    }

    public Boolean derechoActualizar (Ric_derecho derechonuevo) {
        boolean response = false;
        if (repository.findById(derechonuevo.getT_id()).isPresent()) {
            if (derechonuevo.getRic_agrupacioninteresados() == null) {
                repository.actualizarDerecho(derechonuevo.getRic_derechotipo().getT_id(), derechonuevo.getFraccion_derecho(), derechonuevo.getFecha_inicio_tenencia(), derechonuevo.getDescripcion(), derechonuevo.getRic_interesado().getT_id(), null, derechonuevo.getT_id());
                response = true;
            } else if (derechonuevo.getRic_interesado() == null) {
                repository.actualizarDerecho(derechonuevo.getRic_derechotipo().getT_id(), derechonuevo.getFraccion_derecho(), derechonuevo.getFecha_inicio_tenencia(), derechonuevo.getDescripcion(), null, derechonuevo.getRic_agrupacioninteresados().getT_id(), derechonuevo.getT_id());
                response = true;
            }
        }
        return response;
    }
}