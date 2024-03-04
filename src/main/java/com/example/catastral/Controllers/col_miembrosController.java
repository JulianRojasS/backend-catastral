package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_miembros;
import com.example.catastral.Services.col_miembrosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_miembrosController {

    private col_miembrosService service;

    public col_miembrosController(col_miembrosService service){
        this.service = service;
    }

    @GetMapping("/col_miembross")
    public ArrayList<Col_miembros> todo () {
        return service.todo();
    }

    @GetMapping("/col_miembros/{t_id}")
    public Col_miembros col_miembros (@PathVariable("t_id") Integer t_id) {
        return service.col_miembros(t_id);
    }
}