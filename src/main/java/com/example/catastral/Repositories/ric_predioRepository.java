package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_predio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ric_predioRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ric_predio> buscarValor(String column, String value) {
        String sql = "SELECT * FROM ric.ric_predio WHERE " + column + " LIKE ? ORDER BY " +  column;
        return jdbcTemplate.query(sql, new Object[] {"%" + value + "%"}, new BeanPropertyRowMapper<>(ric_predio.class));
    }

    public List<Map<String, Object>> detalleConsultaInteresado (Integer t_id) {
        String sql = "select rd.unidad, rd.interesado_ric_interesado, rp.codigo_homologado, rp.numero_predial, rp.numero_predial_anterior, rp.matricula_inmobiliaria  from ric.ric_predio rp inner join ric.ric_derecho rd on rd.unidad = rp.t_id where rd.interesado_ric_interesado = ?";
        return  jdbcTemplate.queryForList(sql, new Object[]{t_id});

    }
}
