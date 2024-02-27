package com.example.catastral.Services;

import com.example.catastral.Repositories.UsersRepository;
import com.example.catastral.Entities.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private UsersRepository repository;
    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Users> AllUsers () {
        return (ArrayList<Users>) repository.findAll();
    }

    public Users UserByEmail (String email) {
        ArrayList<Users> usuarios = this.AllUsers();
        Users usuario = new Users();
        boolean isIn = false;
        for (Users us : usuarios) {
            if (us.getEmail().equals(email)) {
                isIn = true;
            }
        }
        if (isIn) {
            for (Users u : usuarios) {
                if (u.getEmail().equals(email)) {
                    usuario = u;
                }
            }
            return usuario;
        }

        return usuario;
    }


    public Boolean Login (String email, String password) {
        Users user = this.UserByEmail(email);

        if (user.getId() != null) {
            if (user.getEmail().equals(email) && user.getContrasenia().equals(password)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Boolean Actualizar (Integer id, Users u) {
        Optional<Users> user_before = (Optional<Users>) repository.findById(id);

        Users user = new Users(user_before.get().getId(), u.getNombre(), u.getEmail(), u.getContrasenia(), u.getRol());

        if (repository.findById(user.getId()).isPresent()) {
            repository.save(user);
            return true;
        }

        return false;
    }

}
