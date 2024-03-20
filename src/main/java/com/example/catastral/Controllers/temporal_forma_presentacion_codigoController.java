package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_forma_presentacion_codigo;
import com.example.catastral.Services.temporal_forma_presentacion_codigoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_forma_presentacion_codigoController {

    private temporal_forma_presentacion_codigoService service;

    public temporal_forma_presentacion_codigoController(temporal_forma_presentacion_codigoService service){
        this.service = service;
    }

    @GetMapping("/temporal_forma_presentacion_codigos")
    public ArrayList<Temporal_forma_presentacion_codigo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_forma_presentacion_codigo/{t_id}")
    public Temporal_forma_presentacion_codigo temporal_forma_presentacion_codigo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_forma_presentacion_codigo(t_id);
    }
}