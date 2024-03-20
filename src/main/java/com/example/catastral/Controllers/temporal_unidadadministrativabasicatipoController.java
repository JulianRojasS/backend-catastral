package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_unidadadministrativabasicatipo;
import com.example.catastral.Services.temporal_unidadadministrativabasicatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_unidadadministrativabasicatipoController {

    private temporal_unidadadministrativabasicatipoService service;

    public temporal_unidadadministrativabasicatipoController(temporal_unidadadministrativabasicatipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_unidadadministrativabasicatipos")
    public ArrayList<Temporal_unidadadministrativabasicatipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_unidadadministrativabasicatipo/{t_id}")
    public Temporal_unidadadministrativabasicatipo temporal_unidadadministrativabasicatipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_unidadadministrativabasicatipo(t_id);
    }
}