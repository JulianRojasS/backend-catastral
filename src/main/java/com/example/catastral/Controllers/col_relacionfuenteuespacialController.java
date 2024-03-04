package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_relacionfuenteuespacial;
import com.example.catastral.Services.col_relacionfuenteuespacialService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_relacionfuenteuespacialController {

    private col_relacionfuenteuespacialService service;

    public col_relacionfuenteuespacialController(col_relacionfuenteuespacialService service){
        this.service = service;
    }

    @GetMapping("/col_relacionfuenteuespacials")
    public ArrayList<Col_relacionfuenteuespacial> todo () {
        return service.todo();
    }

    @GetMapping("/col_relacionfuenteuespacial/{t_id}")
    public Col_relacionfuenteuespacial col_relacionfuenteuespacial (@PathVariable("t_id") Integer t_id) {
        return service.col_relacionfuenteuespacial(t_id);
    }
}