package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_baunitcomointeresado", schema = "public")
public class Col_baunitcomointeresado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = false)
    private Ric_interesado ric_interesado;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = false)
    private Ric_agrupacioninteresados ric_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "unidad", referencedColumnName = "t_id", nullable = false)
    private Ric_predio ric_predio;

    public Col_baunitcomointeresado(Integer t_id, Ric_interesado ric_interesado, Ric_agrupacioninteresados ric_agrupacioninteresados, Ric_predio ric_predio) {
        this.t_id = t_id;
        this.ric_interesado = ric_interesado;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
        this.ric_predio = ric_predio;
    }

    public Col_baunitcomointeresado() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_interesado getRic_interesado() {
        return ric_interesado;
    }

    public void setRic_interesado(Ric_interesado ric_interesado) {
        this.ric_interesado = ric_interesado;
    }

    public Ric_agrupacioninteresados getRic_agrupacioninteresados() {
        return ric_agrupacioninteresados;
    }

    public void setRic_agrupacioninteresados(Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    @Override
    public String toString() {
        return "Col_baunitcomointeresado{" +
                "t_id=" + t_id +
                ", ric_interesado=" + ric_interesado +
                ", ric_agrupacioninteresados=" + ric_agrupacioninteresados +
                ", ric_predio=" + ric_predio +
                '}';
    }
}
