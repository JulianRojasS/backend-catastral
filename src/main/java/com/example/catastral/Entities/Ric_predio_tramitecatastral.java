package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "ric_predio_tramitecatastral", schema = "public")
public class Ric_predio_tramitecatastral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_predio", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_tramite_catastral", referencedColumnName = "t_id", nullable = false)
    private Ric_tramitecatastral ric_tramitecatastral;

    public Ric_predio_tramitecatastral(Integer t_id, Ric_predio ric_predio, Ric_tramitecatastral ric_tramitecatastral) {
        this.t_id = t_id;
        this.ric_predio = ric_predio;
        this.ric_tramitecatastral = ric_tramitecatastral;
    }

    public Ric_predio_tramitecatastral() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    public Ric_tramitecatastral getRic_tramitecatastral() {
        return ric_tramitecatastral;
    }

    public void setRic_tramitecatastral(Ric_tramitecatastral ric_tramitecatastral) {
        this.ric_tramitecatastral = ric_tramitecatastral;
    }

    @Override
    public String toString() {
        return "Ric_predio_tramitecatastral{" +
                "t_id=" + t_id +
                ", ric_predio=" + ric_predio +
                ", ric_tramitecatastral=" + ric_tramitecatastral +
                '}';
    }
}
