package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_construccion", schema = "ric")
public class Ric_construccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false, length = 20)
    private String identificador;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_construccion", referencedColumnName = "t_id", nullable = true)
    private Ric_construcciontipo ric_construcciontipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_dominio", referencedColumnName = "t_id", nullable = true)
    private Ric_dominioconstrucciontipo ric_dominioconstrucciontipo;
    @Column(nullable = false)
    private Integer numero_pisos;
    @Column(nullable = true)
    private Integer numero_sotanos;
    @Column(nullable = true)
    private Integer numero_mezanines;
    @Column(nullable = true)
    private Integer numero_semisotanos;
    @Column(nullable = true)
    private Integer anio_construccion;
    @Column(nullable = true)
    private Float avaluo_construccion;
    @Column(nullable = false)
    private Float area_construccion;
    @Column(nullable = true)
    private Float altura;
    @Column(nullable = true)
    private String observaciones;
    @Column(nullable = true, length = 30)
    private String codigo_construccion;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String geometria;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dimension", referencedColumnName = "t_id", nullable = true)
    private Col_dimensiontipo col_dimensiontipo;
    @Column(nullable = true, length = 255)
    private String etiqueta;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relacion_superficie", referencedColumnName = "t_id", nullable = true)
    private Col_relacionsuperficietipo col_relacionsuperficietipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nivel", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_nivel ric_nu_nivel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;


    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_nu_punto> ricnupunto;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_ueuegrupo> colueuegrupo;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_mascl> colmascl;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_masccl> colmasccl;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_uebaunit> coluebaunit;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_menoscl> colmenoscl;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_unidadconstruccion> ricunidadconstruccion;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_uefuente> coluefuente;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_menosccl> colmenosccl;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_volumenvalor> colvolumenvalor;
    @OneToMany(mappedBy = "ric_construccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_areavalor> colareavalor;

    public Ric_construccion(Integer t_id, UUID t_ili_tid, String identificador, Ric_construcciontipo ric_construcciontipo, Ric_dominioconstrucciontipo ric_dominioconstrucciontipo, Integer numero_pisos, Integer numero_sotanos, Integer numero_mezanines, Integer numero_semisotanos, Integer anio_construccion, Float avaluo_construccion, Float area_construccion, Float altura, String observaciones, String codigo_construccion, String geometria, Col_dimensiontipo col_dimensiontipo, String etiqueta, Col_relacionsuperficietipo col_relacionsuperficietipo, Ric_nu_nivel ric_nu_nivel, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.identificador = identificador;
        this.ric_construcciontipo = ric_construcciontipo;
        this.ric_dominioconstrucciontipo = ric_dominioconstrucciontipo;
        this.numero_pisos = numero_pisos;
        this.numero_sotanos = numero_sotanos;
        this.numero_mezanines = numero_mezanines;
        this.numero_semisotanos = numero_semisotanos;
        this.anio_construccion = anio_construccion;
        this.avaluo_construccion = avaluo_construccion;
        this.area_construccion = area_construccion;
        this.altura = altura;
        this.observaciones = observaciones;
        this.codigo_construccion = codigo_construccion;
        this.geometria = geometria;
        this.col_dimensiontipo = col_dimensiontipo;
        this.etiqueta = etiqueta;
        this.col_relacionsuperficietipo = col_relacionsuperficietipo;
        this.ric_nu_nivel = ric_nu_nivel;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_construccion() {
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Ric_construcciontipo getRic_construcciontipo() {
        return ric_construcciontipo;
    }

    public void setRic_construcciontipo(Ric_construcciontipo ric_construcciontipo) {
        this.ric_construcciontipo = ric_construcciontipo;
    }

    public Ric_dominioconstrucciontipo getRic_dominioconstrucciontipo() {
        return ric_dominioconstrucciontipo;
    }

    public void setRic_dominioconstrucciontipo(Ric_dominioconstrucciontipo ric_dominioconstrucciontipo) {
        this.ric_dominioconstrucciontipo = ric_dominioconstrucciontipo;
    }

    public Integer getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(Integer numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    public Integer getNumero_sotanos() {
        return numero_sotanos;
    }

    public void setNumero_sotanos(Integer numero_sotanos) {
        this.numero_sotanos = numero_sotanos;
    }

    public Integer getNumero_mezanines() {
        return numero_mezanines;
    }

    public void setNumero_mezanines(Integer numero_mezanines) {
        this.numero_mezanines = numero_mezanines;
    }

    public Integer getNumero_semisotanos() {
        return numero_semisotanos;
    }

    public void setNumero_semisotanos(Integer numero_semisotanos) {
        this.numero_semisotanos = numero_semisotanos;
    }

    public Integer getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(Integer anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public Float getAvaluo_construccion() {
        return avaluo_construccion;
    }

    public void setAvaluo_construccion(Float avaluo_construccion) {
        this.avaluo_construccion = avaluo_construccion;
    }

    public Float getArea_construccion() {
        return area_construccion;
    }

    public void setArea_construccion(Float area_construccion) {
        this.area_construccion = area_construccion;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigo_construccion() {
        return codigo_construccion;
    }

    public void setCodigo_construccion(String codigo_construccion) {
        this.codigo_construccion = codigo_construccion;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public Col_dimensiontipo getCol_dimensiontipo() {
        return col_dimensiontipo;
    }

    public void setCol_dimensiontipo(Col_dimensiontipo col_dimensiontipo) {
        this.col_dimensiontipo = col_dimensiontipo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Col_relacionsuperficietipo getCol_relacionsuperficietipo() {
        return col_relacionsuperficietipo;
    }

    public void setCol_relacionsuperficietipo(Col_relacionsuperficietipo col_relacionsuperficietipo) {
        this.col_relacionsuperficietipo = col_relacionsuperficietipo;
    }

    public Ric_nu_nivel getRic_nu_nivel() {
        return ric_nu_nivel;
    }

    public void setRic_nu_nivel(Ric_nu_nivel ric_nu_nivel) {
        this.ric_nu_nivel = ric_nu_nivel;
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

    public Set<Ric_nu_punto> getRicnupunto() {
        return ricnupunto;
    }

    public void setRicnupunto(Set<Ric_nu_punto> ricnupunto) {
        this.ricnupunto = ricnupunto;
    }

    public Set<Col_ueuegrupo> getColueuegrupo() {
        return colueuegrupo;
    }

    public void setColueuegrupo(Set<Col_ueuegrupo> colueuegrupo) {
        this.colueuegrupo = colueuegrupo;
    }

    public Set<Col_mascl> getColmascl() {
        return colmascl;
    }

    public void setColmascl(Set<Col_mascl> colmascl) {
        this.colmascl = colmascl;
    }

    public Set<Col_masccl> getColmasccl() {
        return colmasccl;
    }

    public void setColmasccl(Set<Col_masccl> colmasccl) {
        this.colmasccl = colmasccl;
    }

    public Set<Col_uebaunit> getColuebaunit() {
        return coluebaunit;
    }

    public void setColuebaunit(Set<Col_uebaunit> coluebaunit) {
        this.coluebaunit = coluebaunit;
    }

    public Set<Col_menoscl> getColmenoscl() {
        return colmenoscl;
    }

    public void setColmenoscl(Set<Col_menoscl> colmenoscl) {
        this.colmenoscl = colmenoscl;
    }

    public Set<Ric_unidadconstruccion> getRicunidadconstruccion() {
        return ricunidadconstruccion;
    }

    public void setRicunidadconstruccion(Set<Ric_unidadconstruccion> ricunidadconstruccion) {
        this.ricunidadconstruccion = ricunidadconstruccion;
    }

    public Set<Col_uefuente> getColuefuente() {
        return coluefuente;
    }

    public void setColuefuente(Set<Col_uefuente> coluefuente) {
        this.coluefuente = coluefuente;
    }

    public Set<Col_menosccl> getColmenosccl() {
        return colmenosccl;
    }

    public void setColmenosccl(Set<Col_menosccl> colmenosccl) {
        this.colmenosccl = colmenosccl;
    }

    public Set<Col_volumenvalor> getColvolumenvalor() {
        return colvolumenvalor;
    }

    public void setColvolumenvalor(Set<Col_volumenvalor> colvolumenvalor) {
        this.colvolumenvalor = colvolumenvalor;
    }

    public Set<Col_areavalor> getColareavalor() {
        return colareavalor;
    }

    public void setColareavalor(Set<Col_areavalor> colareavalor) {
        this.colareavalor = colareavalor;
    }

    @Override
    public String toString() {
        return "Ric_construccion{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", identificador='" + identificador + '\'' +
                ", ric_construcciontipo=" + ric_construcciontipo +
                ", ric_dominioconstrucciontipo=" + ric_dominioconstrucciontipo +
                ", numero_pisos=" + numero_pisos +
                ", numero_sotanos=" + numero_sotanos +
                ", numero_mezanines=" + numero_mezanines +
                ", numero_semisotanos=" + numero_semisotanos +
                ", anio_construccion=" + anio_construccion +
                ", avaluo_construccion=" + avaluo_construccion +
                ", area_construccion=" + area_construccion +
                ", altura=" + altura +
                ", observaciones='" + observaciones + '\'' +
                ", codigo_construccion='" + codigo_construccion + '\'' +
                ", geometria='" + geometria + '\'' +
                ", col_dimensiontipo=" + col_dimensiontipo +
                ", etiqueta='" + etiqueta + '\'' +
                ", col_relacionsuperficietipo=" + col_relacionsuperficietipo +
                ", ric_nu_nivel=" + ric_nu_nivel +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
