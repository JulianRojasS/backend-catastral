package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_derecho;
import com.example.catastral.Services.ric_derechoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_derechoController {

    private ric_derechoService service;

    public ric_derechoController(ric_derechoService service){
        this.service = service;
    }

    @GetMapping("/ric_derechos")
    public ArrayList<Ric_derecho> todo () {
        return service.todo();
    }

    @GetMapping("/ric_derecho/{t_id}")
    public Ric_derecho ric_derecho (@PathVariable("t_id") Integer t_id) {
        return service.ric_derecho(t_id);
    }

    @GetMapping("/derechosPredio/{t_id}")
    public ArrayList<Ric_derecho> derechoPredio (@PathVariable("t_id") Integer t_id) {
        return service.derechoPredio(t_id);
    }
}