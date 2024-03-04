package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_volumentipo;
import com.example.catastral.Services.col_volumentipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_volumentipoController {

    private col_volumentipoService service;

    public col_volumentipoController(col_volumentipoService service){
        this.service = service;
    }

    @GetMapping("/col_volumentipos")
    public ArrayList<Col_volumentipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_volumentipo/{t_id}")
    public Col_volumentipo col_volumentipo (@PathVariable("t_id") Integer t_id) {
        return service.col_volumentipo(t_id);
    }
}