package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_cclfuente;
import com.example.catastral.Services.col_cclfuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_cclfuenteController {

    private col_cclfuenteService service;

    public col_cclfuenteController(col_cclfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_cclfuentes")
    public ArrayList<Col_cclfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_cclfuente/{t_id}")
    public Col_cclfuente col_cclfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_cclfuente(t_id);
    }
}