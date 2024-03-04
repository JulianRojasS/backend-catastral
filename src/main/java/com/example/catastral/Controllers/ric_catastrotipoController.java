package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_catastrotipo;
import com.example.catastral.Services.ric_catastrotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_catastrotipoController {

    private ric_catastrotipoService service;

    public ric_catastrotipoController(ric_catastrotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_catastrotipos")
    public ArrayList<Ric_catastrotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_catastrotipo/{t_id}")
    public Ric_catastrotipo ric_catastrotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_catastrotipo(t_id);
    }
}