package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extdireccion_clase_via_principal;
import com.example.catastral.Services.extdireccion_clase_via_principalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extdireccion_clase_via_principalController {

    private extdireccion_clase_via_principalService service;

    public extdireccion_clase_via_principalController(extdireccion_clase_via_principalService service){
        this.service = service;
    }

    @GetMapping("/extdireccion_clase_via_principals")
    public ArrayList<Extdireccion_clase_via_principal> todo () {
        return service.todo();
    }

    @GetMapping("/extdireccion_clase_via_principal/{t_id}")
    public Extdireccion_clase_via_principal extdireccion_clase_via_principal (@PathVariable("t_id") Integer t_id) {
        return service.extdireccion_clase_via_principal(t_id);
    }
}