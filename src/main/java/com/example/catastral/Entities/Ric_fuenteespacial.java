package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_fuenteespacial", schema = "ric")
public class Ric_fuenteespacial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Col_fuenteespacialtipo col_fuenteespacialtipo;
    @Column(nullable = true)
    private String metadato;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "estado_disponibilidad", referencedColumnName = "t_id", nullable = false)
    private Col_estadodisponibilidadtipo col_estadodisponibilidadtipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo_principal", referencedColumnName = "t_id", nullable = true)
    private Ci_forma_presentacion_codigo ci_forma_presentacion_codigo;
    @Temporal(TemporalType.DATE)
    private Date fecha_documento_fuente;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_baunitfuente> colbaunitfuente;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Extarchivo> extarchivo ;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_topografofuente> coltopografofuente;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_puntofuente> colpuntofuete;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_clfuente> colclfuente;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_cclfuente> colcclfuente;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_relacionfuenteuespacial> colrelacionfuenteuespacial;
    @OneToMany(mappedBy = "ric_fuenteespacial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_uefuente> coluefuente;

    public Ric_fuenteespacial(Integer t_id, UUID t_ili_id, Col_fuenteespacialtipo col_fuenteespacialtipo, String metadato, String nombre, String descripcion, Col_estadodisponibilidadtipo col_estadodisponibilidadtipo, Ci_forma_presentacion_codigo ci_forma_presentacion_codigo, Date fecha_documento_fuente, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_id = t_ili_id;
        this.col_fuenteespacialtipo = col_fuenteespacialtipo;
        this.metadato = metadato;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.col_estadodisponibilidadtipo = col_estadodisponibilidadtipo;
        this.ci_forma_presentacion_codigo = ci_forma_presentacion_codigo;
        this.fecha_documento_fuente = fecha_documento_fuente;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_fuenteespacial() {
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

    public Col_fuenteespacialtipo getCol_fuenteespacialtipo() {
        return col_fuenteespacialtipo;
    }

    public void setCol_fuenteespacialtipo(Col_fuenteespacialtipo col_fuenteespacialtipo) {
        this.col_fuenteespacialtipo = col_fuenteespacialtipo;
    }

    public String getMetadato() {
        return metadato;
    }

    public void setMetadato(String metadato) {
        this.metadato = metadato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Col_estadodisponibilidadtipo getCol_estadodisponibilidadtipo() {
        return col_estadodisponibilidadtipo;
    }

    public void setCol_estadodisponibilidadtipo(Col_estadodisponibilidadtipo col_estadodisponibilidadtipo) {
        this.col_estadodisponibilidadtipo = col_estadodisponibilidadtipo;
    }

    public Ci_forma_presentacion_codigo getCi_forma_presentacion_codigo() {
        return ci_forma_presentacion_codigo;
    }

    public void setCi_forma_presentacion_codigo(Ci_forma_presentacion_codigo ci_forma_presentacion_codigo) {
        this.ci_forma_presentacion_codigo = ci_forma_presentacion_codigo;
    }

    public Date getFecha_documento_fuente() {
        return fecha_documento_fuente;
    }

    public void setFecha_documento_fuente(Date fecha_documento_fuente) {
        this.fecha_documento_fuente = fecha_documento_fuente;
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

    public Set<Col_baunitfuente> getColbaunitfuente() {
        return colbaunitfuente;
    }

    public void setColbaunitfuente(Set<Col_baunitfuente> colbaunitfuente) {
        this.colbaunitfuente = colbaunitfuente;
    }

    public Set<Extarchivo> getExtarchivo() {
        return extarchivo;
    }

    public void setExtarchivo(Set<Extarchivo> extarchivo) {
        this.extarchivo = extarchivo;
    }

    public Set<Col_topografofuente> getColtopografofuente() {
        return coltopografofuente;
    }

    public void setColtopografofuente(Set<Col_topografofuente> coltopografofuente) {
        this.coltopografofuente = coltopografofuente;
    }

    public Set<Col_puntofuente> getColpuntofuete() {
        return colpuntofuete;
    }

    public void setColpuntofuete(Set<Col_puntofuente> colpuntofuete) {
        this.colpuntofuete = colpuntofuete;
    }

    public Set<Col_clfuente> getColclfuente() {
        return colclfuente;
    }

    public void setColclfuente(Set<Col_clfuente> colclfuente) {
        this.colclfuente = colclfuente;
    }

    public Set<Col_cclfuente> getColcclfuente() {
        return colcclfuente;
    }

    public void setColcclfuente(Set<Col_cclfuente> colcclfuente) {
        this.colcclfuente = colcclfuente;
    }

    public Set<Col_relacionfuenteuespacial> getColrelacionfuenteuespacial() {
        return colrelacionfuenteuespacial;
    }

    public void setColrelacionfuenteuespacial(Set<Col_relacionfuenteuespacial> colrelacionfuenteuespacial) {
        this.colrelacionfuenteuespacial = colrelacionfuenteuespacial;
    }

    public Set<Col_uefuente> getColuefuente() {
        return coluefuente;
    }

    public void setColuefuente(Set<Col_uefuente> coluefuente) {
        this.coluefuente = coluefuente;
    }

    @Override
    public String toString() {
        return "Ric_fuenteespacial{" +
                "t_id=" + t_id +
                ", t_ili_id=" + t_ili_id +
                ", col_fuenteespacialtipo=" + col_fuenteespacialtipo +
                ", metadato='" + metadato + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", col_estadodisponibilidadtipo=" + col_estadodisponibilidadtipo +
                ", ci_forma_presentacion_codigo=" + ci_forma_presentacion_codigo +
                ", fecha_documento_fuente=" + fecha_documento_fuente +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
