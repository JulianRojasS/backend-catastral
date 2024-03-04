package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_surface3dlistvalue;
import com.example.catastral.Services.gm_surface3dlistvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_surface3dlistvalueController {

    private gm_surface3dlistvalueService service;

    public gm_surface3dlistvalueController(gm_surface3dlistvalueService service){
        this.service = service;
    }

    @GetMapping("/gm_surface3dlistvalues")
    public ArrayList<Gm_surface3dlistvalue> todo () {
        return service.todo();
    }

    @GetMapping("/gm_surface3dlistvalue/{t_id}")
    public Gm_surface3dlistvalue gm_surface3dlistvalue (@PathVariable("t_id") Integer t_id) {
        return service.gm_surface3dlistvalue(t_id);
    }
}