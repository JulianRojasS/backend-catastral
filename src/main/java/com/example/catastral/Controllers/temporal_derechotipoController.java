package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_derechotipo;
import com.example.catastral.Services.temporal_derechotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_derechotipoController {

    private temporal_derechotipoService service;

    public temporal_derechotipoController(temporal_derechotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_derechotipos")
    public ArrayList<Temporal_derechotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_derechotipo/{t_id}")
    public Temporal_derechotipo temporal_derechotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_derechotipo(t_id);
    }
}