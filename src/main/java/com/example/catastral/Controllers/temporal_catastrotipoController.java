package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_catastrotipo;
import com.example.catastral.Services.temporal_catastrotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_catastrotipoController {

    private temporal_catastrotipoService service;

    public temporal_catastrotipoController(temporal_catastrotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_catastrotipos")
    public ArrayList<Temporal_catastrotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_catastrotipo/{t_id}")
    public Temporal_catastrotipo temporal_catastrotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_catastrotipo(t_id);
    }
}