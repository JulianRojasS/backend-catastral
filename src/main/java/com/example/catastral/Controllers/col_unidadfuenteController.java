package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_unidadfuente;
import com.example.catastral.Entities.Ric_fuenteadministrativa;
import com.example.catastral.Services.col_unidadfuenteService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_unidadfuenteController {

    private col_unidadfuenteService service;

    public col_unidadfuenteController(col_unidadfuenteService service){
        this.service = service;
    }

    @GetMapping("/col_unidadfuentes")
    public ArrayList<Col_unidadfuente> todo () {
        return service.todo();
    }

    @GetMapping("/col_unidadfuente/{t_id}")
    public Col_unidadfuente col_unidadfuente (@PathVariable("t_id") Integer t_id) {
        return service.col_unidadfuente(t_id);
    }
    @GetMapping("/fuentesAdministrativasPredio/{t_id}")
    public ArrayList<Ric_fuenteadministrativa> fuenteAdministrativaPredio (@PathVariable("t_id") Integer t_id) {
        return service.fuenteAdministrativaPredio(t_id);
    }
    @PostMapping("/insertarCol_unidadfuente")
    public Col_unidadfuente col_unidadfuenteInsertar (@RequestBody Col_unidadfuente colUnidadfuente) {
        System.out.println(colUnidadfuente);
        return service.crear(colUnidadfuente);
    }
}