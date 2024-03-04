package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extdireccion_sector_predio;
import com.example.catastral.Services.extdireccion_sector_predioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccion_sector_predioController {

    private extdireccion_sector_predioService service;

    public extdireccion_sector_predioController(extdireccion_sector_predioService service){
        this.service = service;
    }

    @GetMapping("/extdireccion_sector_predios")
    public ArrayList<Extdireccion_sector_predio> todo () {
        return service.todo();
    }

    @GetMapping("/extdireccion_sector_predio/{t_id}")
    public Extdireccion_sector_predio extdireccion_sector_predio (@PathVariable("t_id") Integer t_id) {
        return service.extdireccion_sector_predio(t_id);
    }
}