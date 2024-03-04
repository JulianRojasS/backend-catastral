package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_clfuente")
public class Col_clfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "cl", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_nu_caraslindero ric_nu_caraslindero;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_fuenteespacial ric_fuenteespacial;

    public Col_clfuente(Integer t_id, Ric_nu_caraslindero ric_nu_caraslindero, Ric_fuenteespacial ric_fuenteespacial) {
        this.t_id = t_id;
        this.ric_nu_caraslindero = ric_nu_caraslindero;
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Col_clfuente() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_nu_caraslindero getRic_nu_caraslindero() {
        return ric_nu_caraslindero;
    }

    public void setRic_nu_caraslindero(Ric_nu_caraslindero ric_nu_caraslindero) {
        this.ric_nu_caraslindero = ric_nu_caraslindero;
    }

    public Ric_fuenteespacial getRic_fuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRic_fuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    @Override
    public String toString() {
        return "Col_clfuente{" +
                "t_id=" + t_id +
                ", ric_nu_caraslindero=" + ric_nu_caraslindero +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                '}';
    }
}
