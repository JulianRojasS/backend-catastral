package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_espaciojuridicounidadedificacion;
import com.example.catastral.Services.ric_nu_espaciojuridicounidadedificacionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_espaciojuridicounidadedificacionController {

    private ric_nu_espaciojuridicounidadedificacionService service;

    public ric_nu_espaciojuridicounidadedificacionController(ric_nu_espaciojuridicounidadedificacionService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_espaciojuridicounidadedificacions")
    public ArrayList<Ric_nu_espaciojuridicounidadedificacion> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_espaciojuridicounidadedificacion/{t_id}")
    public Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_espaciojuridicounidadedificacion(t_id);
    }
}