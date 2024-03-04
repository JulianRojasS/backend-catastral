package com.example.catastral.Controllers;

import com.example.catastral.Entities.Extinteresado;
import com.example.catastral.Services.extinteresadoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class extinteresadoController {

    private extinteresadoService service;

    public extinteresadoController(extinteresadoService service){
        this.service = service;
    }

    @GetMapping("/extinteresados")
    public ArrayList<Extinteresado> todo () {
        return service.todo();
    }

    @GetMapping("/extinteresado/{t_id}")
    public Extinteresado extinteresado (@PathVariable("t_id") Integer t_id) {
        return service.extinteresado(t_id);
    }
}