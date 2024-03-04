package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_relacionnecesariaunidadesespaciales;
import com.example.catastral.Repositories.ric_nu_relacionnecesariaunidadesespacialesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_relacionnecesariaunidadesespacialesService {
    private ric_nu_relacionnecesariaunidadesespacialesRepository repository;

    public ric_nu_relacionnecesariaunidadesespacialesService (ric_nu_relacionnecesariaunidadesespacialesRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_relacionnecesariaunidadesespaciales> todo () {
        return (ArrayList<Ric_nu_relacionnecesariaunidadesespaciales>) repository.findAll();
    }

    public Ric_nu_relacionnecesariaunidadesespaciales ric_nu_relacionnecesariaunidadesespaciales (Integer t_id) {
        return repository.findById(t_id).get();
    }
}