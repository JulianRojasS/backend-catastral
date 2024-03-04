package com.example.catastral.Services;

import com.example.catastral.Entities.Col_volumenvalor;
import com.example.catastral.Repositories.col_volumenvalorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_volumenvalorService {
    private col_volumenvalorRepository repository;

    public col_volumenvalorService (col_volumenvalorRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_volumenvalor> todo () {
        return (ArrayList<Col_volumenvalor>) repository.findAll();
    }

    public Col_volumenvalor col_volumenvalor (Integer t_id) {
        return repository.findById(t_id).get();
    }
}