package com.example.catastral.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class col_uebaunitRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> terrenoPredio (Integer baunit) {
        String sql = "select cu.ue_ric_terreno, rt.area_terreno from ric.col_uebaunit cu inner join ric_terreno rt on rt.t_id = ue_ric_terreno where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }

    public List<Map<String, Object>> geometriasTerreno (Integer baunit) {
        String sql = "select ST_AsText(ST_Transform(rt.geometria, 4326)) as geometria  from ric.col_uebaunit cu inner join ric_terreno rt on rt.t_id = ue_ric_terreno where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }
}
