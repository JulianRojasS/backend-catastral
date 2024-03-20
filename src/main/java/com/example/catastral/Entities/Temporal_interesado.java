package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_interesado", schema = "temporal")
public class Temporal_interesado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Temporal_interesadotipo temporal_interesadotipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo_documento", referencedColumnName = "t_id", nullable = false)
    private Temporal_interesadodocumentotipo temporal_interesadodocumentotipo;
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
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "sexo", referencedColumnName = "t_id", nullable = true)
    private Temporal_sexotipo temporal_sexotipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "grupoetnico", referencedColumnName = "t_id", nullable = true)
    private Temporal_grupoetnicotipo temporal_grupoetnicotipo;
    @Column(nullable = true, length = 255)
    private String razon_social;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "estado_civil", referencedColumnName = "t_id", nullable = true)
    private Temporal_estadociviltipo temporal_estadociviltipo;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version = new Timestamp(new Date().getTime());
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "temporal_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_miembros> temporalmiembros;
    @OneToMany(mappedBy = "temporal_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_derecho> temporalderecho;

    public Temporal_interesado(Integer t_id, UUID t_ili_tid, com.example.catastral.Entities.Temporal_interesadotipo temporal_interesadotipo, com.example.catastral.Entities.Temporal_interesadodocumentotipo temporal_interesadodocumentotipo, String documento_identidad, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, Temporal_sexotipo temporal_sexotipo, Temporal_grupoetnicotipo temporal_grupoetnicotipo, String razon_social, Temporal_estadociviltipo temporal_estadociviltipo, String nombre, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.temporal_interesadotipo = temporal_interesadotipo;
        this.temporal_interesadodocumentotipo = temporal_interesadodocumentotipo;
        this.documento_identidad = documento_identidad;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.temporal_sexotipo = temporal_sexotipo;
        this.temporal_grupoetnicotipo = temporal_grupoetnicotipo;
        this.razon_social = razon_social;
        this.temporal_estadociviltipo = temporal_estadociviltipo;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_interesado() {
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

    public com.example.catastral.Entities.Temporal_interesadotipo getTemporal_interesadotipo() {
        return this.temporal_interesadotipo;
    }

    public void setTemporal_interesadotipo(com.example.catastral.Entities.Temporal_interesadotipo temporal_interesadotipo) {
        this.temporal_interesadotipo = temporal_interesadotipo;
    }

    public com.example.catastral.Entities.Temporal_interesadodocumentotipo getTemporal_interesadodocumentotipo() {
        return temporal_interesadodocumentotipo;
    }

    public void setTemporal_interesadodocumentotipo(com.example.catastral.Entities.Temporal_interesadodocumentotipo temporal_interesadodocumentotipo) {
        this.temporal_interesadodocumentotipo = temporal_interesadodocumentotipo;
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

    public Temporal_sexotipo getTemporal_sexotipo() {
        return temporal_sexotipo;
    }

    public void setTemporal_sexotipo(Temporal_sexotipo temporal_sexotipo) {
        this.temporal_sexotipo = temporal_sexotipo;
    }

    public Temporal_grupoetnicotipo getTemporal_grupoetnicotipo() {
        return temporal_grupoetnicotipo;
    }

    public void setTemporal_grupoetnicotipo(Temporal_grupoetnicotipo temporal_grupoetnicotipo) {
        this.temporal_grupoetnicotipo = temporal_grupoetnicotipo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Temporal_estadociviltipo getTemporal_estadociviltipo() {
        return temporal_estadociviltipo;
    }

    public void setTemporal_estadociviltipo(Temporal_estadociviltipo temporal_estadociviltipo) {
        this.temporal_estadociviltipo = temporal_estadociviltipo;
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
        return "Temporal_interesado{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", Temporal_interesadotipo=" + temporal_interesadotipo +
                ", Temporal_interesadodocumentotipo=" + temporal_interesadodocumentotipo +
                ", documento_identidad='" + documento_identidad + '\'' +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", temporal_sexotipo=" + temporal_sexotipo +
                ", temporal_grupoetnicotipo=" + temporal_grupoetnicotipo +
                ", razon_social='" + razon_social + '\'' +
                ", temporal_estadociviltipo=" + temporal_estadociviltipo +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
