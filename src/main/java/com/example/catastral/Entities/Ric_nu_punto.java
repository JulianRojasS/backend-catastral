package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_nu_punto", schema = "ric")
public class Ric_nu_punto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "posicion_interpolacion", referencedColumnName = "t_id", nullable = true)
    private Col_interpolaciontipo col_interpolaciontipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "puntotipo", referencedColumnName = "t_id", nullable = false)
    @JsonIgnore Col_puntotipo col_puntotipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "metodoproduccion", referencedColumnName = "t_id", nullable = false)
    private Col_metodoproducciontipo col_metodoproducciontipo;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String geometria;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_terreno", referencedColumnName = "t_id", nullable = true)
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_construccion", referencedColumnName = "t_id", nullable = true)
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_unidadconstruccion", referencedColumnName = "t_id", nullable = true)
    private Ric_unidadconstruccion ric_unidadconstruccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_nu_espaciojuridicounidadedificacion", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ue_ric_nu_espaciojuridicoredservicios", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;
    @OneToMany(mappedBy = "ric_nu_punto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_transformacion> coltransformacion;
    @OneToMany(mappedBy = "ric_nu_punto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_puntoccl> colpuntoccl;
    @OneToMany(mappedBy = "ric_nu_punto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_puntofuente> colpuntofuente;
    @OneToMany(mappedBy = "ric_nu_punto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_puntocl> colpuntocl;

    public Ric_nu_punto(Integer t_id, UUID t_ili_tid, Col_interpolaciontipo col_interpolaciontipo, Col_puntotipo col_puntotipo, Col_metodoproducciontipo col_metodoproducciontipo, String geometria, Ric_terreno ric_terreno, Ric_construccion ric_construccion, Ric_unidadconstruccion ric_unidadconstruccion, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.col_interpolaciontipo = col_interpolaciontipo;
        this.col_puntotipo = col_puntotipo;
        this.col_metodoproducciontipo = col_metodoproducciontipo;
        this.geometria = geometria;
        this.ric_terreno = ric_terreno;
        this.ric_construccion = ric_construccion;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_nu_punto() {
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

    public Col_interpolaciontipo getCol_interpolaciontipo() {
        return col_interpolaciontipo;
    }

    public void setCol_interpolaciontipo(Col_interpolaciontipo col_interpolaciontipo) {
        this.col_interpolaciontipo = col_interpolaciontipo;
    }

    public Col_puntotipo getCol_puntotipo() {
        return col_puntotipo;
    }

    public void setCol_puntotipo(Col_puntotipo col_puntotipo) {
        this.col_puntotipo = col_puntotipo;
    }

    public Col_metodoproducciontipo getCol_metodoproducciontipo() {
        return col_metodoproducciontipo;
    }

    public void setCol_metodoproducciontipo(Col_metodoproducciontipo col_metodoproducciontipo) {
        this.col_metodoproducciontipo = col_metodoproducciontipo;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public Ric_terreno getRic_terreno() {
        return ric_terreno;
    }

    public void setRic_terreno(Ric_terreno ric_terreno) {
        this.ric_terreno = ric_terreno;
    }

    public Ric_construccion getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Ric_construccion ric_construccion) {
        this.ric_construccion = ric_construccion;
    }

    public Ric_unidadconstruccion getRic_unidadconstruccion() {
        return ric_unidadconstruccion;
    }

    public void setRic_unidadconstruccion(Ric_unidadconstruccion ric_unidadconstruccion) {
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    public Ric_nu_espaciojuridicounidadedificacion getRic_nu_espaciojuridicounidadedificacion() {
        return ric_nu_espaciojuridicounidadedificacion;
    }

    public void setRic_nu_espaciojuridicounidadedificacion(Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion) {
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
    }

    public Ric_nu_espaciojuridicoredservicios getRic_nu_espaciojuridicoredservicios() {
        return ric_nu_espaciojuridicoredservicios;
    }

    public void setRic_nu_espaciojuridicoredservicios(Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
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

    public Set<Col_transformacion> getColtransformacion() {
        return coltransformacion;
    }

    public void setColtransformacion(Set<Col_transformacion> coltransformacion) {
        this.coltransformacion = coltransformacion;
    }

    public Set<Col_puntoccl> getColpuntoccl() {
        return colpuntoccl;
    }

    public void setColpuntoccl(Set<Col_puntoccl> colpuntoccl) {
        this.colpuntoccl = colpuntoccl;
    }

    public Set<Col_puntofuente> getColpuntofuente() {
        return colpuntofuente;
    }

    public void setColpuntofuente(Set<Col_puntofuente> colpuntofuente) {
        this.colpuntofuente = colpuntofuente;
    }

    public Set<Col_puntocl> getColpuntocl() {
        return colpuntocl;
    }

    public void setColpuntocl(Set<Col_puntocl> colpuntocl) {
        this.colpuntocl = colpuntocl;
    }

    @Override
    public String toString() {
        return "Ric_nu_punto{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", col_interpolaciontipo=" + col_interpolaciontipo +
                ", col_puntotipo=" + col_puntotipo +
                ", col_metodoproducciontipo=" + col_metodoproducciontipo +
                ", geometria='" + geometria + '\'' +
                ", ric_terreno=" + ric_terreno +
                ", ric_construccion=" + ric_construccion +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                ", ric_nu_espaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
