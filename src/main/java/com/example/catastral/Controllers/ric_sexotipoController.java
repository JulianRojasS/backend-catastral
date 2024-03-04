package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_sexotipo;
import com.example.catastral.Services.ric_sexotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_sexotipoController {

    private ric_sexotipoService service;

    public ric_sexotipoController(ric_sexotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_sexotipos")
    public ArrayList<Ric_sexotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_sexotipo/{t_id}")
    public Ric_sexotipo ric_sexotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_sexotipo(t_id);
    }
}