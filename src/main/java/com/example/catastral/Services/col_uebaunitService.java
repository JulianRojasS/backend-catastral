package com.example.catastral.Services;

import com.example.catastral.Repositories.col_uebaunitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class col_uebaunitService {
    private col_uebaunitRepository repository;

    public col_uebaunitService (col_uebaunitRepository repository) {
        this.repository = repository;
    }

    public List<Map<String, Object>> terrenoDetallePredio (Integer uebaunit) {
        return repository.terrenoPredio(uebaunit);
    }

    public List<Map<String, Object>> geometriasTerreno (Integer uebanit) {
        return repository.geometriasTerreno(uebanit);
    }
}
