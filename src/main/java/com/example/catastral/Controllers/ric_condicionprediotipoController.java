package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_condicionprediotipo;
import com.example.catastral.Services.ric_condicionprediotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_condicionprediotipoController {

    private ric_condicionprediotipoService service;

    public ric_condicionprediotipoController(ric_condicionprediotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_condicionprediotipos")
    public ArrayList<Ric_condicionprediotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_condicionprediotipo/{t_id}")
    public Ric_condicionprediotipo ric_condicionprediotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_condicionprediotipo(t_id);
    }
}