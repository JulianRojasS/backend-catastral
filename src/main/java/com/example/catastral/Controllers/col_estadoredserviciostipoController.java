package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_estadoredserviciostipo;
import com.example.catastral.Services.col_estadoredserviciostipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_estadoredserviciostipoController {

    private col_estadoredserviciostipoService service;

    public col_estadoredserviciostipoController(col_estadoredserviciostipoService service){
        this.service = service;
    }

    @GetMapping("/col_estadoredserviciostipos")
    public ArrayList<Col_estadoredserviciostipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_estadoredserviciostipo/{t_id}")
    public Col_estadoredserviciostipo col_estadoredserviciostipo (@PathVariable("t_id") Integer t_id) {
        return service.col_estadoredserviciostipo(t_id);
    }
}