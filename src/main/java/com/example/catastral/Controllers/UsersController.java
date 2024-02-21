package com.example.catastral.Controllers;

import com.example.catastral.Entities.Users;
import com.example.catastral.Services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping(path = "/usaurio")
    public List<String> getEmailsAndPasswords() {
        List<Users> usersList = service.AllUsers();
        List<String> emailsAndPasswords = new ArrayList<>();

        for (Users user : usersList) {
            String email = user.getEmail();
            String password = user.getContrasenia();

            emailsAndPasswords.add("Email: " + email + ", Contraseña: " + password);
        }

        return emailsAndPasswords;
    }

    @PostMapping("/login")
    public String login(@RequestParam("correo") String correo, @RequestParam("password") String password) {

        List<Users> usersList = service.AllUsers();
        for (Users user : usersList) {
            if (user.getEmail().equals(correo) && user.getContrasenia().equals(password)) {
                return "<script>window.location.href = 'http://127.0.0.1:5500/src/views/consultas.html';</script>";
            }
        }
        return "<script>window.location.href = 'http://127.0.0.1:5500/login.html';</script>";
    }






}
