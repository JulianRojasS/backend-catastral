package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_areavalor", schema = "ric")
public class Col_areavalor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Col_areatipo col_areatipo;
    @Column(nullable = false)
    private Float area;
    @Column(nullable = true)
    private String datos_proyeccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_construccion_area", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrdcrdsrvcios_area", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrcndddfccion_area", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_terreno_area", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_unidadconstruccion_area", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    Ric_unidadconstruccion ric_unidadconstruccion;

    public Col_areavalor(Integer t_id, Integer t_seq, Col_areatipo col_areatipo, Float area, String datos_proyeccion, Ric_construccion ric_construccion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_terreno ric_terreno, Ric_unidadconstruccion ric_unidadconstruccion) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.col_areatipo = col_areatipo;
        this.area = area;
        this.datos_proyeccion = datos_proyeccion;
        this.ric_construccion = ric_construccion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_terreno = ric_terreno;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    public Col_areavalor() {
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

    public Col_areatipo getCol_areatipo() {
        return col_areatipo;
    }

    public void setCol_areatipo(Col_areatipo col_areatipo) {
        this.col_areatipo = col_areatipo;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public String getDatos_proyeccion() {
        return datos_proyeccion;
    }

    public void setDatos_proyeccion(String datos_proyeccion) {
        this.datos_proyeccion = datos_proyeccion;
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

    public Ric_nu_espaciojuridicounidadedificacion getRicEspaciojuridicounidadedificacion() {
        return ric_nu_espaciojuridicounidadedificacion;
    }

    public void setRicEspaciojuridicounidadedificacion(Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion) {
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
        return "Col_areavalor{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", col_areatipo=" + col_areatipo +
                ", area=" + area +
                ", datos_proyeccion='" + datos_proyeccion + '\'' +
                ", ric_construccion=" + ric_construccion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                ", ricEspaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_terreno=" + ric_terreno +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                '}';
    }
}
