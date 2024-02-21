package com.example.catastral.Repositories;

import com.example.catastral.Entities.extdireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class extdireccionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String ,Object>> direccionPredio (Integer t_id) {
        String sql = "select etd.dispname as tipo_direccion, es_direccion_principal, codigo_postal, clase_via_principal, valor_via_principal, letra_via_principal, sector_ciudad, valor_via_generadora, letra_via_generadora, numero_predio, sector_predio, complemento, nombre_predio from ric.extdireccion e inner join extdireccion_tipo_direccion etd on etd.t_id = e.tipo_direccion  where e.ric_predio_direccion  = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{t_id});
    }
}
