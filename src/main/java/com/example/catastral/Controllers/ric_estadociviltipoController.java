package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_estadociviltipo;
import com.example.catastral.Services.ric_estadociviltipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_estadociviltipoController {

    private ric_estadociviltipoService service;

    public ric_estadociviltipoController(ric_estadociviltipoService service){
        this.service = service;
    }

    @GetMapping("/ric_estadociviltipos")
    public ArrayList<Ric_estadociviltipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_estadociviltipo/{t_id}")
    public Ric_estadociviltipo ric_estadociviltipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_estadociviltipo(t_id);
    }
}