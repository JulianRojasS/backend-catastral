package com.example.catastral.Services;

import com.example.catastral.Repositories.UsersRepository;
import com.example.catastral.Entities.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UsersService {
    private UsersRepository repository;
    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Users> AllUsers () {
        return (ArrayList<Users>) repository.findAll();
    }
}
