package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_terreno")
public class Ric_terreno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false)
    private Float area_terreno;
    @Column(nullable = true)
    private Float area_digital_gestor;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String geometria;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "dimension", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_dimensiontipo col_dimensiontipo;
    @Column(nullable = true, length = 255)
    private String etiqueta;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "relacion_superficie", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_relacionsuperficietipo col_relacionsuperficietipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
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

    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_nu_punto> ricnupunto;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_ueuegrupo> coleuegrupo;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_mascl> colmascl;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_masccl> colmasccl;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_menoscl> colmenoscl;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_uefuente> coluefuente;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_menosccl> colmenosccl;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_volumenvalor> colvolumenvalor;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_areavalor> colareavalor;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Extdireccion> extdireccion;
    @OneToMany(mappedBy = "ric_terreno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_uebaunit> coluebaunit;

    public Ric_terreno(Integer t_id, UUID t_ili_tid, Float area_terreno, Float area_digital_gestor, String geometria, Col_dimensiontipo col_dimensiontipo, String etiqueta, Col_relacionsuperficietipo col_relacionsuperficietipo, Ric_nu_nivel ric_nu_nivel, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.area_terreno = area_terreno;
        this.area_digital_gestor = area_digital_gestor;
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

    public Ric_terreno() {
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

    public Float getArea_terreno() {
        return area_terreno;
    }

    public void setArea_terreno(Float area_terreno) {
        this.area_terreno = area_terreno;
    }

    public Float getArea_digital_gestor() {
        return area_digital_gestor;
    }

    public void setArea_digital_gestor(Float area_digital_gestor) {
        this.area_digital_gestor = area_digital_gestor;
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

    public Set<Col_ueuegrupo> getColeuegrupo() {
        return coleuegrupo;
    }

    public void setColeuegrupo(Set<Col_ueuegrupo> coleuegrupo) {
        this.coleuegrupo = coleuegrupo;
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

    public Set<Extdireccion> getExtdireccion() {
        return extdireccion;
    }

    public void setExtdireccion(Set<Extdireccion> extdireccion) {
        this.extdireccion = extdireccion;
    }

    public Set<Col_uebaunit> getColuebaunit() {
        return coluebaunit;
    }

    public void setColuebaunit(Set<Col_uebaunit> coluebaunit) {
        this.coluebaunit = coluebaunit;
    }

    @Override
    public String toString() {
        return "Ric_terreno{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", area_terreno=" + area_terreno +
                ", area_digital_gestor=" + area_digital_gestor +
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
