package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_multisurface2d;
import com.example.catastral.Services.gm_multisurface2dService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_multisurface2dController {

    private gm_multisurface2dService service;

    public gm_multisurface2dController(gm_multisurface2dService service){
        this.service = service;
    }

    @GetMapping("/gm_multisurface2ds")
    public ArrayList<Gm_multisurface2d> todo () {
        return service.todo();
    }

    @GetMapping("/gm_multisurface2d/{t_id}")
    public Gm_multisurface2d gm_multisurface2d (@PathVariable("t_id") Integer t_id) {
        return service.gm_multisurface2d(t_id);
    }
}