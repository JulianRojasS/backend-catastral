package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "col_dimensiontipo", schema = "ric")
public class Col_dimensiontipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = false, length = 1024)
    private String thisclass;
    @Column(nullable = true, length = 1024)
    private String baseclass;
    @Column(nullable = false)
    private Integer itfcode;
    @Column(nullable = false, length = 1024)
    private String ilicode;
    @Column(nullable = true)
    private Integer seq;
    @Column(nullable = false)
    private Boolean inactive;
    @Column(nullable = false, length = 250)
    private String dispname;
    @Column(nullable = true, length = 1024)
    private String description;
    @OneToMany(mappedBy = "col_dimensiontipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_unidadconstruccion> ricunidadconstruccion;
    @OneToMany(mappedBy = "col_dimensiontipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_construccion> ricconstruccion;
    @OneToMany(mappedBy = "col_dimensiontipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_nu_espaciojuridicounidadedificacion> ricnuespaciojuridicounidadedificacion;
    @OneToMany(mappedBy = "col_dimensiontipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_terreno> ricterreno;
    @OneToMany(mappedBy = "col_dimensiontipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_nu_espaciojuridicoredservicios> ricnuespaciojuridicoredservicios;

    public Col_dimensiontipo(Integer t_id, String thisclass, String baseclass, Integer itfcode, String ilicode, Integer seq, Boolean inactive, String dispname, String description) {
        this.t_id = t_id;
        this.thisclass = thisclass;
        this.baseclass = baseclass;
        this.itfcode = itfcode;
        this.ilicode = ilicode;
        this.seq = seq;
        this.inactive = inactive;
        this.dispname = dispname;
        this.description = description;
    }

    public Col_dimensiontipo() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getThisclass() {
        return thisclass;
    }

    public void setThisclass(String thisclass) {
        this.thisclass = thisclass;
    }

    public String getBaseclass() {
        return baseclass;
    }

    public void setBaseclass(String baseclass) {
        this.baseclass = baseclass;
    }

    public Integer getItfcode() {
        return itfcode;
    }

    public void setItfcode(Integer itfcode) {
        this.itfcode = itfcode;
    }

    public String getIlicode() {
        return ilicode;
    }

    public void setIlicode(String ilicode) {
        this.ilicode = ilicode;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public String getDispname() {
        return dispname;
    }

    public void setDispname(String dispname) {
        this.dispname = dispname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Ric_unidadconstruccion> getRicunidadconstruccion() {
        return ricunidadconstruccion;
    }

    public void setRicunidadconstruccion(Set<Ric_unidadconstruccion> ricunidadconstruccion) {
        this.ricunidadconstruccion = ricunidadconstruccion;
    }

    public Set<Ric_construccion> getRicconstruccion() {
        return ricconstruccion;
    }

    public void setRicconstruccion(Set<Ric_construccion> ricconstruccion) {
        this.ricconstruccion = ricconstruccion;
    }

    public Set<Ric_nu_espaciojuridicounidadedificacion> getRicnuespaciojuridicounidadedificacion() {
        return ricnuespaciojuridicounidadedificacion;
    }

    public void setRicnuespaciojuridicounidadedificacion(Set<Ric_nu_espaciojuridicounidadedificacion> ricnuespaciojuridicounidadedificacion) {
        this.ricnuespaciojuridicounidadedificacion = ricnuespaciojuridicounidadedificacion;
    }

    public Set<Ric_terreno> getRicterreno() {
        return ricterreno;
    }

    public void setRicterreno(Set<Ric_terreno> ricterreno) {
        this.ricterreno = ricterreno;
    }

    public Set<Ric_nu_espaciojuridicoredservicios> getRicnuespaciojuridicoredservicios() {
        return ricnuespaciojuridicoredservicios;
    }

    public void setRicnuespaciojuridicoredservicios(Set<Ric_nu_espaciojuridicoredservicios> ricnuespaciojuridicoredservicios) {
        this.ricnuespaciojuridicoredservicios = ricnuespaciojuridicoredservicios;
    }

    @Override
    public String toString() {
        return "Col_dimensiontipo{" +
                "t_id=" + t_id +
                ", thisclass='" + thisclass + '\'' +
                ", baseclass='" + baseclass + '\'' +
                ", itfcode=" + itfcode +
                ", ilicode='" + ilicode + '\'' +
                ", seq=" + seq +
                ", inactive=" + inactive +
                ", dispname='" + dispname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
