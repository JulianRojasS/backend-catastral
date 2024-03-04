package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_fuenteadministrativatipo;
import com.example.catastral.Services.col_fuenteadministrativatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_fuenteadministrativatipoController {

    private col_fuenteadministrativatipoService service;

    public col_fuenteadministrativatipoController(col_fuenteadministrativatipoService service){
        this.service = service;
    }

    @GetMapping("/col_fuenteadministrativatipos")
    public ArrayList<Col_fuenteadministrativatipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_fuenteadministrativatipo/{t_id}")
    public Col_fuenteadministrativatipo col_fuenteadministrativatipo (@PathVariable("t_id") Integer t_id) {
        return service.col_fuenteadministrativatipo(t_id);
    }
}