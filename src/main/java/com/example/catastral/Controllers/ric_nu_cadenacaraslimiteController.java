package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_cadenacaraslimite;
import com.example.catastral.Services.ric_nu_cadenacaraslimiteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_cadenacaraslimiteController {

    private ric_nu_cadenacaraslimiteService service;

    public ric_nu_cadenacaraslimiteController(ric_nu_cadenacaraslimiteService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_cadenacaraslimites")
    public ArrayList<Ric_nu_cadenacaraslimite> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_cadenacaraslimite/{t_id}")
    public Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_cadenacaraslimite(t_id);
    }
}