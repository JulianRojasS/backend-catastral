package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_miembros;
import com.example.catastral.Services.col_miembrosService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_miembrosController {

    private col_miembrosService service;

    public col_miembrosController(col_miembrosService service){
        this.service = service;
    }

    @GetMapping("/col_miembross")
    public ArrayList<Col_miembros> todo () {
        return service.todo();
    }

    @GetMapping("/col_miembros/{t_id}")
    public Col_miembros col_miembros (@PathVariable("t_id") Integer t_id) {
        return service.col_miembros(t_id);
    }
    @PostMapping("/col_miembrosAgrupacion/{t_id}")
    public ArrayList<Col_miembros> col_miembrosPorAgrupacion (@PathVariable("t_id") Integer t_id) {
        return service.col_miembrosPorAgrupacion(t_id);
    }
    @DeleteMapping("/eliminarCol_miembrosByAgrupacion/{t_id}")
    public boolean col_miembrosEliminarPorAgrupacion (@PathVariable("t_id") Integer t_id) {
        return service.eliminarPorAgrupacion(t_id);
    }
    @PostMapping("/insertarCol_miembros")
    public Integer col_miembrosInsertar (@RequestBody Col_miembros col_miembros) {
        System.out.println(col_miembros);
        return service.col_miembrosInsertar(col_miembros);
    }
}