package com.example.catastral.Services;

import com.example.catastral.Entities.Extunidadedificacionfisica;
import com.example.catastral.Repositories.extunidadedificacionfisicaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class extunidadedificacionfisicaService {
    private extunidadedificacionfisicaRepository repository;

    public extunidadedificacionfisicaService (extunidadedificacionfisicaRepository repository){
        this.repository = repository;
    }

    public ArrayList<Extunidadedificacionfisica> todo () {
        return (ArrayList<Extunidadedificacionfisica>) repository.findAll();
    }

    public Extunidadedificacionfisica extunidadedificacionfisica (Integer t_id) {
        return repository.findById(t_id).get();
    }
}