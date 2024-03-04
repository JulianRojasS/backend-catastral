package com.example.catastral.Services;

import com.example.catastral.Entities.Col_unidadedificaciontipo;
import com.example.catastral.Repositories.col_unidadedificaciontipoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_unidadedificaciontipoService {
    private col_unidadedificaciontipoRepository repository;

    public col_unidadedificaciontipoService (col_unidadedificaciontipoRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_unidadedificaciontipo> todo () {
        return (ArrayList<Col_unidadedificaciontipo>) repository.findAll();
    }

    public Col_unidadedificaciontipo col_unidadedificaciontipo (Integer t_id) {
        return repository.findById(t_id).get();
    }
}