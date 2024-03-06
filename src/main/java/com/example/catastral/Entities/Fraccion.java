package com.example.catastral.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "fraccion", schema = "ric")
public class Fraccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = false)
    private Integer denominador;
    @Column(nullable = false)
    private Integer numerador;

    public Fraccion(Integer t_id, Integer t_seq, Integer denominador, Integer numerador) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public Fraccion() {
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

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }

    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", denominador=" + denominador +
                ", numerador=" + numerador +
                '}';
    }
}
