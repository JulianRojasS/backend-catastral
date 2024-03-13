package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_agrupacioninteresados", schema = "ric")
public class Ric_agrupacioninteresados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Col_grupointeresadotipo col_grupointeresadotipo;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date comienzo_vida_util_version;
    @Temporal(TemporalType.DATE)
    private Date fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_derecho> ricderecho;
    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_baunitcomointeresado> colbaunitcomointeresados;
    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_responsablefuente> colresponsablefuente;
    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_miembros> colmiembrosia;
    @OneToMany(mappedBy = "ric_agrupacioni", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_miembros> colmiembrosa;
    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_topografofuente> coltopografofuente;
    @OneToMany(mappedBy = "ric_agrupacioninteresados", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Extinteresado> extinteresado;

    public Ric_agrupacioninteresados(Integer t_id, UUID t_ili_tid, Col_grupointeresadotipo col_grupointeresadotipo, String nombre, Date comienzo_vida_util_version, Date fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.col_grupointeresadotipo = col_grupointeresadotipo;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_agrupacioninteresados() {
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

    public Col_grupointeresadotipo getCol_grupointeresadotipo() {
        return col_grupointeresadotipo;
    }

    public void setCol_grupointeresadotipo(Col_grupointeresadotipo col_grupointeresadotipo) {
        this.col_grupointeresadotipo = col_grupointeresadotipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getComienzo_vida_util_version() {
        return comienzo_vida_util_version;
    }

    public void setComienzo_vida_util_version(Date comienzo_vida_util_version) {
        this.comienzo_vida_util_version = comienzo_vida_util_version;
    }

    public Date getFin_vida_util_version() {
        return fin_vida_util_version;
    }

    public void setFin_vida_util_version(Date fin_vida_util_version) {
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

    public Set<Ric_derecho> getRicderecho() {
        return ricderecho;
    }

    public void setRicderecho(Set<Ric_derecho> ricderecho) {
        this.ricderecho = ricderecho;
    }

    public Set<Col_baunitcomointeresado> getColbaunitcomointeresados() {
        return colbaunitcomointeresados;
    }

    public void setColbaunitcomointeresados(Set<Col_baunitcomointeresado> colbaunitcomointeresados) {
        this.colbaunitcomointeresados = colbaunitcomointeresados;
    }

    public Set<Col_responsablefuente> getColresponsablefuente() {
        return colresponsablefuente;
    }

    public void setColresponsablefuente(Set<Col_responsablefuente> colresponsablefuente) {
        this.colresponsablefuente = colresponsablefuente;
    }

    public Set<Col_miembros> getColmiembrosia() {
        return colmiembrosia;
    }

    public void setColmiembrosia(Set<Col_miembros> colmiembrosia) {
        this.colmiembrosia = colmiembrosia;
    }

    public Set<Col_miembros> getColmiembrosa() {
        return colmiembrosa;
    }

    public void setColmiembrosa(Set<Col_miembros> colmiembrosa) {
        this.colmiembrosa = colmiembrosa;
    }

    public Set<Col_topografofuente> getColtopografofuente() {
        return coltopografofuente;
    }

    public void setColtopografofuente(Set<Col_topografofuente> coltopografofuente) {
        this.coltopografofuente = coltopografofuente;
    }

    public Set<Extinteresado> getExtinteresado() {
        return extinteresado;
    }

    public void setExtinteresado(Set<Extinteresado> extinteresado) {
        this.extinteresado = extinteresado;
    }

    @Override
    public String toString() {
        return "Ric_agrupacioninteresados{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", col_grupointeresadotipo=" + col_grupointeresadotipo +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
