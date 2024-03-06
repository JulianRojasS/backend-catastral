package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_caracteristicasunidadconstruccion", schema = "ric")
public class Ric_caracteristicasunidadconstruccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = true, length = 20)
    private String identificador;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_construccion", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_construcciontipo ric_construcciontipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_dominio", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_dominioconstrucciontipo ric_dominioconstrucciontipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_unidad_construccion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_unidadconstrucciontipo ric_unidadconstrucciontipo;
    @Column(nullable = true)
    private Integer total_habitaciones;
    @Column(nullable = true)
    private Integer total_banios;
    @Column(nullable = true)
    private Integer total_locales;
    @Column(nullable = true)
    private Integer total_plantas;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uso", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_usouconstipo ric_usouconstipo;
    @Column(nullable = true)
    private Integer anio_construccion;
    @Column(nullable = false)
    private Float area_construida;
    @Column(nullable = true)
    private Float area_privada_construida;
    @Column(nullable = true)
    private String observaciones;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_caracteristicasunidadconstruccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_unidadconstruccion> ricunidadconstruccion;

    public Ric_caracteristicasunidadconstruccion(Integer t_id, UUID t_ili_tid, String identificador, Ric_construcciontipo ric_construcciontipo, Ric_dominioconstrucciontipo ric_dominioconstrucciontipo, Ric_unidadconstrucciontipo ric_unidadconstrucciontipo, Integer total_habitaciones, Integer total_banios, Integer total_locales, Integer total_plantas, Ric_usouconstipo ric_usouconstipo, Integer anio_construccion, Float area_construida, Float area_privada_construida, String observaciones, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.identificador = identificador;
        this.ric_construcciontipo = ric_construcciontipo;
        this.ric_dominioconstrucciontipo = ric_dominioconstrucciontipo;
        this.ric_unidadconstrucciontipo = ric_unidadconstrucciontipo;
        this.total_habitaciones = total_habitaciones;
        this.total_banios = total_banios;
        this.total_locales = total_locales;
        this.total_plantas = total_plantas;
        this.ric_usouconstipo = ric_usouconstipo;
        this.anio_construccion = anio_construccion;
        this.area_construida = area_construida;
        this.area_privada_construida = area_privada_construida;
        this.observaciones = observaciones;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_caracteristicasunidadconstruccion() {
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
        return this.identificador;
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

    public Ric_unidadconstrucciontipo getRic_unidadconstrucciontipo() {
        return ric_unidadconstrucciontipo;
    }

    public void setRic_unidadconstrucciontipo(Ric_unidadconstrucciontipo ric_unidadconstrucciontipo) {
        this.ric_unidadconstrucciontipo = ric_unidadconstrucciontipo;
    }

    public Integer getTotal_habitaciones() {
        return total_habitaciones;
    }

    public void setTotal_habitaciones(Integer total_habitaciones) {
        this.total_habitaciones = total_habitaciones;
    }

    public Integer getTotal_banios() {
        return total_banios;
    }

    public void setTotal_banios(Integer total_banios) {
        this.total_banios = total_banios;
    }

    public Integer getTotal_locales() {
        return total_locales;
    }

    public void setTotal_locales(Integer total_locales) {
        this.total_locales = total_locales;
    }

    public Integer getTotal_plantas() {
        return total_plantas;
    }

    public void setTotal_plantas(Integer total_plantas) {
        this.total_plantas = total_plantas;
    }

    public Ric_usouconstipo getRic_usoconstipo() {
        return ric_usouconstipo;
    }

    public void setRic_usoconstipo(Ric_usouconstipo ric_usouconstipo) {
        this.ric_usouconstipo = ric_usouconstipo;
    }

    public Integer getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(Integer anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public Float getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(Float area_construida) {
        this.area_construida = area_construida;
    }

    public Float getArea_privada_construida() {
        return area_privada_construida;
    }

    public void setArea_privada_construida(Float area_privada_construida) {
        this.area_privada_construida = area_privada_construida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Set<Ric_unidadconstruccion> getRicunidadconstruccion() {
        return ricunidadconstruccion;
    }

    public void setRicunidadconstruccion(Set<Ric_unidadconstruccion> ricunidadconstruccion) {
        this.ricunidadconstruccion = ricunidadconstruccion;
    }

    @Override
    public String toString() {
        return "Ric_caracteristicasunidadconstruccion{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", indentificador='" + identificador + '\'' +
                ", ric_construcciontipo=" + ric_construcciontipo +
                ", ric_dominioconstrucciontipo=" + ric_dominioconstrucciontipo +
                ", ric_unidadconstrucciontipo=" + ric_unidadconstrucciontipo +
                ", total_habitaciones=" + total_habitaciones +
                ", total_banios=" + total_banios +
                ", total_locales=" + total_locales +
                ", total_plantas=" + total_plantas +
                ", ric_usoconstipo=" + ric_usouconstipo +
                ", anio_construccion=" + anio_construccion +
                ", area_construida=" + area_construida +
                ", area_privada_construida=" + area_privada_construida +
                ", observaciones='" + observaciones + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
