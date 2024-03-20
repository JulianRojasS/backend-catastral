package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_estadociviltipo;
import com.example.catastral.Services.temporal_estadociviltipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_estadociviltipoController {

    private temporal_estadociviltipoService service;

    public temporal_estadociviltipoController(temporal_estadociviltipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_estadociviltipos")
    public ArrayList<Temporal_estadociviltipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_estadociviltipo/{t_id}")
    public Temporal_estadociviltipo temporal_estadociviltipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_estadociviltipo(t_id);
    }
}