package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_puntoccl", schema = "ric")
public class Col_puntoccl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "punto", referencedColumnName = "t_id", nullable = false)
    private Ric_nu_punto ric_nu_punto;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ccl", referencedColumnName = "t_id", nullable = false)
    private Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite;

    public Col_puntoccl(Integer t_id, Ric_nu_punto ric_nu_punto, Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite) {
        this.t_id = t_id;
        this.ric_nu_punto = ric_nu_punto;
        this.ric_nu_cadenacaraslimite = ric_nu_cadenacaraslimite;
    }

    public Col_puntoccl() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_nu_punto getRic_nu_punto() {
        return ric_nu_punto;
    }

    public void setRic_nu_punto(Ric_nu_punto ric_nu_punto) {
        this.ric_nu_punto = ric_nu_punto;
    }

    public Ric_nu_cadenacaraslimite getRic_nu_cadenacaraslimite() {
        return ric_nu_cadenacaraslimite;
    }

    public void setRic_nu_cadenacaraslimite(Ric_nu_cadenacaraslimite ric_nu_cadenacaraslimite) {
        this.ric_nu_cadenacaraslimite = ric_nu_cadenacaraslimite;
    }

    @Override
    public String toString() {
        return "col_puntoccl{" +
                "t_id=" + t_id +
                ", ric_nu_punto=" + ric_nu_punto +
                ", ric_nu_cadenacaraslimite=" + ric_nu_cadenacaraslimite +
                '}';
    }
}
