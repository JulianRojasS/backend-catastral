package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_multicurve3d;
import com.example.catastral.Services.gm_multicurve3dService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_multicurve3dController {

    private gm_multicurve3dService service;

    public gm_multicurve3dController(gm_multicurve3dService service){
        this.service = service;
    }

    @GetMapping("/gm_multicurve3ds")
    public ArrayList<Gm_multicurve3d> todo () {
        return service.todo();
    }

    @GetMapping("/gm_multicurve3d/{t_id}")
    public Gm_multicurve3d gm_multicurve3d (@PathVariable("t_id") Integer t_id) {
        return service.gm_multicurve3d(t_id);
    }
}