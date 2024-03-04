package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_fuenteespacialtipo;
import com.example.catastral.Services.col_fuenteespacialtipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_fuenteespacialtipoController {

    private col_fuenteespacialtipoService service;

    public col_fuenteespacialtipoController(col_fuenteespacialtipoService service){
        this.service = service;
    }

    @GetMapping("/col_fuenteespacialtipos")
    public ArrayList<Col_fuenteespacialtipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_fuenteespacialtipo/{t_id}")
    public Col_fuenteespacialtipo col_fuenteespacialtipo (@PathVariable("t_id") Integer t_id) {
        return service.col_fuenteespacialtipo(t_id);
    }
}