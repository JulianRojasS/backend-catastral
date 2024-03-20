package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "temporal_predio", schema = "temporal")
public class Temporal_predio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false, length = 2)
    private String departamento;
    @Column(nullable = false, length = 3)
    private String municipio;
    @Column(nullable = false, length = 11)
    private String codigo_homologado;
    @Column(nullable = true, length = 11)
    private String nupre;
    @Column(nullable = true, length = 3)
    private String codigo_orip;
    @Column(nullable = true, length = 80)
    private String matricula_inmobiliaria;
    @Column(nullable = false, length = 30)
    private String numero_predial;
    @Column(nullable = true, length = 20)
    private String numero_predial_anterior;
    @Temporal(TemporalType.DATE)
    private Date fecha_inscripcion_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "condicion_predio", referencedColumnName = "t_id", nullable = false)
    private Temporal_condicionprediotipo temporal_condicionprediotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "destinacion_economica", referencedColumnName = "t_id", nullable = true)
    private Temporal_destinacioneconomicatipo temporal_destinacioneconomicatipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Temporal_unidadadministrativabasicatipo temporal_unidadadministrativabasicatipo;
    @Column(nullable = false)
    private Float avaluo_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zona", referencedColumnName = "t_id", nullable = false)
    private Temporal_zonatipo temporal_zonatipo;
    @Temporal(TemporalType.DATE)
    private Date vigencia_actualizacion_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado", referencedColumnName = "t_id", nullable = false)
    private Temporal_estadotipo temporal_estadotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "catastro", referencedColumnName = "t_id", nullable = true)
    private Temporal_catastrotipo temporal_catastrotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_gestorcatastral", referencedColumnName = "t_id", nullable = false)
    private Temporal_gestorcatastral temporal_gestorcatastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_operadorcatastral", referencedColumnName = "t_id", nullable = false)
    private Temporal_operadorcatastral temporal_operadorcatastral;
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
    @OneToMany(mappedBy = "temporal_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Temporal_derecho> temporalderecho;


    public Temporal_predio(Integer t_id, UUID t_ili_tid, String departamento, String municipio, String codigo_homologado, String nupre, String codigo_orip, String matricula_inmobiliaria, String numero_predial, String numero_predial_anterior, Date fecha_inscripcion_catastral, Temporal_condicionprediotipo temporal_condicionprediotipo, Temporal_destinacioneconomicatipo temporal_destinacioneconomicatipo, Temporal_unidadadministrativabasicatipo temporal_unidadadministrativabasicatipo, Float avaluo_catastral, com.example.catastral.Entities.Temporal_zonatipo temporal_zonatipo, Date vigencia_actualizacion_catastral, Temporal_estadotipo temporal_estadotipo, Temporal_catastrotipo temporal_catastrotipo, Temporal_gestorcatastral temporal_gestorcatastral, Temporal_operadorcatastral temporal_operadorcatastral, String nombre, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigo_homologado = codigo_homologado;
        this.nupre = nupre;
        this.codigo_orip = codigo_orip;
        this.matricula_inmobiliaria = matricula_inmobiliaria;
        this.numero_predial = numero_predial;
        this.numero_predial_anterior = numero_predial_anterior;
        this.fecha_inscripcion_catastral = fecha_inscripcion_catastral;
        this.temporal_condicionprediotipo = temporal_condicionprediotipo;
        this.temporal_destinacioneconomicatipo = temporal_destinacioneconomicatipo;
        this.temporal_unidadadministrativabasicatipo = temporal_unidadadministrativabasicatipo;
        this.avaluo_catastral = avaluo_catastral;
        this.temporal_zonatipo = temporal_zonatipo;
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
        this.temporal_estadotipo = temporal_estadotipo;
        this.temporal_catastrotipo = temporal_catastrotipo;
        this.temporal_gestorcatastral = temporal_gestorcatastral;
        this.temporal_operadorcatastral = temporal_operadorcatastral;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Temporal_predio() {
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

    public String getCodigo_orip() {
        return codigo_orip;
    }

    public void setCodigo_orip(String codigo_orip) {
        this.codigo_orip = codigo_orip;
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

    public Temporal_condicionprediotipo getTemporal_condicionprediotipo() {
        return temporal_condicionprediotipo;
    }

    public void setTemporal_condicionprediotipo(Temporal_condicionprediotipo temporal_condicionprediotipo) {
        this.temporal_condicionprediotipo = temporal_condicionprediotipo;
    }

    public Temporal_destinacioneconomicatipo getTemporal_destinacioneconomicatipo() {
        return temporal_destinacioneconomicatipo;
    }

    public void setTemporal_destinacioneconomicatipo(Temporal_destinacioneconomicatipo temporal_destinacioneconomicatipo) {
        this.temporal_destinacioneconomicatipo = temporal_destinacioneconomicatipo;
    }

    public Temporal_unidadadministrativabasicatipo getTemporal_unidadadministrativabasicatipo() {
        return temporal_unidadadministrativabasicatipo;
    }

    public void setTemporal_unidadadministrativabasicatipo(Temporal_unidadadministrativabasicatipo temporal_unidadadministrativabasicatipo) {
        this.temporal_unidadadministrativabasicatipo = temporal_unidadadministrativabasicatipo;
    }

    public Float getAvaluo_catastral() {
        return avaluo_catastral;
    }

    public void setAvaluo_catastral(Float avaluo_catastral) {
        this.avaluo_catastral = avaluo_catastral;
    }

    public Temporal_zonatipo getTemporal_zonatipo() {
        return temporal_zonatipo;
    }

    public void setTemporal_zonatipo(Temporal_zonatipo temporal_zonatipo) {
        this.temporal_zonatipo = temporal_zonatipo;
    }

    public Date getVigencia_actualizacion_catastral() {
        return vigencia_actualizacion_catastral;
    }

    public void setVigencia_actualizacion_catastral(Date vigencia_actualizacion_catastral) {
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
    }

    public Temporal_estadotipo getTemporal_estadotipo() {
        return temporal_estadotipo;
    }

    public void setTemporal_estadotipo(Temporal_estadotipo temporal_estadotipo) {
        this.temporal_estadotipo = temporal_estadotipo;
    }

    public Temporal_catastrotipo getTemporal_catastrotipo() {
        return temporal_catastrotipo;
    }

    public void setTemporal_catastrotipo(Temporal_catastrotipo temporal_catastrotipo) {
        this.temporal_catastrotipo = temporal_catastrotipo;
    }

    public Temporal_gestorcatastral getTemporal_gestorcatastral() {
        return temporal_gestorcatastral;
    }

    public void setTemporal_gestorcatastral(Temporal_gestorcatastral temporal_gestorcatastral) {
        this.temporal_gestorcatastral = temporal_gestorcatastral;
    }

    public Temporal_operadorcatastral getTemporal_operadorcatastral() {
        return temporal_operadorcatastral;
    }

    public void setTemporal_operadorcatastral(Temporal_operadorcatastral temporal_operadorcatastral) {
        this.temporal_operadorcatastral = temporal_operadorcatastral;
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
        return "Temporal_predio{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", departamento='" + departamento + '\'' +
                ", municipio='" + municipio + '\'' +
                ", codigo_homologado='" + codigo_homologado + '\'' +
                ", nupre='" + nupre + '\'' +
                ", codigo_orip='" + codigo_orip + '\'' +
                ", matricula_inmobiliaria='" + matricula_inmobiliaria + '\'' +
                ", numero_predial='" + numero_predial + '\'' +
                ", numero_predial_anterior='" + numero_predial_anterior + '\'' +
                ", fecha_inscripcion_catastral=" + fecha_inscripcion_catastral +
                ", temporal_condicionprediotipo=" + temporal_condicionprediotipo +
                ", temporal_destinacioneconomicatipo=" + temporal_destinacioneconomicatipo +
                ", temporal_unidadadministrativabasicatipo=" + temporal_unidadadministrativabasicatipo +
                ", avaluo_catastral=" + avaluo_catastral +
                ", Temporal_zonatipo=" + temporal_zonatipo +
                ", vigencia_actualizacion_catastral=" + vigencia_actualizacion_catastral +
                ", temporal_estadotipo=" + temporal_estadotipo +
                ", temporal_catastrotipo=" + temporal_catastrotipo +
                ", temporal_gestorcatastral=" + temporal_gestorcatastral +
                ", temporal_operadorcatastral=" + temporal_operadorcatastral +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
