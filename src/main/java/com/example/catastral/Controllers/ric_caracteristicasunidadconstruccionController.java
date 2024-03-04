package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_caracteristicasunidadconstruccion;
import com.example.catastral.Services.ric_caracteristicasunidadconstruccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_caracteristicasunidadconstruccionController {

    private ric_caracteristicasunidadconstruccionService service;

    public ric_caracteristicasunidadconstruccionController(ric_caracteristicasunidadconstruccionService service){
        this.service = service;
    }

    @GetMapping("/ric_caracteristicasunidadconstruccions")
    public ArrayList<Ric_caracteristicasunidadconstruccion> todo () {
        return service.todo();
    }

    @GetMapping("/ric_caracteristicasunidadconstruccion/{t_id}")
    public Ric_caracteristicasunidadconstruccion ric_caracteristicasunidadconstruccion (@PathVariable("t_id") Integer t_id) {
        return service.ric_caracteristicasunidadconstruccion(t_id);
    }
}