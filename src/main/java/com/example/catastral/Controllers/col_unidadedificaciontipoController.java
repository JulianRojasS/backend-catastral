package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_unidadedificaciontipo;
import com.example.catastral.Services.col_unidadedificaciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_unidadedificaciontipoController {

    private col_unidadedificaciontipoService service;

    public col_unidadedificaciontipoController(col_unidadedificaciontipoService service){
        this.service = service;
    }

    @GetMapping("/col_unidadedificaciontipos")
    public ArrayList<Col_unidadedificaciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_unidadedificaciontipo/{t_id}")
    public Col_unidadedificaciontipo col_unidadedificaciontipo (@PathVariable("t_id") Integer t_id) {
        return service.col_unidadedificaciontipo(t_id);
    }
}