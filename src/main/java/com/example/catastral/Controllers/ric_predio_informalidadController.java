package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_predio_informalidad;
import com.example.catastral.Services.ric_predio_informalidadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_predio_informalidadController {

    private ric_predio_informalidadService service;

    public ric_predio_informalidadController(ric_predio_informalidadService service){
        this.service = service;
    }

    @GetMapping("/ric_predio_informalidads")
    public ArrayList<Ric_predio_informalidad> todo () {
        return service.todo();
    }

    @GetMapping("/ric_predio_informalidad/{t_id}")
    public Ric_predio_informalidad ric_predio_informalidad (@PathVariable("t_id") Integer t_id) {
        return service.ric_predio_informalidad(t_id);
    }
}