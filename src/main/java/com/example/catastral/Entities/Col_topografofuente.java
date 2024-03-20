package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_topografofuente", schema = "public")
public class Col_topografofuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteespacial ric_fuenteespacial;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "topografo_ric_interesado", referencedColumnName = "t_id", nullable = true)
    private Ric_interesado ric_interesado;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "topografo_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    private Ric_agrupacioninteresados ric_agrupacioninteresados;

    public Col_topografofuente(Integer t_id, Ric_fuenteespacial ric_fuenteespacial, Ric_interesado ric_interesado, Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.t_id = t_id;
        this.ric_fuenteespacial = ric_fuenteespacial;
        this.ric_interesado = ric_interesado;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    public Col_topografofuente() {
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

    @Override
    public String toString() {
        return "Col_topografofuente{" +
                "t_id=" + t_id +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                ", ric_interesado=" + ric_interesado +
                ", ric_agrupacioninteresados=" + ric_agrupacioninteresados +
                '}';
    }
}
