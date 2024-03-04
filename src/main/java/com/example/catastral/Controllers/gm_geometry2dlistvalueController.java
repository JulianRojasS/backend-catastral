package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_geometry2dlistvalue;
import com.example.catastral.Services.gm_geometry2dlistvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_geometry2dlistvalueController {

    private gm_geometry2dlistvalueService service;

    public gm_geometry2dlistvalueController(gm_geometry2dlistvalueService service){
        this.service = service;
    }

    @GetMapping("/gm_geometry2dlistvalues")
    public ArrayList<Gm_geometry2dlistvalue> todo () {
        return service.todo();
    }

    @GetMapping("/gm_geometry2dlistvalue/{t_id}")
    public Gm_geometry2dlistvalue gm_geometry2dlistvalue (@PathVariable("t_id") Integer t_id) {
        return service.gm_geometry2dlistvalue(t_id);
    }
}