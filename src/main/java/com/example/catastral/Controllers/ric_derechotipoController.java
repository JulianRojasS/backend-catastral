package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_derechotipo;
import com.example.catastral.Services.ric_derechotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_derechotipoController {

    private ric_derechotipoService service;

    public ric_derechotipoController(ric_derechotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_derechotipos")
    public ArrayList<Ric_derechotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_derechotipo/{t_id}")
    public Ric_derechotipo ric_derechotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_derechotipo(t_id);
    }
}