package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_puntotipo;
import com.example.catastral.Services.col_puntotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_puntotipoController {

    private col_puntotipoService service;

    public col_puntotipoController(col_puntotipoService service){
        this.service = service;
    }

    @GetMapping("/col_puntotipos")
    public ArrayList<Col_puntotipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_puntotipo/{t_id}")
    public Col_puntotipo col_puntotipo (@PathVariable("t_id") Integer t_id) {
        return service.col_puntotipo(t_id);
    }
}