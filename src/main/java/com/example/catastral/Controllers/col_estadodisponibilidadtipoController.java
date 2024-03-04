package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_estadodisponibilidadtipo;
import com.example.catastral.Services.col_estadodisponibilidadtipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_estadodisponibilidadtipoController {

    private col_estadodisponibilidadtipoService service;

    public col_estadodisponibilidadtipoController(col_estadodisponibilidadtipoService service){
        this.service = service;
    }

    @GetMapping("/col_estadodisponibilidadtipos")
    public ArrayList<Col_estadodisponibilidadtipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_estadodisponibilidadtipo/{t_id}")
    public Col_estadodisponibilidadtipo col_estadodisponibilidadtipo (@PathVariable("t_id") Integer t_id) {
        return service.col_estadodisponibilidadtipo(t_id);
    }
}