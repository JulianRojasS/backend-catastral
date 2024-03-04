package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_interesadotipo;
import com.example.catastral.Services.ric_interesadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_interesadotipoController {

    private ric_interesadotipoService service;

    public ric_interesadotipoController(ric_interesadotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_interesadotipos")
    public ArrayList<Ric_interesadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_interesadotipo/{t_id}")
    public Ric_interesadotipo ric_interesadotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_interesadotipo(t_id);
    }
}