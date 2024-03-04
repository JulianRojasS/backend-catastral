package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "extredserviciosfisica")
public class Extredserviciosfisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = true)
    private Boolean orientada;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrdcrdsrvcios_ext_id_red_fisica", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @OneToMany(mappedBy = "extredserviciosfisica", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Extinteresado> extinteresado;

    public Extredserviciosfisica(Integer t_id, Integer t_seq, Boolean orientada, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.orientada = orientada;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Extredserviciosfisica() {
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

    public Boolean getOrientada() {
        return orientada;
    }

    public void setOrientada(Boolean orientada) {
        this.orientada = orientada;
    }

    public Ric_nu_espaciojuridicoredservicios getRic_nu_espaciojuridicoredservicios() {
        return ric_nu_espaciojuridicoredservicios;
    }

    public void setRic_nu_espaciojuridicoredservicios(Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Set<Extinteresado> getExtinteresado() {
        return extinteresado;
    }

    public void setExtinteresado(Set<Extinteresado> extinteresado) {
        this.extinteresado = extinteresado;
    }

    @Override
    public String toString() {
        return "Extredserviciosfisica{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", orientada=" + orientada +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                '}';
    }
}
