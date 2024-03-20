package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_estadodisponibilidadtipo;
import com.example.catastral.Services.temporal_estadodisponibilidadtipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_estadodisponibilidadtipoController {

    private temporal_estadodisponibilidadtipoService service;

    public temporal_estadodisponibilidadtipoController(temporal_estadodisponibilidadtipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_estadodisponibilidadtipos")
    public ArrayList<Temporal_estadodisponibilidadtipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_estadodisponibilidadtipo/{t_id}")
    public Temporal_estadodisponibilidadtipo temporal_estadodisponibilidadtipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_estadodisponibilidadtipo(t_id);
    }
}