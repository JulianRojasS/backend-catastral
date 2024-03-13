package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_interesado;
import com.example.catastral.Entities.Ric_predio;
import com.example.catastral.Repositories.ric_predioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_predioService {
    private ric_predioRepository repository;

    public ric_predioService (ric_predioRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_predio> todo () {
        return (ArrayList<Ric_predio>) repository.findAll();
    }

    public Ric_predio ric_predio (Integer t_id) {
        return repository.findById(t_id).

                get();
    }

    public ArrayList<Ric_predio> predioByLike (String column, String value) {
        String uppervalue = "%"+ value.toUpperCase() +"%";
        if (column.equals("numero_predial")) {
            return repository.buscarPorNP(uppervalue);
        } else if (column.equals("numero_predial_anterior")) {
            return repository.buscarPorNPA(uppervalue);
        } else if (column.equals("matricula_inmobiliaria")) {
            return repository.buscarPorMI(uppervalue);
        } else if (column.equals("codigo_homologado")) {
            return  repository.buscarPorCH(uppervalue);
        }  else {
            return new ArrayList<Ric_predio>();
        }
    }

    public List<Map<String, Object>> predioDetalleInteresado (Integer t_id) {
        return repository.detalleConsultaInteresado(t_id);
    }
}