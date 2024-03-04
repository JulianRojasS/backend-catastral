package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_estadotipo;
import com.example.catastral.Services.ric_estadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_estadotipoController {

    private ric_estadotipoService service;

    public ric_estadotipoController(ric_estadotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_estadotipos")
    public ArrayList<Ric_estadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_estadotipo/{t_id}")
    public Ric_estadotipo ric_estadotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_estadotipo(t_id);
    }
}