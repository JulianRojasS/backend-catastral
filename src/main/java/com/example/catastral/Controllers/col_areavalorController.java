package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_areavalor;
import com.example.catastral.Services.col_areavalorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_areavalorController {

    private col_areavalorService service;

    public col_areavalorController(col_areavalorService service){
        this.service = service;
    }

    @GetMapping("/col_areavalors")
    public ArrayList<Col_areavalor> todo () {
        return service.todo();
    }

    @GetMapping("/col_areavalor/{t_id}")
    public Col_areavalor col_areavalor (@PathVariable("t_id") Integer t_id) {
        return service.col_areavalor(t_id);
    }
}