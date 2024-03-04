package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_areatipo;
import com.example.catastral.Services.col_areatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_areatipoController {

    private col_areatipoService service;

    public col_areatipoController(col_areatipoService service){
        this.service = service;
    }

    @GetMapping("/col_areatipos")
    public ArrayList<Col_areatipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_areatipo/{t_id}")
    public Col_areatipo col_areatipo (@PathVariable("t_id") Integer t_id) {
        return service.col_areatipo(t_id);
    }
}