package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ric_datosphcondominio", schema = "public")
public class Ric_datosphcondominio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = true)
    private Float area_total_terreno;
    @Column(nullable = true)
    private Float area_total_terreno_privada;
    @Column(nullable = true)
    private Float area_total_terreno_comun;
    @Column(nullable = true)
    private Float area_total_construida;
    @Column(nullable = true)
    private Float area_total_construida_privada;
    @Column(nullable = true)
    private Float area_total_construida_comun;
    @Column(nullable = true)
    private Integer numero_torres;
    @Column(nullable = true)
    private Integer total_unidades_privadas;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_predio", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio;

    public Ric_datosphcondominio(Integer t_id, UUID t_ili_tid, Float area_total_terreno, Float area_total_terreno_privada, Float area_total_terreno_comun, Float area_total_construida, Float area_total_construida_privada, Float area_total_construida_comun, Integer numero_torres, Integer total_unidades_privadas, Ric_predio ric_predio) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.area_total_terreno = area_total_terreno;
        this.area_total_terreno_privada = area_total_terreno_privada;
        this.area_total_terreno_comun = area_total_terreno_comun;
        this.area_total_construida = area_total_construida;
        this.area_total_construida_privada = area_total_construida_privada;
        this.area_total_construida_comun = area_total_construida_comun;
        this.numero_torres = numero_torres;
        this.total_unidades_privadas = total_unidades_privadas;
        this.ric_predio = ric_predio;
    }

    public Ric_datosphcondominio() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public UUID getT_ili_tid() {
        return t_ili_tid;
    }

    public void setT_ili_tid(UUID t_ili_tid) {
        this.t_ili_tid = t_ili_tid;
    }

    public Float getArea_total_terreno() {
        return area_total_terreno;
    }

    public void setArea_total_terreno(Float area_total_terreno) {
        this.area_total_terreno = area_total_terreno;
    }

    public Float getArea_total_terreno_privada() {
        return area_total_terreno_privada;
    }

    public void setArea_total_terreno_privada(Float area_total_terreno_privada) {
        this.area_total_terreno_privada = area_total_terreno_privada;
    }

    public Float getArea_total_terreno_comun() {
        return area_total_terreno_comun;
    }

    public void setArea_total_terreno_comun(Float area_total_terreno_comun) {
        this.area_total_terreno_comun = area_total_terreno_comun;
    }

    public Float getArea_total_construida() {
        return area_total_construida;
    }

    public void setArea_total_construida(Float area_total_construida) {
        this.area_total_construida = area_total_construida;
    }

    public Float getArea_total_construida_privada() {
        return area_total_construida_privada;
    }

    public void setArea_total_construida_privada(Float area_total_construida_privada) {
        this.area_total_construida_privada = area_total_construida_privada;
    }

    public Float getArea_total_construida_comun() {
        return area_total_construida_comun;
    }

    public void setArea_total_construida_comun(Float area_total_construida_comun) {
        this.area_total_construida_comun = area_total_construida_comun;
    }

    public Integer getNumero_torres() {
        return numero_torres;
    }

    public void setNumero_torres(Integer numero_torres) {
        this.numero_torres = numero_torres;
    }

    public Integer getTotal_unidades_privadas() {
        return total_unidades_privadas;
    }

    public void setTotal_unidades_privadas(Integer total_unidades_privadas) {
        this.total_unidades_privadas = total_unidades_privadas;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    @Override
    public String toString() {
        return "Ric_datosphcondominio{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", area_total_terreno=" + area_total_terreno +
                ", area_total_terreno_privada=" + area_total_terreno_privada +
                ", area_total_terreno_comun=" + area_total_terreno_comun +
                ", area_total_construida=" + area_total_construida +
                ", area_total_construida_privada=" + area_total_construida_privada +
                ", area_total_construida_comun=" + area_total_construida_comun +
                ", numero_torres=" + numero_torres +
                ", total_unidades_privadas=" + total_unidades_privadas +
                ", ric_predio=" + ric_predio +
                '}';
    }
}
