package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_relacionnecesariabaunits;
import com.example.catastral.Services.ric_nu_relacionnecesariabaunitsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_relacionnecesariabaunitsController {

    private ric_nu_relacionnecesariabaunitsService service;

    public ric_nu_relacionnecesariabaunitsController(ric_nu_relacionnecesariabaunitsService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_relacionnecesariabaunitss")
    public ArrayList<Ric_nu_relacionnecesariabaunits> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_relacionnecesariabaunits/{t_id}")
    public Ric_nu_relacionnecesariabaunits ric_nu_relacionnecesariabaunits (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_relacionnecesariabaunits(t_id);
    }
}