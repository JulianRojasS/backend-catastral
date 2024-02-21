package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class ric_construccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private String identificado;
    private Integer tipo_construccion;
    private Integer tipo_dominio;
    private Integer numero_pisos;
    private Integer numero_sotanos;
    private Integer numero_mezanines;
    private Integer numero_semisotanos;
    private Integer anio_construccion;
    private Integer avaluo_construccion;
    private Integer area_construccion;
    private Integer altura;
    private String observaciones;
    private String codigo_construccion;
    private String geometria;
    private Integer dimension;
    private String etiqueta;
    private Integer relacion_superficie;
    private Integer nivel;
    private Timestamp comienzo_vida_util_version;
    private Timestamp fin_vida_util_version;
    private String espacio_de_nombres;
    private String local_id;

    public ric_construccion(Integer t_id, String t_ili_tid, String identificado, Integer tipo_construccion, Integer tipo_dominio, Integer numero_pisos, Integer numero_sotanos, Integer numero_mezanines, Integer numero_semisotanos, Integer anio_construccion, Integer avaluo_construccion, Integer area_construccion, Integer altura, String observaciones, String codigo_construccion, String geometria, Integer dimension, String etiqueta, Integer relacion_superficie, Integer nivel, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.identificado = identificado;
        this.tipo_construccion = tipo_construccion;
        this.tipo_dominio = tipo_dominio;
        this.numero_pisos = numero_pisos;
        this.numero_sotanos = numero_sotanos;
        this.numero_mezanines = numero_mezanines;
        this.numero_semisotanos = numero_semisotanos;
        this.anio_construccion = anio_construccion;
        this.avaluo_construccion = avaluo_construccion;
        this.area_construccion = area_construccion;
        this.altura = altura;
        this.observaciones = observaciones;
        this.codigo_construccion = codigo_construccion;
        this.geometria = geometria;
        this.dimension = dimension;
        this.etiqueta = etiqueta;
        this.relacion_superficie = relacion_superficie;
        this.nivel = nivel;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public ric_construccion() {
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

    public String getIdentificado() {
        return identificado;
    }

    public void setIdentificado(String identificado) {
        this.identificado = identificado;
    }

    public Integer getTipo_construccion() {
        return tipo_construccion;
    }

    public void setTipo_construccion(Integer tipo_construccion) {
        this.tipo_construccion = tipo_construccion;
    }

    public Integer getTipo_dominio() {
        return tipo_dominio;
    }

    public void setTipo_dominio(Integer tipo_dominio) {
        this.tipo_dominio = tipo_dominio;
    }

    public Integer getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(Integer numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    public Integer getNumero_sotanos() {
        return numero_sotanos;
    }

    public void setNumero_sotanos(Integer numero_sotanos) {
        this.numero_sotanos = numero_sotanos;
    }

    public Integer getNumero_mezanines() {
        return numero_mezanines;
    }

    public void setNumero_mezanines(Integer numero_mezanines) {
        this.numero_mezanines = numero_mezanines;
    }

    public Integer getNumero_semisotanos() {
        return numero_semisotanos;
    }

    public void setNumero_semisotanos(Integer numero_semisotanos) {
        this.numero_semisotanos = numero_semisotanos;
    }

    public Integer getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(Integer anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public Integer getAvaluo_construccion() {
        return avaluo_construccion;
    }

    public void setAvaluo_construccion(Integer avaluo_construccion) {
        this.avaluo_construccion = avaluo_construccion;
    }

    public Integer getArea_construccion() {
        return area_construccion;
    }

    public void setArea_construccion(Integer area_construccion) {
        this.area_construccion = area_construccion;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigo_construccion() {
        return codigo_construccion;
    }

    public void setCodigo_construccion(String codigo_construccion) {
        this.codigo_construccion = codigo_construccion;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Integer getRelacion_superficie() {
        return relacion_superficie;
    }

    public void setRelacion_superficie(Integer relacion_superficie) {
        this.relacion_superficie = relacion_superficie;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Timestamp getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Timestamp comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Timestamp getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Timestamp fin_vida_util_version) {
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
        return "ric_construccion{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", identificado='" + identificado + '\'' +
                ", tipo_construccion=" + tipo_construccion +
                ", tipo_dominio=" + tipo_dominio +
                ", numero_pisos=" + numero_pisos +
                ", numero_sotanos=" + numero_sotanos +
                ", numero_mezanines=" + numero_mezanines +
                ", numero_semisotanos=" + numero_semisotanos +
                ", anio_construccion=" + anio_construccion +
                ", avaluo_construccion=" + avaluo_construccion +
                ", area_construccion=" + area_construccion +
                ", altura=" + altura +
                ", observaciones='" + observaciones + '\'' +
                ", codigo_construccion='" + codigo_construccion + '\'' +
                ", geometria='" + geometria + '\'' +
                ", dimension=" + dimension +
                ", etiqueta='" + etiqueta + '\'' +
                ", relacion_superficie=" + relacion_superficie +
                ", nivel=" + nivel +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
