package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_caracteristicasunidadconstruccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ric_caracteristicasunidadconstruccionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<ric_caracteristicasunidadconstruccion> caractaristicasUnidadConstruccion () {
        String sql = "select * from ric_caracteristicasunidadconstruccion";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ric_caracteristicasunidadconstruccion.class));
    }
}
