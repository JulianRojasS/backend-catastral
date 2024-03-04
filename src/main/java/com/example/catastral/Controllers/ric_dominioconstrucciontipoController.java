package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_dominioconstrucciontipo;
import com.example.catastral.Services.ric_dominioconstrucciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_dominioconstrucciontipoController {

    private ric_dominioconstrucciontipoService service;

    public ric_dominioconstrucciontipoController(ric_dominioconstrucciontipoService service){
        this.service = service;
    }

    @GetMapping("/ric_dominioconstrucciontipos")
    public ArrayList<Ric_dominioconstrucciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_dominioconstrucciontipo/{t_id}")
    public Ric_dominioconstrucciontipo ric_dominioconstrucciontipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_dominioconstrucciontipo(t_id);
    }
}