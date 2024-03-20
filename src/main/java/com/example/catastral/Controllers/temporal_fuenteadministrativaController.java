package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_fuenteadministrativa;
import com.example.catastral.Services.temporal_fuenteadministrativaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_fuenteadministrativaController {

    private temporal_fuenteadministrativaService service;

    public temporal_fuenteadministrativaController(temporal_fuenteadministrativaService service){
        this.service = service;
    }

    @GetMapping("/temporal_fuenteadministrativas")
    public ArrayList<Temporal_fuenteadministrativa> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_fuenteadministrativa/{t_id}")
    public Temporal_fuenteadministrativa temporal_fuenteadministrativa (@PathVariable("t_id") Integer t_id) {
        return service.temporal_fuenteadministrativa(t_id);
    }
}