package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_puntoccl;
import com.example.catastral.Services.col_puntocclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_puntocclController {

    private col_puntocclService service;

    public col_puntocclController(col_puntocclService service){
        this.service = service;
    }

    @GetMapping("/col_puntoccls")
    public ArrayList<Col_puntoccl> todo () {
        return service.todo();
    }

    @GetMapping("/col_puntoccl/{t_id}")
    public Col_puntoccl col_puntoccl (@PathVariable("t_id") Integer t_id) {
        return service.col_puntoccl(t_id);
    }
}