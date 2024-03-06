package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_unidadconstruccion", schema = "ric")
public class Ric_unidadconstruccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false)
    private Integer planta_ubicacion;
    @Column(nullable = false)
    private Float area_construida;
    @Column(nullable = true)
    private Integer altura;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String geometria;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_caracteristicasunidadconstruccion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_caracteristicasunidadconstruccion ric_caracteristicasunidadconstruccion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_construccion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dimension", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_dimensiontipo col_dimensiontipo;
    private String etiqueta;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relacion_superficie", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_relacionsuperficietipo col_relacionsuperficietipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nivel", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
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

    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_nu_punto> ricnupunto;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_ueuegrupo> colueuegrupo;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_mascl> colmascl ;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_masccl> colmasccl;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_uebaunit> coluebaunit;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_menoscl> colmenoscl;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_uefuente> coluefuente;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Extdireccion> extdireccion;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_menosccl> colmenosccl;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_volumenvalor> colvolumenvalor ;
    @OneToMany(mappedBy = "ric_unidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_areavalor> colareavalor;

    public Ric_unidadconstruccion(Integer t_id, UUID t_ili_tid, Integer planta_ubicacion, Float area_construida, Integer altura, String geometria, Ric_caracteristicasunidadconstruccion ric_caracteristicasunidadconstruccion, Ric_construccion ric_construccion, Col_dimensiontipo col_dimensiontipo, String etiqueta, Col_relacionsuperficietipo col_relacionsuperficietipo, Ric_nu_nivel ric_nu_nivel, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.planta_ubicacion = planta_ubicacion;
        this.area_construida = area_construida;
        this.altura = altura;
        this.geometria = geometria;
        this.ric_caracteristicasunidadconstruccion = ric_caracteristicasunidadconstruccion;
        this.ric_construccion = ric_construccion;
        this.col_dimensiontipo = col_dimensiontipo;
        this.etiqueta = etiqueta;
        this.col_relacionsuperficietipo = col_relacionsuperficietipo;
        this.ric_nu_nivel = ric_nu_nivel;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_unidadconstruccion() {
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

    public Integer getPlanta_ubicacion() {
        return planta_ubicacion;
    }

    public void setPlanta_ubicacion(Integer planta_ubicacion) {
        this.planta_ubicacion = planta_ubicacion;
    }

    public Float getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(Float area_construida) {
        this.area_construida = area_construida;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public Ric_caracteristicasunidadconstruccion getRic_caracteristicasunidadconstruccion() {
        return ric_caracteristicasunidadconstruccion;
    }

    public void setRic_caracteristicasunidadconstruccion(Ric_caracteristicasunidadconstruccion ric_caracteristicasunidadconstruccion) {
        this.ric_caracteristicasunidadconstruccion = ric_caracteristicasunidadconstruccion;
    }

    public Ric_construccion getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Ric_construccion ric_construccion) {
        this.ric_construccion = ric_construccion;
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

    public Col_relacionsuperficietipo getRelacionsuperficietipo() {
        return col_relacionsuperficietipo;
    }

    public void setRelacionsuperficietipo(Col_relacionsuperficietipo col_relacionsuperficietipo) {
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

    public String getespacio_de_nombres() {
        return espacio_de_nombres;
    }

    public void setespacio_de_nombres(String espacio_de_nombres) {
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

    public Set<Col_uefuente> getColuefuente() {
        return coluefuente;
    }

    public void setColuefuente(Set<Col_uefuente> coluefuente) {
        this.coluefuente = coluefuente;
    }

    public Set<Extdireccion> getExtdireccion() {
        return extdireccion;
    }

    public void setExtdireccion(Set<Extdireccion> extdireccion) {
        this.extdireccion = extdireccion;
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
        return "Ric_unidadconstruccion{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", planta_ubicacion=" + planta_ubicacion +
                ", area_construida=" + area_construida +
                ", altura=" + altura +
                ", geometria='" + geometria + '\'' +
                ", ric_caracteristicasunidadconstruccion=" + ric_caracteristicasunidadconstruccion +
                ", ric_construccion=" + ric_construccion +
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
