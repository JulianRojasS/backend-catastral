package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_menoscl;
import com.example.catastral.Services.col_menosclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_menosclController {

    private col_menosclService service;

    public col_menosclController(col_menosclService service){
        this.service = service;
    }

    @GetMapping("/col_menoscls")
    public ArrayList<Col_menoscl> todo () {
        return service.todo();
    }

    @GetMapping("/col_menoscl/{t_id}")
    public Col_menoscl col_menoscl (@PathVariable("t_id") Integer t_id) {
        return service.col_menoscl(t_id);
    }
}