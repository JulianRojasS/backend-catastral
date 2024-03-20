package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_condicionprediotipo;
import com.example.catastral.Services.temporal_condicionprediotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_condicionprediotipoController {

    private temporal_condicionprediotipoService service;

    public temporal_condicionprediotipoController(temporal_condicionprediotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_condicionprediotipos")
    public ArrayList<Temporal_condicionprediotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_condicionprediotipo/{t_id}")
    public Temporal_condicionprediotipo temporal_condicionprediotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_condicionprediotipo(t_id);
    }
}