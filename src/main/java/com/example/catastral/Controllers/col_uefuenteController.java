package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_uefuente;
import com.example.catastral.Services.col_uefuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_uefuenteController {

    private col_uefuenteService service;

    public col_uefuenteController(col_uefuenteService service){
        this.service = service;
    }

    @GetMapping("/col_uefuentes")
    public ArrayList<Col_uefuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_uefuente/{t_id}")
    public Col_uefuente col_uefuente (@PathVariable("t_id") Integer t_id) {
        return service.col_uefuente(t_id);
    }
}