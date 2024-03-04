package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_interesadodocumentotipo;
import com.example.catastral.Services.ric_interesadodocumentotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_interesadodocumentotipoController {

    private ric_interesadodocumentotipoService service;

    public ric_interesadodocumentotipoController(ric_interesadodocumentotipoService service){
        this.service = service;
    }

    @GetMapping("/ric_interesadodocumentotipos")
    public ArrayList<Ric_interesadodocumentotipo> todo () {
        return service.todo();
    }

    @GetMapping("/ric_interesadodocumentotipo/{t_id}")
    public Ric_interesadodocumentotipo ric_interesadodocumentotipo (@PathVariable("t_id") Integer t_id) {
        return service.ric_interesadodocumentotipo(t_id);
    }
}