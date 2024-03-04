package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_construcciontipo;
import com.example.catastral.Services.ric_construcciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_construcciontipoController {

    private ric_construcciontipoService service;

    public ric_construcciontipoController(ric_construcciontipoService service){
        this.service = service;
    }

    @GetMapping("/ric_construcciontipos")
    public ArrayList<Ric_construcciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_construcciontipo/{t_id}")
    public Ric_construcciontipo ric_construcciontipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_construcciontipo(t_id);
    }
}