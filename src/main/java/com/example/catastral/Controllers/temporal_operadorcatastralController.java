package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_operadorcatastral;
import com.example.catastral.Services.temporal_operadorcatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_operadorcatastralController {

    private temporal_operadorcatastralService service;

    public temporal_operadorcatastralController(temporal_operadorcatastralService service){
        this.service = service;
    }

    @GetMapping("/temporal_operadorcatastrals")
    public ArrayList<Temporal_operadorcatastral> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_operadorcatastral/{t_id}")
    public Temporal_operadorcatastral temporal_operadorcatastral (@PathVariable("t_id") Integer t_id) {
        return service.temporal_operadorcatastral(t_id);
    }
}