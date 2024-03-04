package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extdireccion_tipo_direccion;
import com.example.catastral.Services.extdireccion_tipo_direccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccion_tipo_direccionController {

    private extdireccion_tipo_direccionService service;

    public extdireccion_tipo_direccionController(extdireccion_tipo_direccionService service){
        this.service = service;
    }

    @GetMapping("/extdireccion_tipo_direccions")
    public ArrayList<Extdireccion_tipo_direccion> todo () {
        return service.todo();
    }

    @GetMapping("/extdireccion_tipo_direccion/{t_id}")
    public Extdireccion_tipo_direccion extdireccion_tipo_direccion (@PathVariable("t_id") Integer t_id) {
        return service.extdireccion_tipo_direccion(t_id);
    }
}