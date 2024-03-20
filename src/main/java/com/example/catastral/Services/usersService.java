package com.example.catastral.Services;

import com.example.catastral.Entities.Users;
import com.example.catastral.Repositories.usersRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class usersService {
    private usersRepository repository;

    public usersService (usersRepository repository){
        this.repository = repository;
    }

    public ArrayList<Users> todo () {
        return (ArrayList<Users>) repository.findAll();
    }

    public Users users (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public Users UserByEmail (String email) {
        ArrayList<Users> usuarios = this.todo();
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

    public Users Actualizar (Integer id, Users u) {
        Users user = new Users(u.getNombre(), u.getEmail(), u.getContrasenia(), u.getRol());
        user.setId(id);
        if (repository.findById(id).isPresent()) {
                repository.save(user);
                return user;
        }
        return new Users();
    }
}

