package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_caraslindero;
import com.example.catastral.Services.ric_nu_caraslinderoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_caraslinderoController {

    private ric_nu_caraslinderoService service;

    public ric_nu_caraslinderoController(ric_nu_caraslinderoService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_caraslinderos")
    public ArrayList<Ric_nu_caraslindero> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_caraslindero/{t_id}")
    public Ric_nu_caraslindero ric_nu_caraslindero (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_caraslindero(t_id);
    }
}