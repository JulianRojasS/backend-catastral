package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_uefuente", schema = "public")
public class Col_uefuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_terreno", referencedColumnName = "t_id", nullable = true)
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_construccion", referencedColumnName = "t_id", nullable = true)
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_unidadconstruccion", referencedColumnName = "t_id", nullable = true)
    private Ric_unidadconstruccion ric_unidadconstruccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_nu_espaciojuridicounidadedificacion", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_nu_espaciojuridicoredservicios", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteespacial ric_fuenteespacial;

    public Col_uefuente(Integer t_id, Ric_terreno ric_terreno, Ric_construccion ric_construccion, Ric_unidadconstruccion ric_unidadconstruccion, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios, Ric_fuenteespacial ric_fuenteespacial) {
        this.t_id = t_id;
        this.ric_terreno = ric_terreno;
        this.ric_construccion = ric_construccion;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Col_uefuente() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_terreno getRic_terreno() {
        return ric_terreno;
    }

    public void setRic_terreno(Ric_terreno ric_terreno) {
        this.ric_terreno = ric_terreno;
    }

    public Ric_construccion getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Ric_construccion ric_construccion) {
        this.ric_construccion = ric_construccion;
    }

    public Ric_unidadconstruccion getRic_unidadconstruccion() {
        return ric_unidadconstruccion;
    }

    public void setRic_unidadconstruccion(Ric_unidadconstruccion ric_unidadconstruccion) {
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    public Ric_nu_espaciojuridicounidadedificacion getRic_nu_espaciojuridicounidadedificacion() {
        return ric_nu_espaciojuridicounidadedificacion;
    }

    public void setRic_nu_espaciojuridicounidadedificacion(Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion) {
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
    }

    public Ric_nu_espaciojuridicoredservicios getRic_nu_espaciojuridicoredservicios() {
        return ric_nu_espaciojuridicoredservicios;
    }

    public void setRic_nu_espaciojuridicoredservicios(Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Ric_fuenteespacial getRic_fuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRic_fuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    @Override
    public String toString() {
        return "Col_uefuente{" +
                "t_id=" + t_id +
                ", ric_terreno=" + ric_terreno +
                ", ric_construccion=" + ric_construccion +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                ", ric_nu_espaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                '}';
    }
}
