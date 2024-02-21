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
        String sql = "with t3 as ( with t1 as ( select rd.interesado_ric_interesado , rd.t_id as derecho , rd.interesado_ric_agrupacioninteresados , rp.codigo_homologado , rp.numero_predial , rp.numero_predial_anterior , rp.matricula_inmobiliaria ,rp.t_id from ric_derecho rd right join ric_predio rp on rd.unidad = rp.t_id), t2 as( select * from col_miembros cm) select t1.codigo_homologado, t1.numero_predial, t1.numero_predial_anterior, t1.matricula_inmobiliaria, t1.t_id as predio,t1.derecho, t2.participacion, case when t1.interesado_ric_interesado is not null then t1.interesado_ric_interesado else t2.interesado_ric_interesado end as interesado ,t2.agrupacion from t1 left join t2 on t1.interesado_ric_agrupacioninteresados = t2.agrupacion), t4 as ( select * from ric_interesado ri) select t3.codigo_homologado, t3.numero_predial, t3.numero_predial_anterior, t3.matricula_inmobiliaria, t4.t_id from t3 inner join t4 on t3.interesado=t4.t_id where t4.t_id = ?";
        return  jdbcTemplate.queryForList(sql, new Object[]{t_id});

    }

    public List<Map<String, Object>> predio (Integer t_id) {
        String sql = "select rp.municipio, rp.departamento, rp.t_id, rp.codigo_orip, rp.matricula_inmobiliaria, rp.numero_predial, rp.numero_predial_anterior, rp.codigo_homologado, rp.nupre, rp.avaluo_catastral, cu.dispname as tipo, rc.dispname as condicion_predio, rd.dispname as destinacion_economica, rz.dispname as zona from ric.ric_predio rp  inner join ric.ric_zonatipo rz on rp.zona = rz.t_id  inner join ric.ric_destinacioneconomicatipo rd on rp.destinacion_economica = rd.t_id  inner join ric.col_unidadadministrativabasicatipo cu on rp.tipo = cu.t_id inner join ric.ric_condicionprediotipo rc on rp.condicion_predio = rc.t_id  where rp.t_id = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{t_id});
    }
}
