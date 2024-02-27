package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class ric_caracteristicasunidadconstruccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private String Indentificador;
    private Integer tipo_construccion;
    private Integer tipo_dominio;
    private Integer tipo_unidad_construccion;
    private Integer total_habitaciones;
    private Integer total_banios;
    private Integer total_locales;
    private Integer total_plantas;
    private Integer uso;
    private Integer anio_construccion;
    private Integer area_construida;
    private Integer area_privada_construida;
    private String observaciones;
    private Timestamp comienzo_vida_util_version;
    private Timestamp fin_vida_util_version;
    private String espacio_de_nombres;
    private String local_id;

    public ric_caracteristicasunidadconstruccion(Integer t_id, String t_ili_tid, String indentificador, Integer tipo_construccion, Integer tipo_dominio, Integer tipo_unidad_construccion, Integer total_habitaciones, Integer total_banios, Integer total_locales, Integer total_plantas, Integer uso, Integer anio_construccion, Integer area_construida, Integer area_privada_construida, String observaciones, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        Indentificador = indentificador;
        this.tipo_construccion = tipo_construccion;
        this.tipo_dominio = tipo_dominio;
        this.tipo_unidad_construccion = tipo_unidad_construccion;
        this.total_habitaciones = total_habitaciones;
        this.total_banios = total_banios;
        this.total_locales = total_locales;
        this.total_plantas = total_plantas;
        this.uso = uso;
        this.anio_construccion = anio_construccion;
        this.area_construida = area_construida;
        this.area_privada_construida = area_privada_construida;
        this.observaciones = observaciones;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public ric_caracteristicasunidadconstruccion() {
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

    public String getIndentificador() {
        return Indentificador;
    }

    public void setIndentificador(String indentificador) {
        Indentificador = indentificador;
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

    public Integer getTipo_unidad_construccion() {
        return tipo_unidad_construccion;
    }

    public void setTipo_unidad_construccion(Integer tipo_unidad_construccion) {
        this.tipo_unidad_construccion = tipo_unidad_construccion;
    }

    public Integer getTotal_habitaciones() {
        return total_habitaciones;
    }

    public void setTotal_habitaciones(Integer total_habitaciones) {
        this.total_habitaciones = total_habitaciones;
    }

    public Integer getTotal_banios() {
        return total_banios;
    }

    public void setTotal_banios(Integer total_banios) {
        this.total_banios = total_banios;
    }

    public Integer getTotal_locales() {
        return total_locales;
    }

    public void setTotal_locales(Integer total_locales) {
        this.total_locales = total_locales;
    }

    public Integer getTotal_plantas() {
        return total_plantas;
    }

    public void setTotal_plantas(Integer total_plantas) {
        this.total_plantas = total_plantas;
    }

    public Integer getUso() {
        return uso;
    }

    public void setUso(Integer uso) {
        this.uso = uso;
    }

    public Integer getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(Integer anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public Integer getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(Integer area_construida) {
        this.area_construida = area_construida;
    }

    public Integer getArea_privada_construida() {
        return area_privada_construida;
    }

    public void setArea_privada_construida(Integer area_privada_construida) {
        this.area_privada_construida = area_privada_construida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        return "ric_caracteristicasunidadconstruccion{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", Indentificador='" + Indentificador + '\'' +
                ", tipo_construccion=" + tipo_construccion +
                ", tipo_dominio=" + tipo_dominio +
                ", tipo_unidad_construccion=" + tipo_unidad_construccion +
                ", total_habitaciones=" + total_habitaciones +
                ", total_banios=" + total_banios +
                ", total_locales=" + total_locales +
                ", total_plantas=" + total_plantas +
                ", uso=" + uso +
                ", anio_construccion=" + anio_construccion +
                ", area_construida=" + area_construida +
                ", area_privada_construida=" + area_privada_construida +
                ", observaciones='" + observaciones + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
