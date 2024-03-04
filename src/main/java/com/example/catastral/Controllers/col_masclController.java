package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_mascl;
import com.example.catastral.Services.col_masclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_masclController {

    private col_masclService service;

    public col_masclController(col_masclService service){
        this.service = service;
    }

    @GetMapping("/col_mascls")
    public ArrayList<Col_mascl> todo () {
        return service.todo();
    }

    @GetMapping("/col_mascl/{t_id}")
    public Col_mascl col_mascl (@PathVariable("t_id") Integer t_id) {
        return service.col_mascl(t_id);
    }
}