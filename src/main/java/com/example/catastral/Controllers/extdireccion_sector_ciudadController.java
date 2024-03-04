package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extdireccion_sector_ciudad;
import com.example.catastral.Services.extdireccion_sector_ciudadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccion_sector_ciudadController {

    private extdireccion_sector_ciudadService service;

    public extdireccion_sector_ciudadController(extdireccion_sector_ciudadService service){
        this.service = service;
    }

    @GetMapping("/extdireccion_sector_ciudads")
    public ArrayList<Extdireccion_sector_ciudad> todo () {
        return service.todo();
    }

    @GetMapping("/extdireccion_sector_ciudad/{t_id}")
    public Extdireccion_sector_ciudad extdireccion_sector_ciudad (@PathVariable("t_id") Integer t_id) {
        return service.extdireccion_sector_ciudad(t_id);
    }
}