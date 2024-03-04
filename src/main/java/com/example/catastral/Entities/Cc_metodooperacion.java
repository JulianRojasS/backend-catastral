package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "cc_metodooperacion")
public class Cc_metodooperacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = false, length = 255)
    private String formula;
    @Column(nullable = true)
    private Integer dimensiones_origen;
    @Column(nullable = true)
    private Integer dimensiones_objetivo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "col_transformacion_transformacion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Col_transformacion col_transformacion;

    public Cc_metodooperacion(Integer t_id, Integer t_seq, String formula, Integer dimensiones_origen, Integer dimensiones_objetivo, Col_transformacion col_transformacion) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.formula = formula;
        this.dimensiones_origen = dimensiones_origen;
        this.dimensiones_objetivo = dimensiones_objetivo;
        this.col_transformacion = col_transformacion;
    }

    public Cc_metodooperacion() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getT_seq() {
        return t_seq;
    }

    public void setT_seq(Integer t_seq) {
        this.t_seq = t_seq;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Integer getDimensiones_origen() {
        return dimensiones_origen;
    }

    public void setDimensiones_origen(Integer dimensiones_origen) {
        this.dimensiones_origen = dimensiones_origen;
    }

    public Integer getDimensiones_objetivo() {
        return dimensiones_objetivo;
    }

    public void setDimensiones_objetivo(Integer dimensiones_objetivo) {
        this.dimensiones_objetivo = dimensiones_objetivo;
    }

    public Col_transformacion getCol_transformacion() {
        return col_transformacion;
    }

    public void setCol_transformacion(Col_transformacion col_transformacion) {
        this.col_transformacion = col_transformacion;
    }

    @Override
    public String toString() {
        return "Cc_metodooperacion{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", formula='" + formula + '\'' +
                ", dimensiones_origen=" + dimensiones_origen +
                ", dimensiones_objetivo=" + dimensiones_objetivo +
                ", col_transformacion=" + col_transformacion +
                '}';
    }
}
