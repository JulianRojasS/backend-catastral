package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_construccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ric_construccionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> construccionPredio (Integer baunit) {
        String sql = "select rc.t_id, rc.identificador, rc2.dispname as tipo_construccion, rd.dispname as tipo_dominio, rc.numero_pisos, rc.numero_sotanos, rc.numero_mezanines, rc.numero_semisotanos, rc.anio_construccion, rc.avaluo_construccion, rc.area_construccion, rc.altura, rc.observaciones, rc.codigo_construccion, rc.dimension as dimension, rc.etiqueta, cr.dispname as relacion_superficie, rc.nivel, rc.comienzo_vida_util_version, rc.fin_vida_util_version from ric_construccion rc inner join ric_construcciontipo rc2 on rc.tipo_construccion = rc2.t_id  inner join ric_dominioconstrucciontipo rd on rc.tipo_dominio = rd.t_id  inner join col_dimensiontipo cd on rc.dimension = cd.t_id  inner join col_relacionsuperficietipo cr on rc.relacion_superficie = cr.t_id inner join col_uebaunit cu on cu.ue_ric_construccion = rc.t_id where cu.baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});

    }
}
