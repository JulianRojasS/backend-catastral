package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_unidadadministrativabasicatipo;
import com.example.catastral.Services.col_unidadadministrativabasicatipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_unidadadministrativabasicatipoController {

    private col_unidadadministrativabasicatipoService service;

    public col_unidadadministrativabasicatipoController(col_unidadadministrativabasicatipoService service){
        this.service = service;
    }

    @GetMapping("/col_unidadadministrativabasicatipos")
    public ArrayList<Col_unidadadministrativabasicatipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_unidadadministrativabasicatipo/{t_id}")
    public Col_unidadadministrativabasicatipo col_unidadadministrativabasicatipo (@PathVariable("t_id") Integer t_id) {
        return service.col_unidadadministrativabasicatipo(t_id);
    }
}