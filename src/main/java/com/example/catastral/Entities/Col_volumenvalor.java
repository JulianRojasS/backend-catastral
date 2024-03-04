package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_volumenvalor")
public class Col_volumenvalor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = false)
    private Float volumen_medicion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Col_volumentipo col_volumentipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_construccion_volumen", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrdcrdsrvcios_volumen", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrcndddfccion_volumen", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_terreno_volumen", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_unidadconstruccion_volumen", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_unidadconstruccion ric_unidadconstruccion;

    public Col_volumenvalor(Integer t_id, Integer t_seq, Float volumen_medicion, Col_volumentipo col_volumentipo, Ric_construccion ric_construccion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_terreno ric_terreno, Ric_unidadconstruccion ric_unidadconstruccion) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.volumen_medicion = volumen_medicion;
        this.col_volumentipo = col_volumentipo;
        this.ric_construccion = ric_construccion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_terreno = ric_terreno;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    public Col_volumenvalor() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getT_seq() {
        return t_seq;
    }

    public void setT_seq(Integer t_seq) {
        this.t_seq = t_seq;
    }

    public Float getVolumen_medicion() {
        return volumen_medicion;
    }

    public void setVolumen_medicion(Float volumen_medicion) {
        this.volumen_medicion = volumen_medicion;
    }

    public Col_volumentipo getCol_volumentipo() {
        return col_volumentipo;
    }

    public void setCol_volumentipo(Col_volumentipo col_volumentipo) {
        this.col_volumentipo = col_volumentipo;
    }

    public Ric_construccion getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Ric_construccion ric_construccion) {
        this.ric_construccion = ric_construccion;
    }

    public Ric_nu_espaciojuridicoredservicios getRic_nu_espaciojuridicoredservicios() {
        return ric_nu_espaciojuridicoredservicios;
    }

    public void setRic_nu_espaciojuridicoredservicios(Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Ric_nu_espaciojuridicounidadedificacion getRic_nu_espaciojuridicounidadedificacion() {
        return ric_nu_espaciojuridicounidadedificacion;
    }

    public void setRic_nu_espaciojuridicounidadedificacion(Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion) {
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
    }

    public Ric_terreno getRic_terreno() {
        return ric_terreno;
    }

    public void setRic_terreno(Ric_terreno ric_terreno) {
        this.ric_terreno = ric_terreno;
    }

    public Ric_unidadconstruccion getRic_unidadconstruccion() {
        return ric_unidadconstruccion;
    }

    public void setRic_unidadconstruccion(Ric_unidadconstruccion ric_unidadconstruccion) {
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    @Override
    public String toString() {
        return "col_volumenvalor{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", volumen_medicion=" + volumen_medicion +
                ", col_volumentipo=" + col_volumentipo +
                ", ric_construccion=" + ric_construccion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                ", ric_nu_espaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_terreno=" + ric_terreno +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                '}';
    }
}
