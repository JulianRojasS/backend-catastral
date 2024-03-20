package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_destinacioneconomicatipo;
import com.example.catastral.Services.temporal_destinacioneconomicatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_destinacioneconomicatipoController {

    private temporal_destinacioneconomicatipoService service;

    public temporal_destinacioneconomicatipoController(temporal_destinacioneconomicatipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_destinacioneconomicatipos")
    public ArrayList<Temporal_destinacioneconomicatipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_destinacioneconomicatipo/{t_id}")
    public Temporal_destinacioneconomicatipo temporal_destinacioneconomicatipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_destinacioneconomicatipo(t_id);
    }
}