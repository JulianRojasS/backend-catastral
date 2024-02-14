package com.example.catastral.Controllers;

import com.example.catastral.Entities.Users;
import com.example.catastral.Services.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UsersController {
    private UsersService service;

    public UsersController (UsersService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public ArrayList<Users> listar() {
        return service.AllUsers();
    }
}
