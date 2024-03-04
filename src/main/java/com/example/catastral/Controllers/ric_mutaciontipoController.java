package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_mutaciontipo;
import com.example.catastral.Services.ric_mutaciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_mutaciontipoController {

    private ric_mutaciontipoService service;

    public ric_mutaciontipoController(ric_mutaciontipoService service){
        this.service = service;
    }

    @GetMapping("/ric_mutaciontipos")
    public ArrayList<Ric_mutaciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_mutaciontipo/{t_id}")
    public Ric_mutaciontipo ric_mutaciontipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_mutaciontipo(t_id);
    }
}