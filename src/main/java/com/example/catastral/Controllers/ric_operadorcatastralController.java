package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_operadorcatastral;
import com.example.catastral.Services.ric_operadorcatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_operadorcatastralController {

    private ric_operadorcatastralService service;

    public ric_operadorcatastralController(ric_operadorcatastralService service){
        this.service = service;
    }

    @GetMapping("/ric_operadorcatastrals")
    public ArrayList<Ric_operadorcatastral> todo () {
        return service.todo();
    }

    @GetMapping("/ric_operadorcatastral/{t_id}")
    public Ric_operadorcatastral ric_operadorcatastral (@PathVariable("t_id") Integer t_id) {
        return service.ric_operadorcatastral(t_id);
    }
}