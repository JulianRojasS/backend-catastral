package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_miembros;
import com.example.catastral.Services.temporal_miembrosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_miembrosController {

    private temporal_miembrosService service;

    public temporal_miembrosController(temporal_miembrosService service){
        this.service = service;
    }

    @GetMapping("/temporal_miembross")
    public ArrayList<Temporal_miembros> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_miembros/{t_id}")
    public Temporal_miembros temporal_miembros (@PathVariable("t_id") Integer t_id) {
        return service.temporal_miembros(t_id);
    }
}