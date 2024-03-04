package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_relacionfuente;
import com.example.catastral.Services.col_relacionfuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_relacionfuenteController {

    private col_relacionfuenteService service;

    public col_relacionfuenteController(col_relacionfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_relacionfuentes")
    public ArrayList<Col_relacionfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_relacionfuente/{t_id}")
    public Col_relacionfuente col_relacionfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_relacionfuente(t_id);
    }
}