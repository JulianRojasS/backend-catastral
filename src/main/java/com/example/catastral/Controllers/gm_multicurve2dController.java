package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_multicurve2d;
import com.example.catastral.Services.gm_multicurve2dService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_multicurve2dController {

    private gm_multicurve2dService service;

    public gm_multicurve2dController(gm_multicurve2dService service){
        this.service = service;
    }

    @GetMapping("/gm_multicurve2ds")
    public ArrayList<Gm_multicurve2d> todo () {
        return service.todo();
    }

    @GetMapping("/gm_multicurve2d/{t_id}")
    public Gm_multicurve2d gm_multicurve2d (@PathVariable("t_id") Integer t_id) {
        return service.gm_multicurve2d(t_id);
    }
}