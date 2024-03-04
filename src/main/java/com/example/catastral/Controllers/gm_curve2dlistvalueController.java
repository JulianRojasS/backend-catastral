package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_curve2dlistvalue;
import com.example.catastral.Services.gm_curve2dlistvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_curve2dlistvalueController {

    private gm_curve2dlistvalueService service;

    public gm_curve2dlistvalueController(gm_curve2dlistvalueService service){
        this.service = service;
    }

    @GetMapping("/gm_curve2dlistvalues")
    public ArrayList<Gm_curve2dlistvalue> todo () {
        return service.todo();
    }

    @GetMapping("/gm_curve2dlistvalue/{t_id}")
    public Gm_curve2dlistvalue gm_curve2dlistvalue (@PathVariable("t_id") Integer t_id) {
        return service.gm_curve2dlistvalue(t_id);
    }
}