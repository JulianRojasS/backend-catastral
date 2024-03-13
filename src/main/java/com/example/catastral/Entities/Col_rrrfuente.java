package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_rrrfuente", schema = "ric")
public class Col_rrrfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fuente_administrativa", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteadministrativa ric_fuenteadministrativa;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rrr", referencedColumnName = "t_id", nullable = false)
    private Ric_derecho ric_derecho;

    public Col_rrrfuente(Ric_fuenteadministrativa ric_fuenteadministrativa, Ric_derecho ric_derecho) {
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
        this.ric_derecho = ric_derecho;
    }

    public Col_rrrfuente() {
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

    public Ric_derecho getRic_derecho() {
        return ric_derecho;
    }

    public void setRic_derecho(Ric_derecho ric_derecho) {
        this.ric_derecho = ric_derecho;
    }

    @Override
    public String toString() {
        return "Col_rrrfuente{" +
                "t_id=" + t_id +
                ", ric_fuenteadministrativa=" + ric_fuenteadministrativa +
                ", ric_derecho=" + ric_derecho +
                '}';
    }
}
