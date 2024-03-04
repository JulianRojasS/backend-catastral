package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_unidadconstruccion;
import com.example.catastral.Services.ric_unidadconstruccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_unidadconstruccionController {

    private ric_unidadconstruccionService service;

    public ric_unidadconstruccionController(ric_unidadconstruccionService service){
        this.service = service;
    }

    @GetMapping("/ric_unidadconstruccions")
    public ArrayList<Ric_unidadconstruccion> todo () {
        return service.todo();
    }

    @GetMapping("/ric_unidadconstruccion/{t_id}")
    public Ric_unidadconstruccion ric_unidadconstruccion (@PathVariable("t_id") Integer t_id) {
        return service.ric_unidadconstruccion(t_id);
    }
}