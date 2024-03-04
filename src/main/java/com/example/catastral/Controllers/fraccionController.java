package com.example.catastral.Controllers;

import com.example.catastral.Entities.Fraccion;
import com.example.catastral.Services.fraccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class fraccionController {

    private fraccionService service;

    public fraccionController(fraccionService service){
        this.service = service;
    }

    @GetMapping("/fraccions")
    public ArrayList<Fraccion> todo () {
        return service.todo();
    }

    @GetMapping("/fraccion/{t_id}")
    public Fraccion fraccion (@PathVariable("t_id") Integer t_id) {
        return service.fraccion(t_id);
    }
}