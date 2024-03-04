package com.example.catastral.Services;

import com.example.catastral.Entities.Ric_nu_espaciojuridicounidadedificacion;
import com.example.catastral.Repositories.ric_nu_espaciojuridicounidadedificacionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ric_nu_espaciojuridicounidadedificacionService {
    private ric_nu_espaciojuridicounidadedificacionRepository repository;

    public ric_nu_espaciojuridicounidadedificacionService (ric_nu_espaciojuridicounidadedificacionRepository repository){
        this.repository = repository;
    }

    public ArrayList<Ric_nu_espaciojuridicounidadedificacion> todo () {
        return (ArrayList<Ric_nu_espaciojuridicounidadedificacion>) repository.findAll();
    }

    public Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion (Integer t_id) {
        return repository.findById(t_id).get();
    }
}