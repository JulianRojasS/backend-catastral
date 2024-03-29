package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_predio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public interface ric_predioRepository extends CrudRepository<Ric_predio, Integer> {
    @Query(value = "SELECT * FROM ric_predio WHERE numero_predial LIKE :value ORDER BY numero_predial", nativeQuery = true)
    public ArrayList<Ric_predio> buscarPorNP (@Param("value") String value);
    @Query(value = "SELECT * FROM ric_predio WHERE numero_predial_anterior LIKE :value ORDER BY numero_predial_anterior", nativeQuery = true)
    public ArrayList<Ric_predio> buscarPorNPA (@Param("value") String value);
    @Query(value = "SELECT * FROM ric_predio WHERE matricula_inmobiliaria LIKE :value ORDER BY matricula_inmobiliaria", nativeQuery = true)
    public ArrayList<Ric_predio> buscarPorMI (@Param("value") String value);
    @Query(value = "SELECT * FROM ric_predio WHERE codigo_homologado LIKE :value ORDER BY codigo_homologado", nativeQuery = true)
    public ArrayList<Ric_predio> buscarPorCH (@Param("value") String value);
    @Query(value = "with t3 as ( with t1 as ( select rd.interesado_ric_interesado , rd.t_id as derecho , rd.interesado_ric_agrupacioninteresados , rp.codigo_homologado , rp.numero_predial , rp.numero_predial_anterior , rp.matricula_inmobiliaria ,rp.t_id from ric_derecho rd right join ric_predio rp on rd.unidad = rp.t_id), t2 as( select * from col_miembros cm) select t1.t_id, t1.codigo_homologado, t1.numero_predial, t1.numero_predial_anterior, t1.matricula_inmobiliaria, t1.t_id as predio,t1.derecho, t2.participacion, case when t1.interesado_ric_interesado is not null then t1.interesado_ric_interesado else t2.interesado_ric_interesado end as interesado ,t2.agrupacion from t1 left join t2 on t1.interesado_ric_agrupacioninteresados = t2.agrupacion), t4 as ( select * from ric_interesado ri) select t3.t_id as predio, t3.codigo_homologado, t3.numero_predial, t3.numero_predial_anterior, t3.matricula_inmobiliaria, t4.t_id from t3 inner join t4 on t3.interesado=t4.t_id where t4.t_id = :t_id", nativeQuery = true)
    public List<Map<String, Object>> detalleConsultaInteresado (@Param("t_id") Integer t_id);
}
