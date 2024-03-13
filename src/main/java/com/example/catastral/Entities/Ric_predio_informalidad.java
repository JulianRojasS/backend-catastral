package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "ric_predio_informalidad", schema = "ric")
public class Ric_predio_informalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_predio_formal", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio_formal;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_predio_informal", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio_informal;

    public Ric_predio_informalidad(Integer t_id, Ric_predio ric_predio_formal, Ric_predio ric_predio_informal) {
        this.t_id = t_id;
        this.ric_predio_formal = ric_predio_formal;
        this.ric_predio_informal = ric_predio_informal;
    }

    public Ric_predio_informalidad() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_predio getric_predio_formal() {
        return ric_predio_formal;
    }

    public void setric_predio_formal(Ric_predio ric_predio_formal) {
        this.ric_predio_formal = ric_predio_formal;
    }

    public Ric_predio getric_predio_informal() {
        return ric_predio_informal;
    }

    public void setric_predio_informal(Ric_predio ric_predio_informal) {
        this.ric_predio_informal = ric_predio_informal;
    }

    @Override
    public String toString() {
        return "Ric_predio_informalidad{" +
                "t_id=" + t_id +
                ", ric_predio_formal=" + ric_predio_formal +
                ", ric_predio_informal=" + ric_predio_informal +
                '}';
    }
}
