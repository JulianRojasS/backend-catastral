package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_responsablefuente;
import com.example.catastral.Services.col_responsablefuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_responsablefuenteController {

    private col_responsablefuenteService service;

    public col_responsablefuenteController(col_responsablefuenteService service){
        this.service = service;
    }

    @GetMapping("/col_responsablefuentes")
    public ArrayList<Col_responsablefuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_responsablefuente/{t_id}")
    public Col_responsablefuente col_responsablefuente (@PathVariable("t_id") Integer t_id) {
        return service.col_responsablefuente(t_id);
    }
}