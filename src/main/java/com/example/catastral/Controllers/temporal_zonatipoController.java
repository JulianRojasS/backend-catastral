package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_zonatipo;
import com.example.catastral.Services.temporal_zonatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_zonatipoController {

    private temporal_zonatipoService service;

    public temporal_zonatipoController(temporal_zonatipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_zonatipos")
    public ArrayList<Temporal_zonatipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_zonatipo/{t_id}")
    public Temporal_zonatipo temporal_zonatipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_zonatipo(t_id);
    }
}