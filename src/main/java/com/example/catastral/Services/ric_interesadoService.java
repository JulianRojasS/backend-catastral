package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_interesado;
import com.example.catastral.Repositories.ric_interesadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_interesadoService {
    private ric_interesadoRepository repository;

    public ric_interesadoService (ric_interesadoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_interesado> todo () {
        return (ArrayList<Ric_interesado>) repository.findAll();
    }

    public Ric_interesado ric_interesado (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public List<Map<String, Object>> predioDetalle (Integer t_id) {
        return repository.detalleConsultaPredio(t_id);
    }

    public ArrayList<Ric_interesado> interesadoByLike (String column, String value) {
        String uppervalue = "%"+ value.toUpperCase() +"%";
        if (column.equals("nombre")) {
            return repository.buscarPorNombre(uppervalue);
        } else if (column.equals("documento_identidad")) {
            return repository.buscarPorDI(uppervalue);
        } else {
            return new ArrayList<Ric_interesado>();
        }
    }

    public Ric_interesado interesadoDocumento (String documento) {
        ArrayList<Ric_interesado> interesados = this.todo();
        Ric_interesado response = new Ric_interesado();
        for (Ric_interesado interesado : interesados) {
            if (interesado.getDocumento_identidad().equals(documento)) {
                response = interesado;
            }
        }
        return response;
    }
}