package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_metodoproducciontipo;
import com.example.catastral.Services.col_metodoproducciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_metodoproducciontipoController {

    private col_metodoproducciontipoService service;

    public col_metodoproducciontipoController(col_metodoproducciontipoService service){
        this.service = service;
    }

    @GetMapping("/col_metodoproducciontipos")
    public ArrayList<Col_metodoproducciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_metodoproducciontipo/{t_id}")
    public Col_metodoproducciontipo col_metodoproducciontipo (@PathVariable("t_id") Integer t_id) {
        return service.col_metodoproducciontipo(t_id);
    }
}