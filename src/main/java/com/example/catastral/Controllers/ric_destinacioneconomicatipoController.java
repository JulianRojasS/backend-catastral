package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_destinacioneconomicatipo;
import com.example.catastral.Services.ric_destinacioneconomicatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_destinacioneconomicatipoController {

    private ric_destinacioneconomicatipoService service;

    public ric_destinacioneconomicatipoController(ric_destinacioneconomicatipoService service){
        this.service = service;
    }

    @GetMapping("/ric_destinacioneconomicatipos")
    public ArrayList<Ric_destinacioneconomicatipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_destinacioneconomicatipo/{t_id}")
    public Ric_destinacioneconomicatipo ric_destinacioneconomicatipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_destinacioneconomicatipo(t_id);
    }
}