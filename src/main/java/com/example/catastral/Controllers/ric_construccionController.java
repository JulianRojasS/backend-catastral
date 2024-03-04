package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_construccion;
import com.example.catastral.Services.ric_construccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_construccionController {

    private ric_construccionService service;

    public ric_construccionController(ric_construccionService service){
        this.service = service;
    }

    @GetMapping("/ric_construccions")
    public ArrayList<Ric_construccion> todo () {
        return service.todo();
    }

    @GetMapping("/ric_construccion/{t_id}")
    public Ric_construccion ric_construccion (@PathVariable("t_id") Integer t_id) {
        return service.ric_construccion(t_id);
    }
}