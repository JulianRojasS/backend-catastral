package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_interesados;
import com.example.catastral.Services.temporal_interesadosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_interesadosController {

    private temporal_interesadosService service;

    public temporal_interesadosController(temporal_interesadosService service){
        this.service = service;
    }

    @GetMapping("/temporal_interesadoss")
    public ArrayList<Temporal_interesados> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_interesados/{t_id}")
    public Temporal_interesados temporal_interesados (@PathVariable("t_id") Integer t_id) {
        return service.temporal_interesados(t_id);
    }
}