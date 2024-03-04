package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_surface2dlistvalue;
import com.example.catastral.Services.gm_surface2dlistvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_surface2dlistvalueController {

    private gm_surface2dlistvalueService service;

    public gm_surface2dlistvalueController(gm_surface2dlistvalueService service){
        this.service = service;
    }

    @GetMapping("/gm_surface2dlistvalues")
    public ArrayList<Gm_surface2dlistvalue> todo () {
        return service.todo();
    }

    @GetMapping("/gm_surface2dlistvalue/{t_id}")
    public Gm_surface2dlistvalue gm_surface2dlistvalue (@PathVariable("t_id") Integer t_id) {
        return service.gm_surface2dlistvalue(t_id);
    }
}