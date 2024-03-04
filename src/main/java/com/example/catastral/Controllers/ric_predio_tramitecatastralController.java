package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_predio_tramitecatastral;
import com.example.catastral.Services.ric_predio_tramitecatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_predio_tramitecatastralController {

    private ric_predio_tramitecatastralService service;

    public ric_predio_tramitecatastralController(ric_predio_tramitecatastralService service){
        this.service = service;
    }

    @GetMapping("/ric_predio_tramitecatastrals")
    public ArrayList<Ric_predio_tramitecatastral> todo () {
        return service.todo();
    }

    @GetMapping("/ric_predio_tramitecatastral/{t_id}")
    public Ric_predio_tramitecatastral ric_predio_tramitecatastral (@PathVariable("t_id") Integer t_id) {
        return service.ric_predio_tramitecatastral(t_id);
    }
}