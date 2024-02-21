package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class col_uebaunit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private Integer ue_ric_terreno;
    private Integer ue_ric_construccion;
    private Integer ue_ric_unidadconstruccion;
    private Integer ue_ric_nu_espaciojuridicounidadedificacion;
    private Integer ue_ric_nu_espaciojuridicoservicios;
    private Integer baunit;

    public col_uebaunit(Integer t_id, Integer ue_ric_terreno, Integer ue_ric_construccion, Integer ue_ric_unidadconstruccion, Integer ue_ric_nu_espaciojuridicounidadedificacion, Integer ue_ric_nu_espaciojuridicoservicios, Integer baunit) {
        this.t_id = t_id;
        this.ue_ric_terreno = ue_ric_terreno;
        this.ue_ric_construccion = ue_ric_construccion;
        this.ue_ric_unidadconstruccion = ue_ric_unidadconstruccion;
        this.ue_ric_nu_espaciojuridicounidadedificacion = ue_ric_nu_espaciojuridicounidadedificacion;
        this.ue_ric_nu_espaciojuridicoservicios = ue_ric_nu_espaciojuridicoservicios;
        this.baunit = baunit;
    }

    public col_uebaunit() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getUe_ric_terreno() {
        return ue_ric_terreno;
    }

    public void setUe_ric_terreno(Integer ue_ric_terreno) {
        this.ue_ric_terreno = ue_ric_terreno;
    }

    public Integer getUe_ric_construccion() {
        return ue_ric_construccion;
    }

    public void setUe_ric_construccion(Integer ue_ric_construccion) {
        this.ue_ric_construccion = ue_ric_construccion;
    }

    public Integer getUe_ric_unidadconstruccion() {
        return ue_ric_unidadconstruccion;
    }

    public void setUe_ric_unidadconstruccion(Integer ue_ric_unidadconstruccion) {
        this.ue_ric_unidadconstruccion = ue_ric_unidadconstruccion;
    }

    public Integer getUe_ric_nu_espaciojuridicounidadedificacion() {
        return ue_ric_nu_espaciojuridicounidadedificacion;
    }

    public void setUe_ric_nu_espaciojuridicounidadedificacion(Integer ue_ric_nu_espaciojuridicounidadedificacion) {
        this.ue_ric_nu_espaciojuridicounidadedificacion = ue_ric_nu_espaciojuridicounidadedificacion;
    }

    public Integer getUe_ric_nu_espaciojuridicoservicios() {
        return ue_ric_nu_espaciojuridicoservicios;
    }

    public void setUe_ric_nu_espaciojuridicoservicios(Integer ue_ric_nu_espaciojuridicoservicios) {
        this.ue_ric_nu_espaciojuridicoservicios = ue_ric_nu_espaciojuridicoservicios;
    }

    public Integer getBaunit() {
        return baunit;
    }

    public void setBaunit(Integer baunit) {
        this.baunit = baunit;
    }

    @Override
    public String toString() {
        return "col_uebaunit{" +
                "t_id=" + t_id +
                ", ue_ric_terreno=" + ue_ric_terreno +
                ", ue_ric_construccion=" + ue_ric_construccion +
                ", ue_ric_unidadconstruccion=" + ue_ric_unidadconstruccion +
                ", ue_ric_nu_espaciojuridicounidadedificacion=" + ue_ric_nu_espaciojuridicounidadedificacion +
                ", ue_ric_nu_espaciojuridicoservicios=" + ue_ric_nu_espaciojuridicoservicios +
                ", baunit=" + baunit +
                '}';
    }
}
