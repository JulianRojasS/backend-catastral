package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_grupoetnicotipo;
import com.example.catastral.Services.ric_grupoetnicotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_grupoetnicotipoController {

    private ric_grupoetnicotipoService service;

    public ric_grupoetnicotipoController(ric_grupoetnicotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_grupoetnicotipos")
    public ArrayList<Ric_grupoetnicotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_grupoetnicotipo/{t_id}")
    public Ric_grupoetnicotipo ric_grupoetnicotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_grupoetnicotipo(t_id);
    }
}