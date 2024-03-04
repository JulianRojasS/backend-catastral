package com.example.catastral.Controllers;

import com.example.catastral.Entities.Cc_metodooperacion;
import com.example.catastral.Services.cc_metodooperacionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class cc_metodooperacionController {

    private cc_metodooperacionService service;

    public cc_metodooperacionController(cc_metodooperacionService service){
        this.service = service;
    }

    @GetMapping("/cc_metodooperacions")
    public ArrayList<Cc_metodooperacion> todo () {
        return service.todo();
    }

    @GetMapping("/cc_metodooperacion/{t_id}")
    public Cc_metodooperacion cc_metodooperacion (@PathVariable("t_id") Integer t_id) {
        return service.cc_metodooperacion(t_id);
    }
}