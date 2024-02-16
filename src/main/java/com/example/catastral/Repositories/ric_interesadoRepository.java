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
}
