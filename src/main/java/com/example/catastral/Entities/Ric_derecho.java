package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_derecho")
public class Ric_derecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_derechotipo ric_derechotipo;
    @Column(nullable = true)
    private Float fraccion_derecho;
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio_tenencia;
    @Column(nullable = true, length = 255)
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_interesado ric_interesado;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_agrupacioninteresados ric_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "unidad", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_predio ric_predio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_derecho", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_rrrfuente> colrrrfuente;

    public Ric_derecho(Integer t_id, UUID t_ili_tid, Ric_derechotipo ric_derechotipo, Float fraccion_derecho, Date fecha_inicio_tenencia, String descripcion, Ric_interesado ric_interesado, Ric_agrupacioninteresados ric_agrupacioninteresados, Ric_predio ric_predio, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.ric_derechotipo = ric_derechotipo;
        this.fraccion_derecho = fraccion_derecho;
        this.fecha_inicio_tenencia = fecha_inicio_tenencia;
        this.descripcion = descripcion;
        this.ric_interesado = ric_interesado;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
        this.ric_predio = ric_predio;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_derecho() {
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

    public Ric_derechotipo getRic_derechotipo() {
        return ric_derechotipo;
    }

    public void setRic_derechotipo(Ric_derechotipo ric_derechotipo) {
        this.ric_derechotipo = ric_derechotipo;
    }

    public Float getFraccion_derecho() {
        return fraccion_derecho;
    }

    public void setFraccion_derecho(Float fraccion_derecho) {
        this.fraccion_derecho = fraccion_derecho;
    }

    public Date getFecha_inicio_tenencia() {
        return fecha_inicio_tenencia;
    }

    public void setFecha_inicio_tenencia(Date fecha_inicio_tenencia) {
        this.fecha_inicio_tenencia = fecha_inicio_tenencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Timestamp getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Timestamp comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Timestamp getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Timestamp fin_vida_util_version) {
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

    public Set<Col_rrrfuente> getColrrrfuente() {
        return colrrrfuente;
    }

    public void setColrrrfuente(Set<Col_rrrfuente> colrrrfuente) {
        this.colrrrfuente = colrrrfuente;
    }

    @Override
    public String toString() {
        return "Ric_derecho{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", ric_derechotipo=" + ric_derechotipo +
                ", fraccion_derecho=" + fraccion_derecho +
                ", fecha_inicio_tenencia=" + fecha_inicio_tenencia +
                ", descripcion='" + descripcion + '\'' +
                ", ric_interesado=" + ric_interesado +
                ", ric_agrupacioninteresados=" + ric_agrupacioninteresados +
                ", ric_predio=" + ric_predio +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
