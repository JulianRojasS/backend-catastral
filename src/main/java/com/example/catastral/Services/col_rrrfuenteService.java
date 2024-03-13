package com.example.catastral.Services;

import com.example.catastral.Entities.Col_rrrfuente;
import com.example.catastral.Repositories.col_rrrfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_rrrfuenteService {
    private col_rrrfuenteRepository repository;

    public col_rrrfuenteService (col_rrrfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_rrrfuente> todo () {
        return (ArrayList<Col_rrrfuente>) repository.findAll();
    }

    public Col_rrrfuente col_rrrfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public ArrayList<Col_rrrfuente> col_rrrfuenteDerecho (Integer t_id) {
        ArrayList<Col_rrrfuente> colRrrfuentes = this.todo();
        ArrayList<Col_rrrfuente> response = new ArrayList<Col_rrrfuente>();
        for (Col_rrrfuente col_rrrfuente : colRrrfuentes) {
            if (col_rrrfuente.getRic_derecho().getT_id().equals(t_id)) {
                response.add(col_rrrfuente);
            }
        }
        return response;
    }
    public boolean eliminar (Integer t_id) {
        if (repository.findById(t_id).isPresent()) {
            repository.deleteById(t_id);
            return repository.findById(t_id).isEmpty();
        } else {
            return false;
        }
    }
    public Col_rrrfuente crear (Col_rrrfuente col_rrrfuente) {
        if (col_rrrfuente.getRic_derecho() != null && col_rrrfuente.getRic_fuenteadministrativa() != null) {
            repository.save(col_rrrfuente);
            if (repository.findById(col_rrrfuente.getT_id()).isPresent()) {
                return repository.findById(col_rrrfuente.getT_id()).get();
            } else {
                return new Col_rrrfuente();
            }
        } else {
            return new Col_rrrfuente();
        }
    }
}