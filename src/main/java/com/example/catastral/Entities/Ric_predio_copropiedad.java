package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "ric_predio_copropiedad")
public class Ric_predio_copropiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_unidad_predial", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_predio ric_unidad_predial;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_matriz", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_predio ric_matriz;
    @Column(nullable = true)
    private Float coeficiente;

    public Ric_predio_copropiedad(Integer t_id, Ric_predio ric_unidad_predial, Ric_predio ric_matriz, Float coeficiente) {
        this.t_id = t_id;
        this.ric_unidad_predial = ric_unidad_predial;
        this.ric_matriz = ric_matriz;
        this.coeficiente = coeficiente;
    }

    public Ric_predio_copropiedad() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_predio getRic_unidad_predial() {
        return ric_unidad_predial;
    }

    public void setRic_unidad_predial(Ric_predio ric_unidad_predial) {
        this.ric_unidad_predial = ric_unidad_predial;
    }

    public Ric_predio getRic_matriz() {
        return ric_matriz;
    }

    public void setRic_matriz(Ric_predio ric_matriz) {
        this.ric_matriz = ric_matriz;
    }

    public Float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Float coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public String toString() {
        return "Ric_predio_copropiedad{" +
                "t_id=" + t_id +
                ", ric_unidad_predial=" + ric_unidad_predial +
                ", ric_matriz=" + ric_matriz +
                ", coeficiente=" + coeficiente +
                '}';
    }
}
