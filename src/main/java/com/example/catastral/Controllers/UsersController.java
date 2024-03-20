package com.example.catastral.Controllers;

import com.example.catastral.Entities.Users;
import com.example.catastral.Services.usersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class usersController {
    private usersService service;

    public usersController (usersService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public ArrayList<Users> listar() {
        return service.todo();
    }

    @GetMapping(path = "/User/{email}")
    public Users User (@PathVariable("email") String email) {
        return service.UserByEmail(email);
    }

    @PostMapping("/login")
    public Boolean login(@RequestParam("email") String email, @RequestParam("password") String password) {
        return service.Login(email, password);
    }

    @PutMapping("/actualizarUsuario/{id}")
    public Users actualizar (@PathVariable("id") Integer id, Users u) {
        return service.Actualizar(id, u);
    }

}
