package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_iso19125_tipo;
import com.example.catastral.Services.col_iso19125_tipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_iso19125_tipoController {

    private col_iso19125_tipoService service;

    public col_iso19125_tipoController(col_iso19125_tipoService service){
        this.service = service;
    }

    @GetMapping("/col_iso19125_tipos")
    public ArrayList<Col_iso19125_tipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_iso19125_tipo/{t_id}")
    public Col_iso19125_tipo col_iso19125_tipo (@PathVariable("t_id") Integer t_id) {
        return service.col_iso19125_tipo(t_id);
    }
}