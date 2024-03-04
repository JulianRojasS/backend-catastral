package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_datosphcondominio;
import com.example.catastral.Services.ric_datosphcondominioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_datosphcondominioController {

    private ric_datosphcondominioService service;

    public ric_datosphcondominioController(ric_datosphcondominioService service){
        this.service = service;
    }

    @GetMapping("/ric_datosphcondominios")
    public ArrayList<Ric_datosphcondominio> todo () {
        return service.todo();
    }

    @GetMapping("/ric_datosphcondominio/{t_id}")
    public Ric_datosphcondominio ric_datosphcondominio (@PathVariable("t_id") Integer t_id) {
        return service.ric_datosphcondominio(t_id);
    }
}