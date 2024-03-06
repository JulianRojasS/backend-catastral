package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
@Entity
@Table(name = "col_masccl", schema = "ric")
public class Col_masccl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ccl_mas", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_mas_ric_terreno", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_mas_ric_construccion", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_mas_ric_unidadconstruccion", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_unidadconstruccion ric_unidadconstruccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_mas_ric_nu_espaciojuridicounidadedificacion", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_mas_ric_nu_espaciojuridicoredservicios", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;

    public Col_masccl(Integer t_id, Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite, Ric_terreno ric_terreno, Ric_construccion ric_construccion, Ric_unidadconstruccion ric_unidadconstruccion, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.t_id = t_id;
        this.ric_nu_cadenacaraslimite = ric_nu_cadenacaraslimite;
        this.ric_terreno = ric_terreno;
        this.ric_construccion = ric_construccion;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Col_masccl() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_nu_cadenacaraslimite getRic_nu_cadenacaraslimite() {
        return ric_nu_cadenacaraslimite;
    }

    public void setRic_nu_cadenacaraslimite(Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite) {
        this.ric_nu_cadenacaraslimite = ric_nu_cadenacaraslimite;
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

    @Override
    public String toString() {
        return "Col_masccl{" +
                "t_id=" + t_id +
                ", ric_nu_caraslindero=" + ric_nu_cadenacaraslimite +
                ", ric_terreno=" + ric_terreno +
                ", ric_construccion=" + ric_construccion +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                ", ric_nu_espaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                '}';
    }
}
