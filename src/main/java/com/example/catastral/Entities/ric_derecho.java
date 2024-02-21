package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Date;

@Entity
public class ric_derecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private Integer tipo;
    private Integer fraccion_derecho;
    private Date fecha_inicio_tenencia;
    private String descripcion;
    private Integer interesado_ric_interesado;
    private Integer interesado_ric_agrupaciones;
    private Integer unidad;
    private Time comienzo_vida_util_version;
    private Time fin_vida_util_version;
    private String espacio_de_nombres;
    private String local_id;

    public ric_derecho(Integer t_id, String t_ili_tid, Integer tipo, Integer fraccion_derecho, Date fecha_inicio_tenencia, String descripcion, Integer interesado_ric_interesado, Integer interesado_ric_agrupaciones, Integer unidad, Time comienzo_vida_util_version, Time fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.tipo = tipo;
        this.fraccion_derecho = fraccion_derecho;
        this.fecha_inicio_tenencia = fecha_inicio_tenencia;
        this.descripcion = descripcion;
        this.interesado_ric_interesado = interesado_ric_interesado;
        this.interesado_ric_agrupaciones = interesado_ric_agrupaciones;
        this.unidad = unidad;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public ric_derecho() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_ili_tid() {
        return t_ili_tid;
    }

    public void setT_ili_tid(String t_ili_tid) {
        this.t_ili_tid = t_ili_tid;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getFraccion_derecho() {
        return fraccion_derecho;
    }

    public void setFraccion_derecho(Integer fraccion_derecho) {
        this.fraccion_derecho = fraccion_derecho;
    }

    public Date getFecha_inicio_tenencia() {
        return fecha_inicio_tenencia;
    }

    public void setFecha_inicio_tenencia(Date fecha_inicio_tenencia) {
        this.fecha_inicio_tenencia = fecha_inicio_tenencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getInteresado_ric_interesado() {
        return interesado_ric_interesado;
    }

    public void setInteresado_ric_interesado(Integer interesado_ric_interesado) {
        this.interesado_ric_interesado = interesado_ric_interesado;
    }

    public Integer getInteresado_ric_agrupaciones() {
        return interesado_ric_agrupaciones;
    }

    public void setInteresado_ric_agrupaciones(Integer interesado_ric_agrupaciones) {
        this.interesado_ric_agrupaciones = interesado_ric_agrupaciones;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Time getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Time comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Time getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Time fin_vida_util_version) {
        this.fin_vida_util_version = fin_vida_util_version;
    }

    public String getEspacio_de_nombres() {
        return espacio_de_nombres;
    }

    public void setEspacio_de_nombres(String espacio_de_nombres) {
        this.espacio_de_nombres = espacio_de_nombres;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    @Override
    public String toString() {
        return "ric_derecho{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", tipo=" + tipo +
                ", fraccion_derecho=" + fraccion_derecho +
                ", fecha_inicio_tenencia=" + fecha_inicio_tenencia +
                ", descripcion='" + descripcion + '\'' +
                ", interesado_ric_interesado=" + interesado_ric_interesado +
                ", interesado_ric_agrupaciones=" + interesado_ric_agrupaciones +
                ", unidad=" + unidad +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
