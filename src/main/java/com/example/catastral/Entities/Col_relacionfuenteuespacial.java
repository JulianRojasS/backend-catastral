package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_relacionfuenteuespacial")
public class Col_relacionfuenteuespacial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_espacial" , referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_fuenteespacial ric_fuenteespacial;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "relacionrequeridaue" , referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_nu_relacionnecesariaunidadesespaciales ric_nu_relacionnecesariaunidadesespaciales;

    public Col_relacionfuenteuespacial(Integer t_id, Ric_fuenteespacial ric_fuenteespacial, Ric_nu_relacionnecesariaunidadesespaciales ric_nu_relacionnecesariaunidadesespaciales) {
        this.t_id = t_id;
        this.ric_fuenteespacial = ric_fuenteespacial;
        this.ric_nu_relacionnecesariaunidadesespaciales = ric_nu_relacionnecesariaunidadesespaciales;
    }

    public Col_relacionfuenteuespacial() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_fuenteespacial getRicfuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRicfuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Ric_nu_relacionnecesariaunidadesespaciales getRicnurelacionnecesariaunidadesespaciales() {
        return ric_nu_relacionnecesariaunidadesespaciales;
    }

    public void setRicnurelacionnecesariaunidadesespaciales(Ric_nu_relacionnecesariaunidadesespaciales ric_nu_relacionnecesariaunidadesespaciales) {
        this.ric_nu_relacionnecesariaunidadesespaciales = ric_nu_relacionnecesariaunidadesespaciales;
    }

    @Override
    public String toString() {
        return "Col_relacionfuenteuespacial{" +
                "t_id=" + t_id +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                ", ric_nu_relacionnecesariaunidadesespaciales=" + ric_nu_relacionnecesariaunidadesespaciales +
                '}';
    }
}
