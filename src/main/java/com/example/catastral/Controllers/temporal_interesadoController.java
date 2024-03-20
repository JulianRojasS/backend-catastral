package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_interesado;
import com.example.catastral.Services.temporal_interesadoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_interesadoController {

    private temporal_interesadoService service;

    public temporal_interesadoController(temporal_interesadoService service){
        this.service = service;
    }

    @GetMapping("/temporal_interesados")
    public ArrayList<Temporal_interesado> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_interesado/{t_id}")
    public Temporal_interesado temporal_interesado (@PathVariable("t_id") Integer t_id) {
        return service.temporal_interesado(t_id);
    }
}