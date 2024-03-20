package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_derecho", schema = "temporal")
public class Temporal_derecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Temporal_derechotipo temporal_derechotipo;
    @Column(nullable = true)
    private Float fraccion_derecho;
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio_tenencia;
    @Column(nullable = true, length = 255)
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = true)
    private Temporal_interesado temporal_interesado;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    private Temporal_agrupacioninteresados temporal_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "unidad", referencedColumnName = "t_id", nullable = true)
    private Temporal_predio temporal_predio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;


    public Temporal_derecho(Integer t_id, UUID t_ili_tid, Temporal_derechotipo temporal_derechotipo, Float fraccion_derecho, Date fecha_inicio_tenencia, String descripcion, Temporal_interesado temporal_interesado, Temporal_agrupacioninteresados temporal_agrupacioninteresados, com.example.catastral.Entities.Temporal_predio temporal_predio, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.temporal_derechotipo = temporal_derechotipo;
        this.fraccion_derecho = fraccion_derecho;
        this.fecha_inicio_tenencia = fecha_inicio_tenencia;
        this.descripcion = descripcion;
        this.temporal_interesado = temporal_interesado;
        this.temporal_agrupacioninteresados = temporal_agrupacioninteresados;
        this.temporal_predio = temporal_predio;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_derecho() {
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

    public Temporal_derechotipo getTemporal_derechotipo() {
        return temporal_derechotipo;
    }

    public void setTemporal_derechotipo(Temporal_derechotipo temporal_derechotipo) {
        this.temporal_derechotipo = temporal_derechotipo;
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

    public Temporal_interesado getTemporal_interesado() {
        return temporal_interesado;
    }

    public void setTemporal_interesado(Temporal_interesado temporal_interesado) {
        this.temporal_interesado = temporal_interesado;
    }

    public Temporal_agrupacioninteresados getTemporal_agrupacioninteresados() {
        return temporal_agrupacioninteresados;
    }

    public void setTemporal_agrupacioninteresados(Temporal_agrupacioninteresados temporal_agrupacioninteresados) {
        this.temporal_agrupacioninteresados = temporal_agrupacioninteresados;
    }

    public Temporal_predio getTemporal_predio() {
        return temporal_predio;
    }

    public void setTemporal_predio(Temporal_predio temporal_predio) {
        this.temporal_predio = temporal_predio;
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

    @Override
    public String toString() {
        return "Temporal_derecho{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", temporal_derechotipo=" + temporal_derechotipo +
                ", fraccion_derecho=" + fraccion_derecho +
                ", fecha_inicio_tenencia=" + fecha_inicio_tenencia +
                ", descripcion='" + descripcion + '\'' +
                ", temporal_interesado=" + temporal_interesado +
                ", temporal_agrupacioninteresados=" + temporal_agrupacioninteresados +
                ", Temporal_predio=" + temporal_predio +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
