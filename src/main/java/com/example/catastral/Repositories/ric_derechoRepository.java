package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_derecho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ric_derechoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> derechoPredio (Integer t_id) {
        String sql = "select rd2.dispname as tipo, rd.fraccion_derecho, rd.fecha_inicio_tenencia , rd.descripcion  from ric.ric_derecho rd inner join ric.ric_derechotipo rd2 on rd2.t_id = rd.tipo inner join ric.col_rrrfuente cr on rd.t_id = cr.rrr inner join ric.ric_fuenteadministrativa rf on cr.fuente_administrativa  = rf.t_id  where rd.unidad  = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{t_id});
    }
}
