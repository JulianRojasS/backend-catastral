package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_fuenteadministrativatipo;
import com.example.catastral.Services.temporal_fuenteadministrativatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_fuenteadministrativatipoController {

    private temporal_fuenteadministrativatipoService service;

    public temporal_fuenteadministrativatipoController(temporal_fuenteadministrativatipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_fuenteadministrativatipos")
    public ArrayList<Temporal_fuenteadministrativatipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_fuenteadministrativatipo/{t_id}")
    public Temporal_fuenteadministrativatipo temporal_fuenteadministrativatipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_fuenteadministrativatipo(t_id);
    }
}