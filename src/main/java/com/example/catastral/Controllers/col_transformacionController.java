package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_transformacion;
import com.example.catastral.Services.col_transformacionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_transformacionController {

    private col_transformacionService service;

    public col_transformacionController(col_transformacionService service){
        this.service = service;
    }

    @GetMapping("/col_transformacions")
    public ArrayList<Col_transformacion> todo () {
        return service.todo();
    }

    @GetMapping("/col_transformacion/{t_id}")
    public Col_transformacion col_transformacion (@PathVariable("t_id") Integer t_id) {
        return service.col_transformacion(t_id);
    }
}