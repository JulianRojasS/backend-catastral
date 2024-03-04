package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_predio_copropiedad;
import com.example.catastral.Services.ric_predio_copropiedadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_predio_copropiedadController {

    private ric_predio_copropiedadService service;

    public ric_predio_copropiedadController(ric_predio_copropiedadService service){
        this.service = service;
    }

    @GetMapping("/ric_predio_copropiedads")
    public ArrayList<Ric_predio_copropiedad> todo () {
        return service.todo();
    }

    @GetMapping("/ric_predio_copropiedad/{t_id}")
    public Ric_predio_copropiedad ric_predio_copropiedad (@PathVariable("t_id") Integer t_id) {
        return service.ric_predio_copropiedad(t_id);
    }
}