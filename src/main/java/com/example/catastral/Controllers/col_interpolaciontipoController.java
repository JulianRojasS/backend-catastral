package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_interpolaciontipo;
import com.example.catastral.Services.col_interpolaciontipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_interpolaciontipoController {

    private col_interpolaciontipoService service;

    public col_interpolaciontipoController(col_interpolaciontipoService service){
        this.service = service;
    }

    @GetMapping("/col_interpolaciontipos")
    public ArrayList<Col_interpolaciontipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_interpolaciontipo/{t_id}")
    public Col_interpolaciontipo col_interpolaciontipo (@PathVariable("t_id") Integer t_id) {
        return service.col_interpolaciontipo(t_id);
    }
}