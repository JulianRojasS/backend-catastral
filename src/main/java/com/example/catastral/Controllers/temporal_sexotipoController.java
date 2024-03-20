package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_sexotipo;
import com.example.catastral.Services.temporal_sexotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_sexotipoController {

    private temporal_sexotipoService service;

    public temporal_sexotipoController(temporal_sexotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_sexotipos")
    public ArrayList<Temporal_sexotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_sexotipo/{t_id}")
    public Temporal_sexotipo temporal_sexotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_sexotipo(t_id);
    }
}