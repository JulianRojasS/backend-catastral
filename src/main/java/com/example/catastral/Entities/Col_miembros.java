package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_miembros", schema = "public")
public class Col_miembros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = true)
    private Ric_interesado ric_interesado;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    private Ric_agrupacioninteresados ric_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "agrupacion", referencedColumnName = "t_id", nullable = false)
    private Ric_agrupacioninteresados ric_agrupacioni;
    @Column(nullable = true)
    private Float participacion;

    public Col_miembros( Ric_interesado ric_interesado, Ric_agrupacioninteresados ric_agrupacioninteresados, Ric_agrupacioninteresados ric_agrupacioni, Float participacion) {
        this.ric_interesado = ric_interesado;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
        this.ric_agrupacioni = ric_agrupacioni;
        this.participacion = participacion;
    }

    public Col_miembros() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_interesado getRic_interesado() {
        return ric_interesado;
    }

    public void setRic_interesado(Ric_interesado ric_interesado) {
        this.ric_interesado = ric_interesado;
    }

    public Ric_agrupacioninteresados getRic_agrupacioninteresados() {
        return ric_agrupacioninteresados;
    }

    public void setRic_agrupacioninteresados(Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    public Ric_agrupacioninteresados getRic_agrupacioni() {
        return ric_agrupacioni;
    }

    public void setRic_agrupacioni(Ric_agrupacioninteresados ric_agrupacioni) {
        this.ric_agrupacioni = ric_agrupacioni;
    }

    public Float getParticipacion() {
        return participacion;
    }

    public void setParticipacion(Float participacion) {
        this.participacion = participacion;
    }

    @Override
    public String toString() {
        return "Col_miembros{" +
                "t_id=" + t_id +
                ", ric_interesado=" + ric_interesado +
                ", ric_agrupacioninteresados=" + ric_agrupacioninteresados +
                ", ric_agrupacioni=" + ric_agrupacioni +
                ", participacion=" + participacion +
                '}';
    }
}
