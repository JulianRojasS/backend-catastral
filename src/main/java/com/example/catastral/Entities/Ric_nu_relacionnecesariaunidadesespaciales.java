package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "ric_nu_relacionnecesariaunidadesespaciales")
public class Ric_nu_relacionnecesariaunidadesespaciales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "relacion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Col_iso19125_tipo col_iso19125_tipo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_nu_relacionnecesariaunidadesespaciales", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_relacionfuenteuespacial> colrelacionfuenteuespacial;

    public Ric_nu_relacionnecesariaunidadesespaciales(Integer t_id, Col_iso19125_tipo col_iso19125_tipo, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.col_iso19125_tipo = col_iso19125_tipo;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_nu_relacionnecesariaunidadesespaciales() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Col_iso19125_tipo getCol_iso19125_tipo() {
        return col_iso19125_tipo;
    }

    public void setCol_iso19125_tipo(Col_iso19125_tipo col_iso19125_tipo) {
        this.col_iso19125_tipo = col_iso19125_tipo;
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

    public Set<Col_relacionfuenteuespacial> getColrelacionfuenteuespacial() {
        return colrelacionfuenteuespacial;
    }

    public void setColrelacionfuenteuespacial(Set<Col_relacionfuenteuespacial> colrelacionfuenteuespacial) {
        this.colrelacionfuenteuespacial = colrelacionfuenteuespacial;
    }

    @Override
    public String toString() {
        return "Ric_nu_relacionnecesariaunidadesespaciales{" +
                "t_id=" + t_id +
                ", col_iso19125_tipo=" + col_iso19125_tipo +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
