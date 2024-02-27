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
        String sql = "select ST_AsText(ST_Transform(rt.geometria, 4326)), cu.ue_ric_terreno, rt.area_terreno from ric.col_uebaunit cu inner join ric_terreno rt on rt.t_id = ue_ric_terreno where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }

    public List<Map<String, Object>> unidadConstruccionPredio (Integer baunit) {
        String sql = "select rc.t_id, rc.identificador, rc2.dispname as tipo_construccion, rd.dispname as tipo_dominio, ru.dispname as tipo_unidad_construccion, rc.total_habitaciones, rc.total_banios, rc.total_locales, rc.total_plantas, ru3.dispname as uso, rc.anio_construccion, rc.area_construida, rc.area_privada_construida, rc.observaciones, rc.comienzo_vida_util_version, rc.fin_vida_util_version  from ric_caracteristicasunidadconstruccion rc inner join ric.ric_construcciontipo rc2 on rc.tipo_construccion = rc2.t_id inner join ric.ric_dominioconstrucciontipo rd on rc.tipo_dominio = rd.t_id inner join ric.ric_unidadconstrucciontipo ru on rc.tipo_unidad_construccion = ru.t_id  inner join ric.ric_usouconstipo ru3 on rc.uso = ru3.t_id inner join ric_unidadconstruccion ru2 on ru2.ric_caracteristicasunidadconstruccion = rc.t_id inner join col_uebaunit cu on ru2.t_id = cu.ue_ric_unidadconstruccion where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }

    public List<Map<String, Object>> geometriasTerreno (Integer baunit) {
        String sql = "select ST_AsText(ST_Transform(rt.geometria, 4326)) as geometria  from ric.col_uebaunit cu inner join ric_terreno rt on rt.t_id = ue_ric_terreno where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }

    public List<Map<String, Object>> geometriasContruccion (Integer baunit) {
        String sql = "select ST_AsText(ST_Transform(rc.geometria, 4326)) as geometria  from ric.col_uebaunit cu inner join ric_construccion rc on rc.t_id = ue_ric_construccion  where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }

    public List<Map<String, Object>> geometriasUnidadContruccion (Integer baunit) {
        String sql = "select ST_AsText(ST_Transform(ru.geometria, 4326)) as geometria  from ric.col_uebaunit cu inner join ric_unidadconstruccion ru on ru.t_id = ue_ric_unidadconstruccion  where baunit = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{baunit});
    }
}
