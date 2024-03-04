package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "ric_nu_nivel")
public class Ric_nu_nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true, length = 255)
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "registro_tipo", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_registrotipo col_registrotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estructura", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_estructuratipo col_estructuratipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Col_contenidoniveltipo col_contenidoniveltipo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_nu_nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_nu_espaciojuridicoredservicios> ricnuespaciojuridicoredservicio;
    @OneToMany(mappedBy = "ric_nu_nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_terreno> ricterreno;
    @OneToMany(mappedBy = "ric_nu_nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_construccion> ricconstruccion;
    @OneToMany(mappedBy = "ric_nu_nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_unidadconstruccion> ricunidadconstruccion;
    @OneToMany(mappedBy = "ric_nu_nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_nu_espaciojuridicounidadedificacion> ricnuespaciojuridicounidadedificacion;

    public Ric_nu_nivel(Integer t_id, String nombre, Col_registrotipo col_registrotipo, Col_estructuratipo col_estructuratipo, Col_contenidoniveltipo col_contenidoniveltipo, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.nombre = nombre;
        this.col_registrotipo = col_registrotipo;
        this.col_estructuratipo = col_estructuratipo;
        this.col_contenidoniveltipo = col_contenidoniveltipo;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_nu_nivel() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Col_registrotipo getCol_registrotipo() {
        return col_registrotipo;
    }

    public void setCol_registrotipo(Col_registrotipo col_registrotipo) {
        this.col_registrotipo = col_registrotipo;
    }

    public Col_estructuratipo getCol_estructuratipo() {
        return col_estructuratipo;
    }

    public void setCol_estructuratipo(Col_estructuratipo col_estructuratipo) {
        this.col_estructuratipo = col_estructuratipo;
    }

    public Col_contenidoniveltipo getCol_contenidoniveltipo() {
        return col_contenidoniveltipo;
    }

    public void setCol_contenidoniveltipo(Col_contenidoniveltipo col_contenidoniveltipo) {
        this.col_contenidoniveltipo = col_contenidoniveltipo;
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

    public Set<Ric_nu_espaciojuridicoredservicios> getRicnuespaciojuridicoredservicio() {
        return ricnuespaciojuridicoredservicio;
    }

    public void setRicnuespaciojuridicoredservicio(Set<Ric_nu_espaciojuridicoredservicios> ricnuespaciojuridicoredservicio) {
        this.ricnuespaciojuridicoredservicio = ricnuespaciojuridicoredservicio;
    }

    public Set<Ric_terreno> getRicterreno() {
        return ricterreno;
    }

    public void setRicterreno(Set<Ric_terreno> ricterreno) {
        this.ricterreno = ricterreno;
    }

    public Set<Ric_construccion> getRicconstruccion() {
        return ricconstruccion;
    }

    public void setRicconstruccion(Set<Ric_construccion> ricconstruccion) {
        this.ricconstruccion = ricconstruccion;
    }

    public Set<Ric_unidadconstruccion> getRicunidadconstruccion() {
        return ricunidadconstruccion;
    }

    public void setRicunidadconstruccion(Set<Ric_unidadconstruccion> ricunidadconstruccion) {
        this.ricunidadconstruccion = ricunidadconstruccion;
    }

    public Set<Ric_nu_espaciojuridicounidadedificacion> getRicnuespaciojuridicounidadedificacion() {
        return ricnuespaciojuridicounidadedificacion;
    }

    public void setRicnuespaciojuridicounidadedificacion(Set<Ric_nu_espaciojuridicounidadedificacion> ricnuespaciojuridicounidadedificacion) {
        this.ricnuespaciojuridicounidadedificacion = ricnuespaciojuridicounidadedificacion;
    }

    @Override
    public String toString() {
        return "Ric_nu_nivel{" +
                "t_id=" + t_id +
                ", nombre='" + nombre + '\'' +
                ", col_registrotipo=" + col_registrotipo +
                ", col_estructuratipo=" + col_estructuratipo +
                ", col_contenidoniveltipo=" + col_contenidoniveltipo +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
