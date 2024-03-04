package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_espaciojuridicoredservicios;
import com.example.catastral.Services.ric_nu_espaciojuridicoredserviciosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_espaciojuridicoredserviciosController {

    private ric_nu_espaciojuridicoredserviciosService service;

    public ric_nu_espaciojuridicoredserviciosController(ric_nu_espaciojuridicoredserviciosService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_espaciojuridicoredservicioss")
    public ArrayList<Ric_nu_espaciojuridicoredservicios> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_espaciojuridicoredservicios/{t_id}")
    public Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_espaciojuridicoredservicios(t_id);
    }
}