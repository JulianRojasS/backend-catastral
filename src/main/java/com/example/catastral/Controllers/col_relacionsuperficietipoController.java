package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_relacionsuperficietipo;
import com.example.catastral.Services.col_relacionsuperficietipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_relacionsuperficietipoController {

    private col_relacionsuperficietipoService service;

    public col_relacionsuperficietipoController(col_relacionsuperficietipoService service){
        this.service = service;
    }

    @GetMapping("/col_relacionsuperficietipos")
    public ArrayList<Col_relacionsuperficietipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_relacionsuperficietipo/{t_id}")
    public Col_relacionsuperficietipo col_relacionsuperficietipo (@PathVariable("t_id") Integer t_id) {
        return service.col_relacionsuperficietipo(t_id);
    }
}