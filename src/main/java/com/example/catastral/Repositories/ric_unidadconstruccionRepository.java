package com.example.catastral.Repositories;

import com.example.catastral.Entities.ric_unidadconstruccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class ric_unidadconstruccionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ArrayList<ric_unidadconstruccion> unidadConstruccionPredio (Integer baunit) {
        String sql = "select ru.t_id, ru.t_ili_tid, ru.planta_ubicacion, ru.area_construida, ru.altura, st_astext(st_transform(ru.geometria, 4326)) as geometria, ru.ric_caracteristicasunidadconstruccion, ru.ric_construccion, ru.dimension, ru.etiqueta,  ru.relacion_superficie, ru.nivel, ru.comienzo_vida_util_version, ru.fin_vida_util_version, ru.espacio_de_nombres, ru.local_id from ric_unidadconstruccion ru inner join col_uebaunit cu on cu.ue_ric_unidadconstruccion = ru.t_id where cu.baunit = ?";
        return (ArrayList<ric_unidadconstruccion>) jdbcTemplate.query(sql, new Object[]{baunit}, new BeanPropertyRowMapper<>(ric_unidadconstruccion.class));
    }
}
