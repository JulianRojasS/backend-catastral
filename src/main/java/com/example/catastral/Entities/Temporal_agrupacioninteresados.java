package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_agrupacioninteresados", schema = "temporal")
public class Temporal_agrupacioninteresados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Temporal_grupointeresadotipo temporal_grupointeresadotipo;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date comienzo_vida_util_version;
    @Temporal(TemporalType.DATE)
    private Date fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "temporal_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_derecho> temporalderecho;
    @OneToMany(mappedBy = "temporal_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_miembros> temporalmiembrosia;
    @OneToMany(mappedBy = "temporal_agrupacioni", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_miembros> temporalmiembrosa;


    public Temporal_agrupacioninteresados(Integer t_id, UUID t_ili_tid, Temporal_grupointeresadotipo temporal_grupointeresadotipo, String nombre, Date comienzo_vida_util_version, Date fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.temporal_grupointeresadotipo = temporal_grupointeresadotipo;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_agrupacioninteresados() {
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

    public Temporal_grupointeresadotipo getTemporal_grupointeresadotipo() {
        return temporal_grupointeresadotipo;
    }

    public void setTemporal_grupointeresadotipo(Temporal_grupointeresadotipo temporal_grupointeresadotipo) {
        this.temporal_grupointeresadotipo = temporal_grupointeresadotipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Date comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Date getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Date fin_vida_util_version) {
        this.fin_vida_util_version = fin_vida_util_version;
    }

    public String getEspacio_de_nombres() {
        return espacio_de_nombres;
    }

    public void setEspacio_de_nombres(String espacio_de_nombres) {
        this.espacio_de_nombres = espacio_de_nombres;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    @Override
    public String toString() {
        return "Temporal_agrupacioninteresados{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", temporal_grupointeresadotipo=" + temporal_grupointeresadotipo +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
