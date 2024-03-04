package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_puntofuente;
import com.example.catastral.Services.col_puntofuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_puntofuenteController {

    private col_puntofuenteService service;

    public col_puntofuenteController(col_puntofuenteService service){
        this.service = service;
    }

    @GetMapping("/col_puntofuentes")
    public ArrayList<Col_puntofuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_puntofuente/{t_id}")
    public Col_puntofuente col_puntofuente (@PathVariable("t_id") Integer t_id) {
        return service.col_puntofuente(t_id);
    }
}