package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extdireccion;
import com.example.catastral.Services.extdireccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccionController {

    private extdireccionService service;

    public extdireccionController(extdireccionService service){
        this.service = service;
    }

    @GetMapping("/extdireccions")
    public ArrayList<Extdireccion> todo () {
        return service.todo();
    }

    @GetMapping("/extdireccion/{t_id}")
    public Extdireccion extdireccion (@PathVariable("t_id") Integer t_id) {
        return service.extdireccion(t_id);
    }
    @GetMapping("/direccionesPredio/{t_id}")
    public ArrayList<Extdireccion> predioDirecciones (@PathVariable("t_id") Integer t_id) {
        return service.direccionPredio(t_id);
    }
}