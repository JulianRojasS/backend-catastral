package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_estructuratipo;
import com.example.catastral.Services.col_estructuratipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_estructuratipoController {

    private col_estructuratipoService service;

    public col_estructuratipoController(col_estructuratipoService service){
        this.service = service;
    }

    @GetMapping("/col_estructuratipos")
    public ArrayList<Col_estructuratipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_estructuratipo/{t_id}")
    public Col_estructuratipo col_estructuratipo (@PathVariable("t_id") Integer t_id) {
        return service.col_estructuratipo(t_id);
    }
}