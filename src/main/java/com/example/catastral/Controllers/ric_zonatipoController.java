package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_zonatipo;
import com.example.catastral.Services.ric_zonatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_zonatipoController {

    private ric_zonatipoService service;

    public ric_zonatipoController(ric_zonatipoService service){
        this.service = service;
    }

    @GetMapping("/ric_zonatipos")
    public ArrayList<Ric_zonatipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_zonatipo/{t_id}")
    public Ric_zonatipo ric_zonatipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_zonatipo(t_id);
    }
}