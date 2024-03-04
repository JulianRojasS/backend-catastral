package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_relacionnecesariaunidadesespaciales;
import com.example.catastral.Services.ric_nu_relacionnecesariaunidadesespacialesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_relacionnecesariaunidadesespacialesController {

    private ric_nu_relacionnecesariaunidadesespacialesService service;

    public ric_nu_relacionnecesariaunidadesespacialesController(ric_nu_relacionnecesariaunidadesespacialesService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_relacionnecesariaunidadesespacialess")
    public ArrayList<Ric_nu_relacionnecesariaunidadesespaciales> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_relacionnecesariaunidadesespaciales/{t_id}")
    public Ric_nu_relacionnecesariaunidadesespaciales ric_nu_relacionnecesariaunidadesespaciales (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_relacionnecesariaunidadesespaciales(t_id);
    }
}