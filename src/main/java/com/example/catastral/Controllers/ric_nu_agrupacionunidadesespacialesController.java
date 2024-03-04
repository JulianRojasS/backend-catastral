package com.example.catastral.Controllers;

import com.example.catastral.Entities.Ric_nu_agrupacionunidadesespaciales;
import com.example.catastral.Services.ric_nu_agrupacionunidadesespacialesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ric_nu_agrupacionunidadesespacialesController {

    private ric_nu_agrupacionunidadesespacialesService service;

    public ric_nu_agrupacionunidadesespacialesController(ric_nu_agrupacionunidadesespacialesService service){
        this.service = service;
    }

    @GetMapping("/ric_nu_agrupacionunidadesespacialess")
    public ArrayList<Ric_nu_agrupacionunidadesespaciales> todo () {
        return service.todo();
    }

    @GetMapping("/ric_nu_agrupacionunidadesespaciales/{t_id}")
    public Ric_nu_agrupacionunidadesespaciales ric_nu_agrupacionunidadesespaciales (@PathVariable("t_id") Integer t_id) {
        return service.ric_nu_agrupacionunidadesespaciales(t_id);
    }
}