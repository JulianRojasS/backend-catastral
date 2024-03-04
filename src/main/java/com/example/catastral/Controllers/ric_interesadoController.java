package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_interesado;
import com.example.catastral.Services.ric_interesadoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_interesadoController {

    private ric_interesadoService service;

    public ric_interesadoController(ric_interesadoService service){
        this.service = service;
    }

    @GetMapping("/ric_interesados")
    public ArrayList<Ric_interesado> todo () {
        return service.todo();
    }

    @PostMapping("/ric_interesado/{t_id}")
    public Ric_interesado ric_interesado (@PathVariable("t_id") Integer t_id) {
        return service.ric_interesado(t_id);
    }

    @PostMapping(path = "/interesadosByLike/{column}/{value}")
    public ArrayList<Ric_interesado> listByLike (@PathVariable("column") String column, @PathVariable("value") String value) {
        return service.interesadoByLike(column, value);
    }
}