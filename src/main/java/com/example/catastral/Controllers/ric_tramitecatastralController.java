package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_tramitecatastral;
import com.example.catastral.Services.ric_tramitecatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_tramitecatastralController {

    private ric_tramitecatastralService service;

    public ric_tramitecatastralController(ric_tramitecatastralService service){
        this.service = service;
    }

    @GetMapping("/ric_tramitecatastrals")
    public ArrayList<Ric_tramitecatastral> todo () {
        return service.todo();
    }

    @GetMapping("/ric_tramitecatastral/{t_id}")
    public Ric_tramitecatastral ric_tramitecatastral (@PathVariable("t_id") Integer t_id) {
        return service.ric_tramitecatastral(t_id);
    }
}