package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_agrupacioninteresados;
import com.example.catastral.Services.temporal_agrupacioninteresadosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_agrupacioninteresadosController {

    private temporal_agrupacioninteresadosService service;

    public temporal_agrupacioninteresadosController(temporal_agrupacioninteresadosService service){
        this.service = service;
    }

    @GetMapping("/temporal_agrupacioninteresadoss")
    public ArrayList<Temporal_agrupacioninteresados> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_agrupacioninteresados/{t_id}")
    public Temporal_agrupacioninteresados temporal_agrupacioninteresados (@PathVariable("t_id") Integer t_id) {
        return service.temporal_agrupacioninteresados(t_id);
    }
}