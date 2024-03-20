package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_grupoetnicotipo;
import com.example.catastral.Services.temporal_grupoetnicotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_grupoetnicotipoController {

    private temporal_grupoetnicotipoService service;

    public temporal_grupoetnicotipoController(temporal_grupoetnicotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_grupoetnicotipos")
    public ArrayList<Temporal_grupoetnicotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_grupoetnicotipo/{t_id}")
    public Temporal_grupoetnicotipo temporal_grupoetnicotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_grupoetnicotipo(t_id);
    }
}