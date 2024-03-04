package com.example.catastral.Services;

import com.example.catastral.Entities.Users;
import com.example.catastral.Repositories.usersRepository;
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
