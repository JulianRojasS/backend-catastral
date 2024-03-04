package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extarchivo;
import com.example.catastral.Services.extarchivoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extarchivoController {

    private extarchivoService service;

    public extarchivoController(extarchivoService service){
        this.service = service;
    }

    @GetMapping("/extarchivos")
    public ArrayList<Extarchivo> todo () {
        return service.todo();
    }

    @GetMapping("/extarchivo/{t_id}")
    public Extarchivo extarchivo (@PathVariable("t_id") Integer t_id) {
        return service.extarchivo(t_id);
    }
}