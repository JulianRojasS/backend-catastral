package com.example.catastral.Controllers;

import com.example.catastral.Entities.Control_cambios;
import com.example.catastral.Services.control_cambiosService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class control_cambiosController {

    private control_cambiosService service;

    public control_cambiosController(control_cambiosService service){
        this.service = service;
    }

    @GetMapping("/control_cambioss")
    public ArrayList<Control_cambios> todo () {
        return service.todo();
    }

    @GetMapping("/control_cambios/{t_id}")
    public Control_cambios control_cambios (@PathVariable("t_id") Integer t_id) {
        return service.control_cambios(t_id);
    }

    @PostMapping("/sendHistory")
    public boolean insertar (@RequestBody Control_cambios control_cambios) {
        return service.insertar(control_cambios);
    }
}