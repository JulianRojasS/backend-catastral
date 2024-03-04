package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_usouconstipo;
import com.example.catastral.Services.ric_usouconstipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_usouconstipoController {

    private ric_usouconstipoService service;

    public ric_usouconstipoController(ric_usouconstipoService service){
        this.service = service;
    }

    @GetMapping("/ric_usouconstipos")
    public ArrayList<Ric_usouconstipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_usouconstipo/{t_id}")
    public Ric_usouconstipo ric_usouconstipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_usouconstipo(t_id);
    }
}