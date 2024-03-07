package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "temporal_interesados", schema = "temporal")
public class Temporal_interesados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false)
    private Integer tipo;
    @Column(nullable = false)
    private Integer tipo_documento;
    @Column(nullable = false, length = 50)
    private String documento_identidad;
    @Column(nullable = true, length = 100)
    private String primer_nombre;
    @Column(nullable = true, length = 100)
    private String segundo_nombre;
    @Column(nullable = true, length = 100)
    private String primer_apellido;
    @Column(nullable = true, length = 100)
    private String segundo_apellido;
    @Column(nullable = true)
    private Integer sexo;
    @Column(nullable = true)
    private Integer grupoetnico;
    @Column(nullable = true, length = 255)
    private String razon_social;
    @Column(nullable = true)
    private Integer estado_civil;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    public Temporal_interesados(Integer t_id, UUID t_ili_tid, Integer tipo, Integer tipo_documento, String documento_identidad, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, Integer sexo, Integer grupoetnico, String razon_social, Integer estado_civil, String nombre, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.tipo = tipo;
        this.tipo_documento = tipo_documento;
        this.documento_identidad = documento_identidad;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.sexo = sexo;
        this.grupoetnico = grupoetnico;
        this.razon_social = razon_social;
        this.estado_civil = estado_civil;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_interesados() {
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

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(Integer tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getGrupoetnico() {
        return grupoetnico;
    }

    public void setGrupoetnico(Integer grupoetnico) {
        this.grupoetnico = grupoetnico;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Integer getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(Integer estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Temporal_interesados{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", tipo=" + tipo +
                ", tipo_documento=" + tipo_documento +
                ", documento_identidad='" + documento_identidad + '\'' +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", sexo=" + sexo +
                ", grupoetnico=" + grupoetnico +
                ", razon_social='" + razon_social + '\'' +
                ", estado_civil=" + estado_civil +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
