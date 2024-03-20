package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_gestorcatastral", schema = "temporal")
public class Temporal_gestorcatastral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false, length = 50)
    private String nombre_gestor;
    @Column(nullable = false, length = 20)
    private String nit_gestor_catastral;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha_inicio_prestacion_servicio;
    @OneToMany(mappedBy = "temporal_gestorcatastral", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_predio> temporalpredio;

    public Temporal_gestorcatastral(Integer t_id, UUID t_ili_tid, String nombre_gestor, String nit_gestor_catastral, Date fecha_inicio_prestacion_servicio) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.nombre_gestor = nombre_gestor;
        this.nit_gestor_catastral = nit_gestor_catastral;
        this.fecha_inicio_prestacion_servicio = fecha_inicio_prestacion_servicio;
    }

    public Temporal_gestorcatastral() {
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

    public String getNombre_gestor() {
        return nombre_gestor;
    }

    public void setNombre_gestor(String nombre_gestor) {
        this.nombre_gestor = nombre_gestor;
    }

    public String getNit_gestor_catastral() {
        return nit_gestor_catastral;
    }

    public void setNit_gestor_catastral(String nit_gestor_catastral) {
        this.nit_gestor_catastral = nit_gestor_catastral;
    }

    public Date getFecha_inicio_prestacion_servicio() {
        return fecha_inicio_prestacion_servicio;
    }

    public void setFecha_inicio_prestacion_servicio(Date fecha_inicio_prestacion_servicio) {
        this.fecha_inicio_prestacion_servicio = fecha_inicio_prestacion_servicio;
    }

    @Override
    public String toString() {
        return "Temporal_gestorcatastral{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", nombre_gestor='" + nombre_gestor + '\'' +
                ", nit_gestor_catastral='" + nit_gestor_catastral + '\'' +
                ", fecha_inicio_prestacion_servicio=" + fecha_inicio_prestacion_servicio +
                '}';
    }
}
