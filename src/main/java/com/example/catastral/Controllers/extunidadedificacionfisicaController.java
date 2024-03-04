package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extunidadedificacionfisica;
import com.example.catastral.Services.extunidadedificacionfisicaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extunidadedificacionfisicaController {

    private extunidadedificacionfisicaService service;

    public extunidadedificacionfisicaController(extunidadedificacionfisicaService service){
        this.service = service;
    }

    @GetMapping("/extunidadedificacionfisicas")
    public ArrayList<Extunidadedificacionfisica> todo () {
        return service.todo();
    }

    @GetMapping("/extunidadedificacionfisica/{t_id}")
    public Extunidadedificacionfisica extunidadedificacionfisica (@PathVariable("t_id") Integer t_id) {
        return service.extunidadedificacionfisica(t_id);
    }
}