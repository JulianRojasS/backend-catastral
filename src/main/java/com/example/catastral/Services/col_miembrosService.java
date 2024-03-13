package com.example.catastral.Services;

import com.example.catastral.Entities.Col_miembros;
import com.example.catastral.Entities.Ric_agrupacioninteresados;
import com.example.catastral.Repositories.col_miembrosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class col_miembrosService {
    private col_miembrosRepository repository;

    public col_miembrosService (col_miembrosRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_miembros> todo () {
        return (ArrayList<Col_miembros>) repository.findAll();
    }

    public Col_miembros col_miembros (Integer t_id) {
        return repository.findById(t_id).get();
    }
    public boolean eliminarPorAgrupacion (Integer t_id) {
        ArrayList<Col_miembros> col_miembros = this.todo();
        boolean response = true;
        for (Col_miembros miembros: col_miembros) {
            if (miembros.getRic_agrupacioni().getT_id().equals(t_id)) {
                repository.eliminar(miembros.getT_id());
                if (repository.findById(miembros.getT_id()).isPresent()) {
                    response = false;
                }
            }
        }
        return response;
    }

    public Integer col_miembrosInsertar (Col_miembros col_miembros) {
        col_miembros.setRic_agrupacioninteresados(new Ric_agrupacioninteresados());
        if (col_miembros.getParticipacion()!=null) {
            return repository.insertar(col_miembros.getRic_interesado().getT_id(), col_miembros.getRic_agrupacioni().getT_id(), col_miembros.getParticipacion());
        } else {
            return 0;
        }
    }
}