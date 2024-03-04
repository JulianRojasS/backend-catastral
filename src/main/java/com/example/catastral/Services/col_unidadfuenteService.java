package com.example.catastral.Services;

import com.example.catastral.Entities.Col_unidadfuente;
import com.example.catastral.Entities.Ric_fuenteadministrativa;
import com.example.catastral.Repositories.col_unidadfuenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_unidadfuenteService {
    private col_unidadfuenteRepository repository;

    public col_unidadfuenteService (col_unidadfuenteRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_unidadfuente> todo () {
        return (ArrayList<Col_unidadfuente>) repository.findAll();
    }

    public Col_unidadfuente col_unidadfuente (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public ArrayList<Ric_fuenteadministrativa> fuenteAdministrativaPredio (Integer t_id) {
        ArrayList<Col_unidadfuente> unidadfuentes = this.todo();
        ArrayList<Ric_fuenteadministrativa> response = new ArrayList<Ric_fuenteadministrativa>();
        for (Col_unidadfuente unidadfuente: unidadfuentes) {
            if (unidadfuente.getRic_predio().getT_id().equals(t_id)) {
                response.add(unidadfuente.getRic_fuenteadministrativa());
            }
        }
        return response;
    }
}