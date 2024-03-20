package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_gestorcatastral;
import com.example.catastral.Services.temporal_gestorcatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_gestorcatastralController {

    private temporal_gestorcatastralService service;

    public temporal_gestorcatastralController(temporal_gestorcatastralService service){
        this.service = service;
    }

    @GetMapping("/temporal_gestorcatastrals")
    public ArrayList<Temporal_gestorcatastral> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_gestorcatastral/{t_id}")
    public Temporal_gestorcatastral temporal_gestorcatastral (@PathVariable("t_id") Integer t_id) {
        return service.temporal_gestorcatastral(t_id);
    }
}