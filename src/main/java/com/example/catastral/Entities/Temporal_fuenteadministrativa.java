package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "temporal_fuenteadministrativa", schema = "temporal")
public class Temporal_fuenteadministrativa {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Temporal_fuenteadministrativatipo temporal_fuenteadministrativatipo;
    @Column(nullable = true, length = 255)
    private String ente_emisor;
    @Column(nullable = true)
    private Integer oficina_origen;
    @Column(nullable = true, length = 60)
    private String ciudad_origen;
    @Column(nullable = true, length = 255)
    private String observacion;
    @Column(nullable = true, length = 150)
    private String numero_fuente;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_disponibilidad", referencedColumnName = "t_id", nullable = false)
    private Temporal_estadodisponibilidadtipo temporal_estadodisponibilidadtipo;
    @ManyToOne(fetch = FetchType.LAZY,  optional = false)
    @JoinColumn(name = "tipo_principal", referencedColumnName = "t_id", nullable = true)
    private Temporal_forma_presentacion_codigo temporal_forma_presentacion_codigo;
    @Temporal(TemporalType.DATE)
    private Date fecha_documento_fuente;
    @Column(nullable = true, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    public Temporal_fuenteadministrativa(Integer t_id, UUID t_ili_tid, com.example.catastral.Entities.Temporal_fuenteadministrativatipo temporal_fuenteadministrativatipo, String ente_emisor, Integer oficina_origen, String ciudad_origen, String observacion, String numero_fuente, Temporal_estadodisponibilidadtipo temporal_estadodisponibilidadtipo, Temporal_forma_presentacion_codigo temporal_forma_presentacion_codigo, Date fecha_documento_fuente, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.temporal_fuenteadministrativatipo = temporal_fuenteadministrativatipo;
        this.ente_emisor = ente_emisor;
        this.oficina_origen = oficina_origen;
        this.ciudad_origen = ciudad_origen;
        this.observacion = observacion;
        this.numero_fuente = numero_fuente;
        this.temporal_estadodisponibilidadtipo = temporal_estadodisponibilidadtipo;
        this.temporal_forma_presentacion_codigo = temporal_forma_presentacion_codigo;
        this.fecha_documento_fuente = fecha_documento_fuente;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_fuenteadministrativa() {
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

    public Temporal_fuenteadministrativatipo getTemporal_fuenteadministrativatipo() {
        return temporal_fuenteadministrativatipo;
    }

    public void setTemporal_fuenteadministrativatipo(Temporal_fuenteadministrativatipo temporal_fuenteadministrativatipo) {
        this.temporal_fuenteadministrativatipo = temporal_fuenteadministrativatipo;
    }

    public String getEnte_emisor() {
        return ente_emisor;
    }

    public void setEnte_emisor(String ente_emisor) {
        this.ente_emisor = ente_emisor;
    }

    public Integer getOficina_origen() {
        return oficina_origen;
    }

    public void setOficina_origen(Integer oficina_origen) {
        this.oficina_origen = oficina_origen;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNumero_fuente() {
        return numero_fuente;
    }

    public void setNumero_fuente(String numero_fuente) {
        this.numero_fuente = numero_fuente;
    }

    public Temporal_estadodisponibilidadtipo getTemporal_estadodisponibilidadtipo() {
        return temporal_estadodisponibilidadtipo;
    }

    public void setTemporal_estadodisponibilidadtipo(Temporal_estadodisponibilidadtipo temporal_estadodisponibilidadtipo) {
        this.temporal_estadodisponibilidadtipo = temporal_estadodisponibilidadtipo;
    }

    public Temporal_forma_presentacion_codigo getTemporal_forma_presentacion_codigo() {
        return temporal_forma_presentacion_codigo;
    }

    public void setTemporal_forma_presentacion_codigo(Temporal_forma_presentacion_codigo temporal_forma_presentacion_codigo) {
        this.temporal_forma_presentacion_codigo = temporal_forma_presentacion_codigo;
    }

    public Date getFecha_documento_fuente() {
        return fecha_documento_fuente;
    }

    public void setFecha_documento_fuente(Date fecha_documento_fuente) {
        this.fecha_documento_fuente = fecha_documento_fuente;
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
        return "Temporal_fuenteadministrativa{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", Temporal_fuenteadministrativatipo=" + temporal_fuenteadministrativatipo +
                ", ente_emisor='" + ente_emisor + '\'' +
                ", oficina_origen=" + oficina_origen +
                ", ciudad_origen='" + ciudad_origen + '\'' +
                ", observacion='" + observacion + '\'' +
                ", numero_fuente='" + numero_fuente + '\'' +
                ", temporal_estadodisponibilidadtipo=" + temporal_estadodisponibilidadtipo +
                ", temporal_forma_presentacion_codigo=" + temporal_forma_presentacion_codigo +
                ", fecha_documento_fuente=" + fecha_documento_fuente +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
