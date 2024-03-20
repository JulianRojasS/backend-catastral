package com.example.catastral.Repositories;

import com.example.catastral.Entities.Ric_interesado;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public interface ric_interesadoRepository extends CrudRepository<Ric_interesado, Integer> {
    @Query(value = "with t3 as ( with t1 as ( select rd.interesado_ric_interesado , rd.t_id as derecho , rd.interesado_ric_agrupacioninteresados , rp.codigo_homologado ,rp.t_id from ric_derecho rd right join ric_predio rp on rd.unidad = rp.t_id), t2 as( select * from col_miembros cm) select t1.codigo_homologado,t1.t_id as predio,t1.derecho, t2.participacion, case when t1.interesado_ric_interesado is not null then t1.interesado_ric_interesado else t2.interesado_ric_interesado end as interesado ,t2.agrupacion from t1 left join t2 on t1.interesado_ric_agrupacioninteresados = t2.agrupacion), t4 as ( select ri.*, ri2.dispname from ric_interesado ri inner join ric_interesadodocumentotipo ri2 on ri.tipo_documento = ri2.t_id) select * from t3 inner join t4 on t3.interesado = t4.t_id where t3.predio = :t_id", nativeQuery = true)
    public List<Map<String, Object>> detalleConsultaPredio (@Param("t_id") Integer t_id);

    @Query(value = "SELECT * FROM ric_interesado WHERE documento_identidad LIKE :value ORDER BY documento_identidad", nativeQuery = true)
    public ArrayList<Ric_interesado> buscarPorDI (@Param("value") String value);

    @Query(value = "SELECT * FROM ric_interesado WHERE nombre LIKE :value ORDER BY nombre", nativeQuery = true)
    public ArrayList<Ric_interesado> buscarPorNombre (@Param("value") String value);

    @Query(value = "select  public.uuid_generate_v4();", nativeQuery = true)
    UUID t_ili_tid();

}
