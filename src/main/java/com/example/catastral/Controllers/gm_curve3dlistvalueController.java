package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_curve3dlistvalue;
import com.example.catastral.Services.gm_curve3dlistvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_curve3dlistvalueController {

    private gm_curve3dlistvalueService service;

    public gm_curve3dlistvalueController(gm_curve3dlistvalueService service){
        this.service = service;
    }

    @GetMapping("/gm_curve3dlistvalues")
    public ArrayList<Gm_curve3dlistvalue> todo () {
        return service.todo();
    }

    @GetMapping("/gm_curve3dlistvalue/{t_id}")
    public Gm_curve3dlistvalue gm_curve3dlistvalue (@PathVariable("t_id") Integer t_id) {
        return service.gm_curve3dlistvalue(t_id);
    }
}