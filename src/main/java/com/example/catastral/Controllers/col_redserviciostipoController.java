package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_redserviciostipo;
import com.example.catastral.Services.col_redserviciostipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_redserviciostipoController {

    private col_redserviciostipoService service;

    public col_redserviciostipoController(col_redserviciostipoService service){
        this.service = service;
    }

    @GetMapping("/col_redserviciostipos")
    public ArrayList<Col_redserviciostipo> todo () {
        return service.todo();
    }

    @GetMapping("/col_redserviciostipo/{t_id}")
    public Col_redserviciostipo col_redserviciostipo (@PathVariable("t_id") Integer t_id) {
        return service.col_redserviciostipo(t_id);
    }
}