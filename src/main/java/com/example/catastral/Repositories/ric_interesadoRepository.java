package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_interesado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ric_interesadoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ric_interesado> buscarPorValor(String column, String value) {
        String sql = "SELECT * FROM ric.ric_interesado WHERE "+ column +"  LIKE ? ORDER BY " + column;
        return jdbcTemplate.query(sql, new Object[]{"%" + value + "%"}, new BeanPropertyRowMapper<>(ric_interesado.class));
    }

    public List<Map<String, Object>> detalleConsulta (Integer t_id) {
        String sql = "select ri.t_id, ri.nombre, ri2.dispname, ri.documento_identidad  from ric.ric_interesado ri inner join ric.ric_interesadodocumentotipo ri2 on ri.tipo_documento = ri2.t_id where ri.t_id = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{t_id});
    }

    public List<Map<String, Object>> detalleConsultaPredio (Integer t_id) {
        String sql = "with t3 as ( with t1 as ( select rd.interesado_ric_interesado , rd.t_id as derecho , rd.interesado_ric_agrupacioninteresados , rp.codigo_homologado ,rp.t_id from ric_derecho rd right join ric_predio rp on rd.unidad = rp.t_id), t2 as( select * from col_miembros cm) select t1.codigo_homologado,t1.t_id as predio,t1.derecho, t2.participacion, case when t1.interesado_ric_interesado is not null then t1.interesado_ric_interesado else t2.interesado_ric_interesado end as interesado ,t2.agrupacion from t1 left join t2 on t1.interesado_ric_agrupacioninteresados = t2.agrupacion), t4 as ( select * from ric_interesado ri ) select * from t3 inner join t4 on t3.interesado=t4.t_id where t3.predio = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{t_id});
    }

}
