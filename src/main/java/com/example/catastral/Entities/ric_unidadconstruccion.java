package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class ric_unidadconstruccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private Integer planta_ubicacion;
    private Integer area_construida;
    private Integer altura;
    private String geometria;
    private Integer ric_caracteristicasunidadconstruccion;
    private Integer ric_construccion;
    private Integer dimension;
    private String etiqueta;
    private Integer relacion_superficie;
    private Integer nivel;
    private Timestamp comienzo_vida_util_version;
    private Timestamp fin_vida_util_version;
    private String espacio_de_nombres;
    private String local_id;

    public ric_unidadconstruccion(Integer t_id, String t_ili_tid, Integer planta_ubicacion, Integer area_construida, Integer altura, String geometria, Integer ric_caracteristicasunidadconstruccion, Integer ric_construccion, Integer dimension, String etiqueta, Integer relacion_superficie, Integer nivel, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.planta_ubicacion = planta_ubicacion;
        this.area_construida = area_construida;
        this.altura = altura;
        this.geometria = geometria;
        this.ric_caracteristicasunidadconstruccion = ric_caracteristicasunidadconstruccion;
        this.ric_construccion = ric_construccion;
        this.dimension = dimension;
        this.etiqueta = etiqueta;
        this.relacion_superficie = relacion_superficie;
        this.nivel = nivel;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public ric_unidadconstruccion() {
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

    public Integer getPlanta_ubicacion() {
        return planta_ubicacion;
    }

    public void setPlanta_ubicacion(Integer planta_ubicacion) {
        this.planta_ubicacion = planta_ubicacion;
    }

    public Integer getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(Integer area_construida) {
        this.area_construida = area_construida;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public Integer getRic_caracteristicasunidadconstruccion() {
        return ric_caracteristicasunidadconstruccion;
    }

    public void setRic_caracteristicasunidadconstruccion(Integer ric_caracteristicasunidadconstruccion) {
        this.ric_caracteristicasunidadconstruccion = ric_caracteristicasunidadconstruccion;
    }

    public Integer getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Integer ric_construccion) {
        this.ric_construccion = ric_construccion;
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
        return "ric_unidadconstruccion{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", planta_ubicacion=" + planta_ubicacion +
                ", area_construida=" + area_construida +
                ", altura=" + altura +
                ", geometria='" + geometria + '\'' +
                ", ric_caracteristicasunidadconstruccion=" + ric_caracteristicasunidadconstruccion +
                ", ric_construccion=" + ric_construccion +
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
