package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_uebaunit;
import com.example.catastral.Entities.Ric_construccion;
import com.example.catastral.Entities.Ric_terreno;
import com.example.catastral.Entities.Ric_unidadconstruccion;
import com.example.catastral.Services.col_uebaunitService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_uebaunitController {

    private col_uebaunitService service;

    public col_uebaunitController(col_uebaunitService service){
        this.service = service;
    }

    @GetMapping("/col_uebaunits")
    public ArrayList<Col_uebaunit> todo () {
        return service.todo();
    }

    @GetMapping("/col_uebaunit/{t_id}")
    public Col_uebaunit col_uebaunit (@PathVariable("t_id") Integer t_id) {
        return service.col_uebaunit(t_id);
    }

    @GetMapping("/terrenosPredio/{t_id}")
    public ArrayList<Ric_terreno> terrenosDetallePredio (@PathVariable("t_id") Integer t_id) {
        return service.terrenoPredio(t_id);
    }

    @GetMapping("/unidadesConstruccionPredio/{t_id}")
    public ArrayList<Ric_unidadconstruccion> unidadContruccionDetallePredio (@PathVariable("t_id") Integer t_id) {
        return service.unidadconstruccionPredio(t_id);
    }
    @GetMapping("/construccionesPredio/{t_id}")
    public ArrayList<Ric_construccion> contruccionDetallePredio (@PathVariable("t_id") Integer t_id) {
        return service.contruccionPredio(t_id);
    }
}