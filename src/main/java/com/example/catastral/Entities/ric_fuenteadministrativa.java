package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ric_fuenteadministrativa {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private Integer tipo;
    private String ente_emisor;
    private Integer oficina_origen;
    private String ciudad_origen;
    private String observacion;
    private String numero_fuente;
    private Integer estado_disponibilidad;
    private Integer tipo_principal;
    private Date fecha_documento_fuente;
    private String espacio_nombres;
    private String local_id;

    public ric_fuenteadministrativa(Integer t_id, String t_ili_tid, Integer tipo, String ente_emisor, Integer oficina_origen, String ciudad_origen, String observacion, String numero_fuente, Integer estado_disponibilidad, Integer tipo_principal, Date fecha_documento_fuente, String espacio_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.tipo = tipo;
        this.ente_emisor = ente_emisor;
        this.oficina_origen = oficina_origen;
        this.ciudad_origen = ciudad_origen;
        this.observacion = observacion;
        this.numero_fuente = numero_fuente;
        this.estado_disponibilidad = estado_disponibilidad;
        this.tipo_principal = tipo_principal;
        this.fecha_documento_fuente = fecha_documento_fuente;
        this.espacio_nombres = espacio_nombres;
        this.local_id = local_id;
    }

    public ric_fuenteadministrativa() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_ili_tid() {
        return t_ili_tid;
    }

    public void setT_ili_tid(String t_ili_tid) {
        this.t_ili_tid = t_ili_tid;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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

    public Integer getEstado_disponibilidad() {
        return estado_disponibilidad;
    }

    public void setEstado_disponibilidad(Integer estado_disponibilidad) {
        this.estado_disponibilidad = estado_disponibilidad;
    }

    public Integer getTipo_principal() {
        return tipo_principal;
    }

    public void setTipo_principal(Integer tipo_principal) {
        this.tipo_principal = tipo_principal;
    }

    public Date getFecha_documento_fuente() {
        return fecha_documento_fuente;
    }

    public void setFecha_documento_fuente(Date fecha_documento_fuente) {
        this.fecha_documento_fuente = fecha_documento_fuente;
    }

    public String getEspacio_nombres() {
        return espacio_nombres;
    }

    public void setEspacio_nombres(String espacio_nombres) {
        this.espacio_nombres = espacio_nombres;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    @Override
    public String toString() {
        return "ric_fuenteadministrativa{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", tipo=" + tipo +
                ", ente_emisor='" + ente_emisor + '\'' +
                ", oficina_origen=" + oficina_origen +
                ", ciudad_origen='" + ciudad_origen + '\'' +
                ", observacion='" + observacion + '\'' +
                ", numero_fuente='" + numero_fuente + '\'' +
                ", estado_disponibilidad=" + estado_disponibilidad +
                ", tipo_principal=" + tipo_principal +
                ", fecha_documento_fuente=" + fecha_documento_fuente +
                ", espacio_nombres='" + espacio_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
