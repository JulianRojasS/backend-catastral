package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_punto;
import com.example.catastral.Services.ric_nu_puntoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_puntoController {

    private ric_nu_puntoService service;

    public ric_nu_puntoController(ric_nu_puntoService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_puntos")
    public ArrayList<Ric_nu_punto> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_punto/{t_id}")
    public Ric_nu_punto ric_nu_punto (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_punto(t_id);
    }
}