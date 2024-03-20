package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_grupointeresadotipo;
import com.example.catastral.Services.temporal_grupointeresadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_grupointeresadotipoController {

    private temporal_grupointeresadotipoService service;

    public temporal_grupointeresadotipoController(temporal_grupointeresadotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_grupointeresadotipos")
    public ArrayList<Temporal_grupointeresadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_grupointeresadotipo/{t_id}")
    public Temporal_grupointeresadotipo temporal_grupointeresadotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_grupointeresadotipo(t_id);
    }
}