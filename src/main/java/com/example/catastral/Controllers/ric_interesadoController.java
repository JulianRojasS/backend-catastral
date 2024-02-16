package com.example.catastral.Controllers;

import com.example.catastral.Services.ric_interesadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.catastral.Entities.ric_interesado;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_interesadoController {
    private ric_interesadoService service;

    public ric_interesadoController (ric_interesadoService service) {
        this.service = service;
    }

    @PostMapping(path = "/interesadosByLike/{column}/{value}")
    public List<ric_interesado> listByLike (@PathVariable("column") String column, @PathVariable("value") String value) {
        return service.interesadoByLike(column, value);
    }
}
