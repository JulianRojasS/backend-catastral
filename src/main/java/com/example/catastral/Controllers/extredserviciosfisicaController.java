package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extredserviciosfisica;
import com.example.catastral.Services.extredserviciosfisicaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extredserviciosfisicaController {

    private extredserviciosfisicaService service;

    public extredserviciosfisicaController(extredserviciosfisicaService service){
        this.service = service;
    }

    @GetMapping("/extredserviciosfisicas")
    public ArrayList<Extredserviciosfisica> todo () {
        return service.todo();
    }

    @GetMapping("/extredserviciosfisica/{t_id}")
    public Extredserviciosfisica extredserviciosfisica (@PathVariable("t_id") Integer t_id) {
        return service.extredserviciosfisica(t_id);
    }
}