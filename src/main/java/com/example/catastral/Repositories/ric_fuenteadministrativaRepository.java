package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_fuenteadministrativa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ric_fuenteadministrativaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ric_fuenteadministrativa> fuenteadministrativaPredio (Integer t_id) {
        String sql = "select rf.t_id, rf.t_ili_tid,  rf.tipo, rf.ente_emisor, rf.oficina_origen, rf.ciudad_origen, rf.observacion, rf.numero_fuente, rf.estado_disponibilidad, rf.tipo_principal, rf.fecha_documento_fuente, rf.espacio_de_nombres, rf.local_id  from ric.ric_fuenteadministrativa rf inner join ric.col_rrrfuente cr on cr.fuente_administrativa = rf.t_id inner join ric.ric_derecho rd on cr.rrr = rd.t_id where rd.unidad = ?";
        return jdbcTemplate.query(sql, new Object[]{t_id}, new BeanPropertyRowMapper<>(ric_fuenteadministrativa.class));
    }
}
