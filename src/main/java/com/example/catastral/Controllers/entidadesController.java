package com.example.catastral.Controllers;

import com.example.catastral.Entities.Entidades;
import com.example.catastral.Services.entidadesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class entidadesController {

    private entidadesService service;

    public entidadesController(entidadesService service){
        this.service = service;
    }

    @GetMapping("/entidadess")
    public ArrayList<Entidades> todo () {
        return service.todo();
    }

    @GetMapping("/entidades/{t_id}")
    public Entidades entidades (@PathVariable("t_id") Integer t_id) {
        return service.entidades(t_id);
    }
}