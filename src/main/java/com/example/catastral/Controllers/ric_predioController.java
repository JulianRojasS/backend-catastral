package com.example.catastral.Controllers;

import com.example.catastral.Entities.ric_predio;
import com.example.catastral.Services.ric_predioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_predioController {

    private ric_predioService service;

    public ric_predioController(ric_predioService service) {
        this.service = service;
    }

    @PostMapping(path = "/prediosByLike/{column}/{value}")
    public List<ric_predio> listByLike (@PathVariable("column") String column, @PathVariable("value") String value) {
        return service.predioByLike(column, value);
    }
}
