package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_ueuegrupo;
import com.example.catastral.Services.col_ueuegrupoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_ueuegrupoController {

    private col_ueuegrupoService service;

    public col_ueuegrupoController(col_ueuegrupoService service){
        this.service = service;
    }

    @GetMapping("/col_ueuegrupos")
    public ArrayList<Col_ueuegrupo> todo () {
        return service.todo();
    }

    @GetMapping("/col_ueuegrupo/{t_id}")
    public Col_ueuegrupo col_ueuegrupo (@PathVariable("t_id") Integer t_id) {
        return service.col_ueuegrupo(t_id);
    }
}