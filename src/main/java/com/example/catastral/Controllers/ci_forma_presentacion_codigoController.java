package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ci_forma_presentacion_codigo;
import com.example.catastral.Services.ci_forma_presentacion_codigoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ci_forma_presentacion_codigoController {

    private ci_forma_presentacion_codigoService service;

    public ci_forma_presentacion_codigoController(ci_forma_presentacion_codigoService service){
        this.service = service;
    }

    @GetMapping("/ci_forma_presentacion_codigos")
    public ArrayList<Ci_forma_presentacion_codigo> todo () {
        return service.todo();
    }

    @GetMapping("/ci_forma_presentacion_codigo/{t_id}")
    public Ci_forma_presentacion_codigo ci_forma_presentacion_codigo (@PathVariable("t_id") Integer t_id) {
        return service.ci_forma_presentacion_codigo(t_id);
    }
}