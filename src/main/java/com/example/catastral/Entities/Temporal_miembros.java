package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "temporal_miembros", schema = "temporal")
public class Temporal_miembros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = true)
    private Temporal_interesado temporal_interesado;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    private Temporal_agrupacioninteresados temporal_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "agrupacion", referencedColumnName = "t_id", nullable = false)
    private Temporal_agrupacioninteresados temporal_agrupacioni;
    @Column(nullable = true)
    private Float participacion;

    public Temporal_miembros(Integer t_id, Temporal_interesado temporal_interesado, Temporal_agrupacioninteresados temporal_agrupacioninteresados, Temporal_agrupacioninteresados temporal_agrupacioni, Float participacion) {
        this.t_id = t_id;
        this.temporal_interesado = temporal_interesado;
        this.temporal_agrupacioninteresados = temporal_agrupacioninteresados;
        this.temporal_agrupacioni = temporal_agrupacioni;
        this.participacion = participacion;
    }

    public Temporal_miembros() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Temporal_interesado getTemporal_interesado() {
        return temporal_interesado;
    }

    public void setTemporal_interesado(Temporal_interesado temporal_interesado) {
        this.temporal_interesado = temporal_interesado;
    }

    public Temporal_agrupacioninteresados getTemporal_agrupacioninteresados() {
        return temporal_agrupacioninteresados;
    }

    public void setTemporal_agrupacioninteresados(Temporal_agrupacioninteresados temporal_agrupacioninteresados) {
        this.temporal_agrupacioninteresados = temporal_agrupacioninteresados;
    }

    public Temporal_agrupacioninteresados getTemporal_agrupacioni() {
        return temporal_agrupacioni;
    }

    public void setTemporal_agrupacioni(Temporal_agrupacioninteresados temporal_agrupacioni) {
        this.temporal_agrupacioni = temporal_agrupacioni;
    }

    public Float getParticipacion() {
        return participacion;
    }

    public void setParticipacion(Float participacion) {
        this.participacion = participacion;
    }

    @Override
    public String toString() {
        return "Temporal_miembros{" +
                "t_id=" + t_id +
                ", temporal_interesado=" + temporal_interesado +
                ", temporal_agrupacioninteresados=" + temporal_agrupacioninteresados +
                ", temporal_agrupacioni=" + temporal_agrupacioni +
                ", participacion=" + participacion +
                '}';
    }
}
