package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_predio;
import com.example.catastral.Services.temporal_predioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_predioController {

    private temporal_predioService service;

    public temporal_predioController(temporal_predioService service){
        this.service = service;
    }

    @GetMapping("/temporal_predios")
    public ArrayList<Temporal_predio> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_predio/{t_id}")
    public Temporal_predio temporal_predio (@PathVariable("t_id") Integer t_id) {
        return service.temporal_predio(t_id);
    }
}