package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_rrrfuente;
import com.example.catastral.Services.col_rrrfuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_rrrfuenteController {

    private col_rrrfuenteService service;

    public col_rrrfuenteController(col_rrrfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_rrrfuentes")
    public ArrayList<Col_rrrfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_rrrfuente/{t_id}")
    public Col_rrrfuente col_rrrfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_rrrfuente(t_id);
    }
}