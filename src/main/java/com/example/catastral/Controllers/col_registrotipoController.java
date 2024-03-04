package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_registrotipo;
import com.example.catastral.Services.col_registrotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_registrotipoController {

    private col_registrotipoService service;

    public col_registrotipoController(col_registrotipoService service){
        this.service = service;
    }

    @GetMapping("/col_registrotipos")
    public ArrayList<Col_registrotipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_registrotipo/{t_id}")
    public Col_registrotipo col_registrotipo (@PathVariable("t_id") Integer t_id) {
        return service.col_registrotipo(t_id);
    }
}