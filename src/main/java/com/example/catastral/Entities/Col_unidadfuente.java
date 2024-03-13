package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Col_unidadfuente", schema = "ric")
public class Col_unidadfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fuente_administrativa", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteadministrativa ric_fuenteadministrativa;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "unidad", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio;

    public Col_unidadfuente( Ric_fuenteadministrativa ric_fuenteadministrativa, Ric_predio ric_predio) {
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
        this.ric_predio = ric_predio;
    }

    public Col_unidadfuente() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_fuenteadministrativa getRic_fuenteadministrativa() {
        return ric_fuenteadministrativa;
    }

    public void setRic_fuenteadministrativa(Ric_fuenteadministrativa ric_fuenteadministrativa) {
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    @Override
    public String toString() {
        return "Col_unidadfuente{" +
                "t_id=" + t_id +
                ", ric_fuenteadministrativa=" + ric_fuenteadministrativa +
                ", ric_predio=" + ric_predio +
                '}';
    }
}
