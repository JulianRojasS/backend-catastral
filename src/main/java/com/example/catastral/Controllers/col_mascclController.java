package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_masccl;
import com.example.catastral.Services.col_mascclService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_mascclController {

    private col_mascclService service;

    public col_mascclController(col_mascclService service){
        this.service = service;
    }

    @GetMapping("/col_masccls")
    public ArrayList<Col_masccl> todo () {
        return service.todo();
    }

    @GetMapping("/col_masccl/{t_id}")
    public Col_masccl col_masccl (@PathVariable("t_id") Integer t_id) {
        return service.col_masccl(t_id);
    }
}