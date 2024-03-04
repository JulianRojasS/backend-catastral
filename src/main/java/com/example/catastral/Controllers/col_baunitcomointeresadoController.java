package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_baunitcomointeresado;
import com.example.catastral.Services.col_baunitcomointeresadoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_baunitcomointeresadoController {

    private col_baunitcomointeresadoService service;

    public col_baunitcomointeresadoController(col_baunitcomointeresadoService service){
        this.service = service;
    }

    @GetMapping("/col_baunitcomointeresados")
    public ArrayList<Col_baunitcomointeresado> todo () {
        return service.todo();
    }

    @GetMapping("/col_baunitcomointeresado/{t_id}")
    public Col_baunitcomointeresado col_baunitcomointeresado (@PathVariable("t_id") Integer t_id) {
        return service.col_baunitcomointeresado(t_id);
    }
}