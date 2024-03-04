package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_unidadconstrucciontipo;
import com.example.catastral.Services.ric_unidadconstrucciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_unidadconstrucciontipoController {

    private ric_unidadconstrucciontipoService service;

    public ric_unidadconstrucciontipoController(ric_unidadconstrucciontipoService service){
        this.service = service;
    }

    @GetMapping("/ric_unidadconstrucciontipos")
    public ArrayList<Ric_unidadconstrucciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_unidadconstrucciontipo/{t_id}")
    public Ric_unidadconstrucciontipo ric_unidadconstrucciontipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_unidadconstrucciontipo(t_id);
    }
}