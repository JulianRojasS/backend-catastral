package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_operadorcatastral", schema = "temporal")
public class Temporal_operadorcatastral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false, length = 50)
    private String nombre_operador;
    @Column(nullable = false, length = 20)
    private String nit_operador_catastral;
    @OneToMany(mappedBy = "temporal_operadorcatastral", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_predio> temporalpredio;

    public Temporal_operadorcatastral(Integer t_id, UUID t_ili_tid, String nombre_operador, String nit_operador_catastral) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.nombre_operador = nombre_operador;
        this.nit_operador_catastral = nit_operador_catastral;
    }

    public Temporal_operadorcatastral() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public UUID getT_ili_tid() {
        return t_ili_tid;
    }

    public void setT_ili_tid(UUID t_ili_tid) {
        this.t_ili_tid = t_ili_tid;
    }

    public String getNombre_operador() {
        return nombre_operador;
    }

    public void setNombre_operador(String nombre_operador) {
        this.nombre_operador = nombre_operador;
    }

    public String getNit_operador_catastral() {
        return nit_operador_catastral;
    }

    public void setNit_operador_catastral(String nit_operador_catastral) {
        this.nit_operador_catastral = nit_operador_catastral;
    }


    @Override
    public String toString() {
        return "Temporal_operadorcatastral{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", nombre_operador='" + nombre_operador + '\'' +
                ", nit_operador_catastral='" + nit_operador_catastral + '\'' +
                '}';
    }
}
