package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_nu_cadenacaraslimite")
public class Ric_nu_cadenacaraslimite {
    @JsonManagedReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = true, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String geometria;
    @Column(nullable = true, length = 255)
    private String localizacion_textual;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false,  length = 255)
    private String espacio_de_nombres;
    @Column(length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_nu_cadenacaraslimite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_cclfuente> colcclfuente;
    @OneToMany(mappedBy = "ric_nu_cadenacaraslimite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_puntoccl> colpuntoccl;
    @OneToMany(mappedBy = "ric_nu_cadenacaraslimite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_masccl> colmasccl;
    @OneToMany(mappedBy = "ric_nu_cadenacaraslimite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_menosccl> colmenosccl;

    public Ric_nu_cadenacaraslimite(Integer t_id, UUID t_ili_tid, String geometria, String localizacion_textual, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.geometria = geometria;
        this.localizacion_textual = localizacion_textual;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_nu_cadenacaraslimite() {
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

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public String getLocalizacion_textual() {
        return localizacion_textual;
    }

    public void setLocalizacion_textual(String localizacion_textual) {
        this.localizacion_textual = localizacion_textual;
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

    public Set<Col_cclfuente> getColcclfuente() {
        return colcclfuente;
    }

    public void setColcclfuente(Set<Col_cclfuente> colcclfuente) {
        this.colcclfuente = colcclfuente;
    }

    public Set<Col_puntoccl> getColpuntoccl() {
        return colpuntoccl;
    }

    public void setColpuntoccl(Set<Col_puntoccl> colpuntoccl) {
        this.colpuntoccl = colpuntoccl;
    }

    public Set<Col_masccl> getColmasccl() {
        return colmasccl;
    }

    public void setColmasccl(Set<Col_masccl> colmasccl) {
        this.colmasccl = colmasccl;
    }

    public Set<Col_menosccl> getColmenosccl() {
        return colmenosccl;
    }

    public void setColmenosccl(Set<Col_menosccl> colmenosccl) {
        this.colmenosccl = colmenosccl;
    }

    @Override
    public String toString() {
        return "Ric_nu_cadenacaraslimite{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", geometria='" + geometria + '\'' +
                ", localizacion_textual='" + localizacion_textual + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
