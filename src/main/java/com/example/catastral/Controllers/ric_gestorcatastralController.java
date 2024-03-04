package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_gestorcatastral;
import com.example.catastral.Services.ric_gestorcatastralService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_gestorcatastralController {

    private ric_gestorcatastralService service;

    public ric_gestorcatastralController(ric_gestorcatastralService service){
        this.service = service;
    }

    @GetMapping("/ric_gestorcatastrals")
    public ArrayList<Ric_gestorcatastral> todo () {
        return service.todo();
    }

    @GetMapping("/ric_gestorcatastral/{t_id}")
    public Ric_gestorcatastral ric_gestorcatastral (@PathVariable("t_id") Integer t_id) {
        return service.ric_gestorcatastral(t_id);
    }
}