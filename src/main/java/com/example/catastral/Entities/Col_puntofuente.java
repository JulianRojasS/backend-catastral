package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_puntofuente", schema = "public")
public class Col_puntofuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteespacial ric_fuenteespacial;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "punto", referencedColumnName = "t_id", nullable = false)
    private Ric_nu_punto ric_nu_punto;

    public Col_puntofuente(Integer t_id, Ric_fuenteespacial ric_fuenteespacial, Ric_nu_punto ric_nu_punto) {
        this.t_id = t_id;
        this.ric_fuenteespacial = ric_fuenteespacial;
        this.ric_nu_punto = ric_nu_punto;
    }

    public Col_puntofuente() {
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

    public Ric_nu_punto getRic_nu_punto() {
        return ric_nu_punto;
    }

    public void setRic_nu_punto(Ric_nu_punto ric_nu_punto) {
        this.ric_nu_punto = ric_nu_punto;
    }

    @Override
    public String toString() {
        return "Col_puntofuente{" +
                "t_id=" + t_id +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                ", ric_nu_punto=" + ric_nu_punto +
                '}';
    }
}
