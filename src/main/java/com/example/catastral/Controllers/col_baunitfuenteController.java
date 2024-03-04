package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_baunitfuente;
import com.example.catastral.Services.col_baunitfuenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_baunitfuenteController {

    private col_baunitfuenteService service;

    public col_baunitfuenteController(col_baunitfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_baunitfuentes")
    public ArrayList<Col_baunitfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_baunitfuente/{t_id}")
    public Col_baunitfuente col_baunitfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_baunitfuente(t_id);
    }
}