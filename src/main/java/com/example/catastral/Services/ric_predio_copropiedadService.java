package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_predio_copropiedad;
import com.example.catastral.Repositories.ric_predio_copropiedadRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_predio_copropiedadService {
    private ric_predio_copropiedadRepository repository;

    public ric_predio_copropiedadService (ric_predio_copropiedadRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_predio_copropiedad> todo () {
        return (ArrayList<Ric_predio_copropiedad>) repository.findAll();
    }

    public Ric_predio_copropiedad ric_predio_copropiedad (Integer t_id) {
        return repository.findById(t_id).get();
    }
}