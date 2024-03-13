package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_fuenteadministrativa;
import com.example.catastral.Services.ric_fuenteadministrativaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_fuenteadministrativaController {

    private ric_fuenteadministrativaService service;

    public ric_fuenteadministrativaController(ric_fuenteadministrativaService service){
        this.service = service;
    }

    @GetMapping("/ric_fuenteadministrativas")
    public ArrayList<Ric_fuenteadministrativa> todo () {
        return service.todo();
    }

    @GetMapping("/ric_fuenteadministrativa/{t_id}")
    public Ric_fuenteadministrativa ric_fuenteadministrativa (@PathVariable("t_id") Integer t_id) {
        return service.ric_fuenteadministrativa(t_id);
    }
    @PostMapping(path = "/fuenteadministrativaInsertar")
    public Ric_fuenteadministrativa interesarFuenteadministrativa (@RequestBody Ric_fuenteadministrativa fuenteadministrativa) {
        return service.insertarFuenteadministrativa(fuenteadministrativa);
    }
}