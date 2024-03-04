package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_nivel;
import com.example.catastral.Services.ric_nu_nivelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_nivelController {

    private ric_nu_nivelService service;

    public ric_nu_nivelController(ric_nu_nivelService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_nivels")
    public ArrayList<Ric_nu_nivel> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_nivel/{t_id}")
    public Ric_nu_nivel ric_nu_nivel (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_nivel(t_id);
    }
}