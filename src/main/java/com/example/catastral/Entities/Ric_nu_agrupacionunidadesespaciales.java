package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_nu_agrupacionunidadesespaciales", schema = "ric")
public class Ric_nu_agrupacionunidadesespaciales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_id;
    @Column(nullable = false)
    private Integer nivel_jerarquico;
    @Column(length = 255)
    private String etiqueta;
    @Column(length = 255)
    private String nombre;
    @Column(nullable = true, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String punto_referencia;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "agrupacion", referencedColumnName = "t_id", nullable = true)
    private Ric_nu_agrupacionunidadesespaciales ric_nu_agrupacionunidadesespaciales;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;
    @OneToMany(mappedBy = "ric_nu_agrupacionunidadesespaciales", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Ric_nu_agrupacionunidadesespaciales> ricnuagrupacionunidadesespaciales;
    @OneToMany(mappedBy = "ric_nu_agrupacionunidadesespaciales", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Col_ueuegrupo> colueuegrupo;

    public Ric_nu_agrupacionunidadesespaciales(Integer t_id, UUID t_ili_id, Integer nivel_jerarquico, String etiqueta, String nombre, String punto_referencia, Ric_nu_agrupacionunidadesespaciales ric_nu_agrupacionunidadesespaciales, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_id = t_ili_id;
        this.nivel_jerarquico = nivel_jerarquico;
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        this.punto_referencia = punto_referencia;
        this.ric_nu_agrupacionunidadesespaciales = ric_nu_agrupacionunidadesespaciales;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_nu_agrupacionunidadesespaciales() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public UUID getT_ili_id() {
        return t_ili_id;
    }

    public void setT_ili_id(UUID t_ili_id) {
        this.t_ili_id = t_ili_id;
    }

    public Integer getNivel_jerarquico() {
        return nivel_jerarquico;
    }

    public void setNivel_jerarquico(Integer nivel_jerarquico) {
        this.nivel_jerarquico = nivel_jerarquico;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPunto_referencia() {
        return punto_referencia;
    }

    public void setPunto_referencia(String punto_referencia) {
        this.punto_referencia = punto_referencia;
    }

    public Ric_nu_agrupacionunidadesespaciales getRic_nu_agrupacionunidadesespaciales() {
        return ric_nu_agrupacionunidadesespaciales;
    }

    public void setRic_nu_agrupacionunidadesespaciales(Ric_nu_agrupacionunidadesespaciales ric_nu_agrupacionunidadesespaciales) {
        this.ric_nu_agrupacionunidadesespaciales = ric_nu_agrupacionunidadesespaciales;
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

    public Set<Ric_nu_agrupacionunidadesespaciales> getRicnuagrupacionunidadesespaciales() {
        return ricnuagrupacionunidadesespaciales;
    }

    public void setRicnuagrupacionunidadesespaciales(Set<Ric_nu_agrupacionunidadesespaciales> ricnuagrupacionunidadesespaciales) {
        this.ricnuagrupacionunidadesespaciales = ricnuagrupacionunidadesespaciales;
    }

    public Set<Col_ueuegrupo> getColueuegrupo() {
        return colueuegrupo;
    }

    public void setColueuegrupo(Set<Col_ueuegrupo> colueuegrupo) {
        this.colueuegrupo = colueuegrupo;
    }

    @Override
    public String toString() {
        return "Ric_nu_agrupacionunidadesespaciales{" +
                "t_id=" + t_id +
                ", t_ili_id=" + t_ili_id +
                ", nivel_jerarquico=" + nivel_jerarquico +
                ", etiqueta='" + etiqueta + '\'' +
                ", nombre='" + nombre + '\'' +
                ", punto_referencia='" + punto_referencia + '\'' +
                ", ric_nu_agrupacionunidadesespaciales=" + ric_nu_agrupacionunidadesespaciales +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
