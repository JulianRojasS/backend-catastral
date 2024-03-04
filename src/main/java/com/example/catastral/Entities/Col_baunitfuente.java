package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_baunitfuente")
public class Col_baunitfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_fuenteespacial ric_fuenteespacial;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "unidad", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_predio ric_predio;

    public Col_baunitfuente(Integer t_id, Ric_fuenteespacial ric_fuenteespacial, Ric_predio ric_predio) {
        this.t_id = t_id;
        this.ric_fuenteespacial = ric_fuenteespacial;
        this.ric_predio = ric_predio;
    }

    public Col_baunitfuente() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_fuenteespacial getRic_fuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRic_fuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    @Override
    public String toString() {
        return "Col_baunitfuente{" +
                "t_id=" + t_id +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                ", ric_predio=" + ric_predio +
                '}';
    }
}

