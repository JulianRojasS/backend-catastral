package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_contenidoniveltipo;
import com.example.catastral.Services.col_contenidoniveltipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_contenidoniveltipoController {

    private col_contenidoniveltipoService service;

    public col_contenidoniveltipoController(col_contenidoniveltipoService service){
        this.service = service;
    }

    @GetMapping("/col_contenidoniveltipos")
    public ArrayList<Col_contenidoniveltipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_contenidoniveltipo/{t_id}")
    public Col_contenidoniveltipo col_contenidoniveltipo (@PathVariable("t_id") Integer t_id) {
        return service.col_contenidoniveltipo(t_id);
    }
}