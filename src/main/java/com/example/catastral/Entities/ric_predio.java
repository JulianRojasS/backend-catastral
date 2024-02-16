package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.sql.Time;

@Entity
public class ric_predio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_ili_tid;
    private String departamento;
    private String municipio;
    private String codigo_homologado;
    private String nupre;
    private String codig_orip;
    private String matricula_inmobiliaria;
    private String numero_predial;
    private String numero_predial_anterior;
    private Date fecha_inscripcion_catastral;
    private Integer codigo_predio;
    private Integer destinacion_economica;
    private Integer tipo;
    private Float avaluo_catastral;
    private Integer zona;
    private Date vigencia_actualizacion_catastral;
    private Integer estado;
    private Integer catastro;
    private Integer ric_gestorcatastral;
    private Integer ric_operadorcatastral;
    private String nombre;
    private Time comienzo_vida_util_version;
    private Time fin_vida_util_version;
    private String espacion_de_nombres;
    private String local_id;

    public ric_predio(Integer t_id, String t_ili_tid, String departamento, String municipio, String codigo_homologado, String nupre, String codig_orip, String matricula_inmobiliaria, String numero_predial, String numero_predial_anterior, Date fecha_inscripcion_catastral, Integer codigo_predio, Integer destinacion_economica, Integer tipo, Float avaluo_catastral, Integer zona, Date vigencia_actualizacion_catastral, Integer estado, Integer catastro, Integer ric_gestorcatastral, Integer ric_operadorcatastral, String nombre, Time comienzo_vida_util_version, Time fin_vida_util_version, String espacion_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigo_homologado = codigo_homologado;
        this.nupre = nupre;
        this.codig_orip = codig_orip;
        this.matricula_inmobiliaria = matricula_inmobiliaria;
        this.numero_predial = numero_predial;
        this.numero_predial_anterior = numero_predial_anterior;
        this.fecha_inscripcion_catastral = fecha_inscripcion_catastral;
        this.codigo_predio = codigo_predio;
        this.destinacion_economica = destinacion_economica;
        this.tipo = tipo;
        this.avaluo_catastral = avaluo_catastral;
        this.zona = zona;
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
        this.estado = estado;
        this.catastro = catastro;
        this.ric_gestorcatastral = ric_gestorcatastral;
        this.ric_operadorcatastral = ric_operadorcatastral;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacion_de_nombres = espacion_de_nombres;
        this.local_id = local_id;
    }

    public ric_predio() {
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigo_homologado() {
        return codigo_homologado;
    }

    public void setCodigo_homologado(String codigo_homologado) {
        this.codigo_homologado = codigo_homologado;
    }

    public String getNupre() {
        return nupre;
    }

    public void setNupre(String nupre) {
        this.nupre = nupre;
    }

    public String getCodig_orip() {
        return codig_orip;
    }

    public void setCodig_orip(String codig_orip) {
        this.codig_orip = codig_orip;
    }

    public String getMatricula_inmobiliaria() {
        return matricula_inmobiliaria;
    }

    public void setMatricula_inmobiliaria(String matricula_inmobiliaria) {
        this.matricula_inmobiliaria = matricula_inmobiliaria;
    }

    public String getNumero_predial() {
        return numero_predial;
    }

    public void setNumero_predial(String numero_predial) {
        this.numero_predial = numero_predial;
    }

    public String getNumero_predial_anterior() {
        return numero_predial_anterior;
    }

    public void setNumero_predial_anterior(String numero_predial_anterior) {
        this.numero_predial_anterior = numero_predial_anterior;
    }

    public Date getFecha_inscripcion_catastral() {
        return fecha_inscripcion_catastral;
    }

    public void setFecha_inscripcion_catastral(Date fecha_inscripcion_catastral) {
        this.fecha_inscripcion_catastral = fecha_inscripcion_catastral;
    }

    public Integer getCodigo_predio() {
        return codigo_predio;
    }

    public void setCodigo_predio(Integer codigo_predio) {
        this.codigo_predio = codigo_predio;
    }

    public Integer getDestinacion_economica() {
        return destinacion_economica;
    }

    public void setDestinacion_economica(Integer destinacion_economica) {
        this.destinacion_economica = destinacion_economica;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Float getAvaluo_catastral() {
        return avaluo_catastral;
    }

    public void setAvaluo_catastral(Float avaluo_catastral) {
        this.avaluo_catastral = avaluo_catastral;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Date getVigencia_actualizacion_catastral() {
        return vigencia_actualizacion_catastral;
    }

    public void setVigencia_actualizacion_catastral(Date vigencia_actualizacion_catastral) {
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getCatastro() {
        return catastro;
    }

    public void setCatastro(Integer catastro) {
        this.catastro = catastro;
    }

    public Integer getRic_gestorcatastral() {
        return ric_gestorcatastral;
    }

    public void setRic_gestorcatastral(Integer ric_gestorcatastral) {
        this.ric_gestorcatastral = ric_gestorcatastral;
    }

    public Integer getRic_operadorcatastral() {
        return ric_operadorcatastral;
    }

    public void setRic_operadorcatastral(Integer ric_operadorcatastral) {
        this.ric_operadorcatastral = ric_operadorcatastral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Time getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Time comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Time getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Time fin_vida_util_version) {
        this.fin_vida_util_version = fin_vida_util_version;
    }

    public String getEspacion_de_nombres() {
        return espacion_de_nombres;
    }

    public void setEspacion_de_nombres(String espacion_de_nombres) {
        this.espacion_de_nombres = espacion_de_nombres;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    @Override
    public String toString() {
        return "ric_predio{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", departamento='" + departamento + '\'' +
                ", municipio='" + municipio + '\'' +
                ", codigo_homologado='" + codigo_homologado + '\'' +
                ", nupre='" + nupre + '\'' +
                ", codig_orip='" + codig_orip + '\'' +
                ", matricula_inmobiliaria='" + matricula_inmobiliaria + '\'' +
                ", numero_predial='" + numero_predial + '\'' +
                ", numero_predial_anterior='" + numero_predial_anterior + '\'' +
                ", fecha_inscripcion_catastral=" + fecha_inscripcion_catastral +
                ", codigo_predio=" + codigo_predio +
                ", destinacion_economica=" + destinacion_economica +
                ", tipo=" + tipo +
                ", avaluo_catastral=" + avaluo_catastral +
                ", zona=" + zona +
                ", vigencia_actualizacion_catastral=" + vigencia_actualizacion_catastral +
                ", estado=" + estado +
                ", catastro=" + catastro +
                ", ric_gestorcatastral=" + ric_gestorcatastral +
                ", ric_operadorcatastral=" + ric_operadorcatastral +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacion_de_nombres='" + espacion_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
