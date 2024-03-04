package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_agrupacioninteresados;
import com.example.catastral.Services.ric_agrupacioninteresadosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_agrupacioninteresadosController {

    private ric_agrupacioninteresadosService service;

    public ric_agrupacioninteresadosController(ric_agrupacioninteresadosService service){
        this.service = service;
    }

    @GetMapping("/ric_agrupacioninteresadoss")
    public ArrayList<Ric_agrupacioninteresados> todo () {
        return service.todo();
    }

    @GetMapping("/ric_agrupacioninteresados/{t_id}")
    public Ric_agrupacioninteresados ric_agrupacioninteresados (@PathVariable("t_id") Integer t_id) {
        return service.ric_agrupacioninteresados(t_id);
    }
}