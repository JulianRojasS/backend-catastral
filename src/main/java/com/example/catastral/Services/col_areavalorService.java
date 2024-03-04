package com.example.catastral.Services;

import com.example.catastral.Entities.Col_areavalor;
import com.example.catastral.Repositories.col_areavalorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_areavalorService {
    private col_areavalorRepository repository;

    public col_areavalorService (col_areavalorRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_areavalor> todo () {
        return (ArrayList<Col_areavalor>) repository.findAll();
    }

    public Col_areavalor col_areavalor (Integer t_id) {
        return repository.findById(t_id).get();
    }
}