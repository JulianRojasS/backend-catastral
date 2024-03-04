package com.example.catastral.Controllers;

import com.example.catastral.Entities.Gm_multisurface3d;
import com.example.catastral.Services.gm_multisurface3dService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class gm_multisurface3dController {

    private gm_multisurface3dService service;

    public gm_multisurface3dController(gm_multisurface3dService service){
        this.service = service;
    }

    @GetMapping("/gm_multisurface3ds")
    public ArrayList<Gm_multisurface3d> todo () {
        return service.todo();
    }

    @GetMapping("/gm_multisurface3d/{t_id}")
    public Gm_multisurface3d gm_multisurface3d (@PathVariable("t_id") Integer t_id) {
        return service.gm_multisurface3d(t_id);
    }
}