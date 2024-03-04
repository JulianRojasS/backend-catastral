package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_fuenteespacial;
import com.example.catastral.Services.ric_fuenteespacialService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_fuenteespacialController {

    private ric_fuenteespacialService service;

    public ric_fuenteespacialController(ric_fuenteespacialService service){
        this.service = service;
    }

    @GetMapping("/ric_fuenteespacials")
    public ArrayList<Ric_fuenteespacial> todo () {
        return service.todo();
    }

    @GetMapping("/ric_fuenteespacial/{t_id}")
    public Ric_fuenteespacial ric_fuenteespacial (@PathVariable("t_id") Integer t_id) {
        return service.ric_fuenteespacial(t_id);
    }
}