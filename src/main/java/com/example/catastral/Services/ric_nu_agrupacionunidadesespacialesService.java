package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_agrupacionunidadesespaciales;
import com.example.catastral.Repositories.ric_nu_agrupacionunidadesespacialesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_agrupacionunidadesespacialesService {
    private ric_nu_agrupacionunidadesespacialesRepository repository;

    public ric_nu_agrupacionunidadesespacialesService (ric_nu_agrupacionunidadesespacialesRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_agrupacionunidadesespaciales> todo () {
        return (ArrayList<Ric_nu_agrupacionunidadesespaciales>) repository.findAll();
    }

    public Ric_nu_agrupacionunidadesespaciales ric_nu_agrupacionunidadesespaciales (Integer t_id) {
        return repository.findById(t_id).get();
    }
}