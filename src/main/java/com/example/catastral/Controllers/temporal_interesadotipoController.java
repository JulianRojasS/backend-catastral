package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_interesadotipo;
import com.example.catastral.Services.temporal_interesadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_interesadotipoController {

    private temporal_interesadotipoService service;

    public temporal_interesadotipoController(temporal_interesadotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_interesadotipos")
    public ArrayList<Temporal_interesadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_interesadotipo/{t_id}")
    public Temporal_interesadotipo temporal_interesadotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_interesadotipo(t_id);
    }
}