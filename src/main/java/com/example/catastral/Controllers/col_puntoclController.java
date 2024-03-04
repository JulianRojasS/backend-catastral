package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_puntocl;
import com.example.catastral.Services.col_puntoclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_puntoclController {

    private col_puntoclService service;

    public col_puntoclController(col_puntoclService service){
        this.service = service;
    }

    @GetMapping("/col_puntocls")
    public ArrayList<Col_puntocl> todo () {
        return service.todo();
    }

    @GetMapping("/col_puntocl/{t_id}")
    public Col_puntocl col_puntocl (@PathVariable("t_id") Integer t_id) {
        return service.col_puntocl(t_id);
    }
}