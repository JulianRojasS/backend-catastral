package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_menosccl;
import com.example.catastral.Services.col_menoscclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_menoscclController {

    private col_menoscclService service;

    public col_menoscclController(col_menoscclService service){
        this.service = service;
    }

    @GetMapping("/col_menosccls")
    public ArrayList<Col_menosccl> todo () {
        return service.todo();
    }

    @GetMapping("/col_menosccl/{t_id}")
    public Col_menosccl col_menosccl (@PathVariable("t_id") Integer t_id) {
        return service.col_menosccl(t_id);
    }
}