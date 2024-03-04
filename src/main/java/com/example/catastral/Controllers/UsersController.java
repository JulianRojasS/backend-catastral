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

    @GetMapping(path = "/usaurio")
    public List<String> getEmailsAndPasswords() {
        List<Users> usersList = service.todo();
        List<String> emailsAndPasswords = new ArrayList<>();

        for (Users user : usersList) {
            String email = user.getEmail();
            String password = user.getContrasenia();

            emailsAndPasswords.add("Email: " + email + ", Contraseña: " + password);
        }

        return emailsAndPasswords;
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
    public Boolean actualizar (@PathVariable("id") Integer id, Users u) {
        return service.Actualizar(id, u);
    }

}
