package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_topografofuente;
import com.example.catastral.Services.col_topografofuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_topografofuenteController {

    private col_topografofuenteService service;

    public col_topografofuenteController(col_topografofuenteService service){
        this.service = service;
    }

    @GetMapping("/col_topografofuentes")
    public ArrayList<Col_topografofuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_topografofuente/{t_id}")
    public Col_topografofuente col_topografofuente (@PathVariable("t_id") Integer t_id) {
        return service.col_topografofuente(t_id);
    }
}