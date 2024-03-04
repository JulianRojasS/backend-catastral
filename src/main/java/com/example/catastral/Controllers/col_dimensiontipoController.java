package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_dimensiontipo;
import com.example.catastral.Services.col_dimensiontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_dimensiontipoController {

    private col_dimensiontipoService service;

    public col_dimensiontipoController(col_dimensiontipoService service){
        this.service = service;
    }

    @GetMapping("/col_dimensiontipos")
    public ArrayList<Col_dimensiontipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_dimensiontipo/{t_id}")
    public Col_dimensiontipo col_dimensiontipo (@PathVariable("t_id") Integer t_id) {
        return service.col_dimensiontipo(t_id);
    }
}