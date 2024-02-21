package com.example.catastral.Controllers;

import com.example.catastral.Entities.extdireccion;
import com.example.catastral.Services.extdireccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccionController {

    private extdireccionService service;

    public extdireccionController(extdireccionService service){
        this.service = service;
    }
}
