package com.example.catastral.Controllers;

import com.example.catastral.Entities.Imagen;
import com.example.catastral.Services.imagenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class imagenController {

    private imagenService service;

    public imagenController(imagenService service){
        this.service = service;
    }

    @GetMapping("/imagens")
    public ArrayList<Imagen> todo () {
        return service.todo();
    }

    @GetMapping("/imagen/{t_id}")
    public Imagen imagen (@PathVariable("t_id") Integer t_id) {
        return service.imagen(t_id);
    }
}