package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_grupointeresadotipo;
import com.example.catastral.Services.col_grupointeresadotipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_grupointeresadotipoController {

    private col_grupointeresadotipoService service;

    public col_grupointeresadotipoController(col_grupointeresadotipoService service){
        this.service = service;
    }

    @GetMapping("/col_grupointeresadotipos")
    public ArrayList<Col_grupointeresadotipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_grupointeresadotipo/{t_id}")
    public Col_grupointeresadotipo col_grupointeresadotipo (@PathVariable("t_id") Integer t_id) {
        return service.col_grupointeresadotipo(t_id);
    }
}