package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_clfuente;
import com.example.catastral.Services.col_clfuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_clfuenteController {

    private col_clfuenteService service;

    public col_clfuenteController(col_clfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_clfuentes")
    public ArrayList<Col_clfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_clfuente/{t_id}")
    public Col_clfuente col_clfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_clfuente(t_id);
    }
}