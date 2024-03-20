package com.example.catastral.Controllers;

import com.example.catastral.Entities.Temporal_interesadodocumentotipo;
import com.example.catastral.Services.temporal_interesadodocumentotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class temporal_interesadodocumentotipoController {

    private temporal_interesadodocumentotipoService service;

    public temporal_interesadodocumentotipoController(temporal_interesadodocumentotipoService service){
        this.service = service;
    }

    @GetMapping("/temporal_interesadodocumentotipos")
    public ArrayList<Temporal_interesadodocumentotipo> todo () {
        return service.todo();
    }

    @GetMapping("/temporal_interesadodocumentotipo/{t_id}")
    public Temporal_interesadodocumentotipo temporal_interesadodocumentotipo (@PathVariable("t_id") Integer t_id) {
        return service.temporal_interesadodocumentotipo(t_id);
    }
}