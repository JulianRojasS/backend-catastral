package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_predio;
import com.example.catastral.Services.ric_predioService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_predioController {

    private ric_predioService service;

    public ric_predioController(ric_predioService service){
        this.service = service;
    }

    @GetMapping("/ric_predios")
    public ArrayList<Ric_predio> todo () {
        return service.todo();
    }

    @PostMapping("/ric_predio/{t_id}")
    public Ric_predio ric_predio (@PathVariable("t_id") Integer t_id) {
        return service.ric_predio(t_id);
    }

    @PostMapping(path = "/prediosByLike/{column}/{value}")
    public List<Ric_predio> listByLike (@PathVariable("column") String column, @PathVariable("value") String value) {
        return service.predioByLike(column, value);
    }
    @PostMapping(path = "/predioDetalleInteresado/{t_id}")
    public List<Map<String, Object>> listDetalleInteresado (@PathVariable("t_id") Integer t_id) {
        return service.predioDetalleInteresado(t_id);
    }
}