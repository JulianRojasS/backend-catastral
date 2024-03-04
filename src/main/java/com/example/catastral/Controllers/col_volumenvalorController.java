package com.example.catastral.Controllers;

import com.example.catastral.Entities.Col_volumenvalor;
import com.example.catastral.Services.col_volumenvalorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class col_volumenvalorController {

    private col_volumenvalorService service;

    public col_volumenvalorController(col_volumenvalorService service){
        this.service = service;
    }

    @GetMapping("/col_volumenvalors")
    public ArrayList<Col_volumenvalor> todo () {
        return service.todo();
    }

    @GetMapping("/col_volumenvalor/{t_id}")
    public Col_volumenvalor col_volumenvalor (@PathVariable("t_id") Integer t_id) {
        return service.col_volumenvalor(t_id);
    }
}