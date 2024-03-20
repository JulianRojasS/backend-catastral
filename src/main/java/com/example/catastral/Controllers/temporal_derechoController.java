package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_derecho;
import com.example.catastral.Services.temporal_derechoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_derechoController {

    private temporal_derechoService service;

    public temporal_derechoController(temporal_derechoService service){
        this.service = service;
    }

    @GetMapping("/temporal_derechos")
    public ArrayList<Temporal_derecho> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_derecho/{t_id}")
    public Temporal_derecho temporal_derecho (@PathVariable("t_id") Integer t_id) {
        return service.temporal_derecho(t_id);
    }
}