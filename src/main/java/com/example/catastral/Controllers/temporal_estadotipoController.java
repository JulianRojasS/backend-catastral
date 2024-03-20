package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_estadotipo;
import com.example.catastral.Services.temporal_estadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_estadotipoController {

    private temporal_estadotipoService service;

    public temporal_estadotipoController(temporal_estadotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_estadotipos")
    public ArrayList<Temporal_estadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_estadotipo/{t_id}")
    public Temporal_estadotipo temporal_estadotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_estadotipo(t_id);
    }
}