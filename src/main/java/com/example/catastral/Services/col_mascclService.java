package com.example.catastral.Services;

import com.example.catastral.Entities.Col_masccl;
import com.example.catastral.Repositories.col_mascclRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class col_mascclService {
    private col_mascclRepository repository;

    public col_mascclService (col_mascclRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_masccl> todo () {
        return (ArrayList<Col_masccl>) repository.findAll();
    }

    public Col_masccl col_masccl (Integer t_id) {
        return repository.findById(t_id).get();
    }
}