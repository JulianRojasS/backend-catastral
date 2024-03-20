package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_cclfuente", schema = "public")
public class Col_cclfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ccl", referencedColumnName = "t_id", nullable = false)
    private Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteespacial ric_fuenteespacial;

    public Col_cclfuente(Integer t_id, Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite, Ric_fuenteespacial ric_fuenteespacial) {
        this.t_id = t_id;
        this.ric_nu_cadenacaraslimite = ric_nu_cadenacaraslimite;
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Col_cclfuente() {
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

    public Ric_fuenteespacial getRic_fuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRic_fuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    @Override
    public String toString() {
        return "Col_cclfuente{" +
                "t_id=" + t_id +
                ", ric_nu_cadenacaraslimite=" + ric_nu_cadenacaraslimite +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                '}';
    }
}
