package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_predio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ric_predioRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ric_predio> buscarValor(String column, String value) {
        String sql = "SELECT * FROM ric.ric_predio WHERE " + column + " LIKE ? ORDER BY " +  column;
        return jdbcTemplate.query(sql, new Object[] {"%" + value + "%"}, new BeanPropertyRowMapper<>(ric_predio.class));
    }
}
