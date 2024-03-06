package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_interesado", schema = "ric")
public class Ric_interesado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_interesadotipo ric_interesadotipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo_documento", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_interesadodocumentotipo ric_interesadodocumentotipo;
    @Column(nullable = false, length = 50)
    private String documento_identidad;
    @Column(nullable = true, length = 100)
    private String primer_nombre;
    @Column(nullable = true, length = 100)
    private String segundo_nombre;
    @Column(nullable = true, length = 100)
    private String primer_apellido;
    @Column(nullable = true, length = 100)
    private String segundo_apellido;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "sexo", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_sexotipo ric_sexotipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "grupoetnico", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_grupoetnicotipo ric_grupoetnicotipo;
    @Column(nullable = true, length = 255)
    private String razon_social;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "estado_civil", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_estadociviltipo ric_estadociviltipo;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp comienzo_vida_util_version;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fin_vida_util_version;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;

    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Extinteresado> extinteresado;
    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_topografofuente> colopografofuente;
    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_miembros> colmiembros;
    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_responsablefuente> colresponsablefuente;
    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Col_baunitcomointeresado> colbaunitcomointeresado;
    @OneToMany(mappedBy = "ric_interesado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Ric_derecho> ricderecho;

    public Ric_interesado(Integer t_id, UUID t_ili_tid, Ric_interesadotipo ric_interesadotipo, Ric_interesadodocumentotipo ric_interesadodocumentotipo, String documento_identidad, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, Ric_sexotipo ric_sexotipo, Ric_grupoetnicotipo ric_grupoetnicotipo, String razon_social, Ric_estadociviltipo ric_estadociviltipo, String nombre, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.ric_interesadotipo = ric_interesadotipo;
        this.ric_interesadodocumentotipo = ric_interesadodocumentotipo;
        this.documento_identidad = documento_identidad;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.ric_sexotipo = ric_sexotipo;
        this.ric_grupoetnicotipo = ric_grupoetnicotipo;
        this.razon_social = razon_social;
        this.ric_estadociviltipo = ric_estadociviltipo;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_interesado() {
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

    public Ric_interesadotipo getRic_interesadotipo() {
        return ric_interesadotipo;
    }

    public void setRic_interesadotipo(Ric_interesadotipo ric_interesadotipo) {
        this.ric_interesadotipo = ric_interesadotipo;
    }

    public Ric_interesadodocumentotipo getRic_interesadodocumentotipo() {
        return ric_interesadodocumentotipo;
    }

    public void setRic_interesadodocumentotipo(Ric_interesadodocumentotipo ric_interesadodocumentotipo) {
        this.ric_interesadodocumentotipo = ric_interesadodocumentotipo;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public Ric_sexotipo getRic_sexotipo() {
        return ric_sexotipo;
    }

    public void setRic_sexotipo(Ric_sexotipo ric_sexotipo) {
        this.ric_sexotipo = ric_sexotipo;
    }

    public Ric_grupoetnicotipo getRic_grupoetnicotipo() {
        return ric_grupoetnicotipo;
    }

    public void setRic_grupoetnicotipo(Ric_grupoetnicotipo ric_grupoetnicotipo) {
        this.ric_grupoetnicotipo = ric_grupoetnicotipo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Ric_estadociviltipo getRic_estadociviltipo() {
        return ric_estadociviltipo;
    }

    public void setRic_estadociviltipo(Ric_estadociviltipo ric_estadociviltipo) {
        this.ric_estadociviltipo = ric_estadociviltipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Set<Extinteresado> getExtinteresado() {
        return extinteresado;
    }

    public void setExtinteresado(Set<Extinteresado> extinteresado) {
        this.extinteresado = extinteresado;
    }

    public Set<Col_topografofuente> getColopografofuente() {
        return colopografofuente;
    }

    public void setColopografofuente(Set<Col_topografofuente> colopografofuente) {
        this.colopografofuente = colopografofuente;
    }

    public Set<Col_miembros> getColmiembros() {
        return colmiembros;
    }

    public void setColmiembros(Set<Col_miembros> colmiembros) {
        this.colmiembros = colmiembros;
    }

    public Set<Col_responsablefuente> getColresponsablefuente() {
        return colresponsablefuente;
    }

    public void setColresponsablefuente(Set<Col_responsablefuente> colresponsablefuente) {
        this.colresponsablefuente = colresponsablefuente;
    }

    public Set<Col_baunitcomointeresado> getColbaunitcomointeresado() {
        return colbaunitcomointeresado;
    }

    public void setColbaunitcomointeresado(Set<Col_baunitcomointeresado> colbaunitcomointeresado) {
        this.colbaunitcomointeresado = colbaunitcomointeresado;
    }

    public Set<Ric_derecho> getRicderecho() {
        return ricderecho;
    }

    public void setRicderecho(Set<Ric_derecho> ricderecho) {
        this.ricderecho = ricderecho;
    }

    @Override
    public String toString() {
        return "Ric_interesado{" +
                "t_id=" + t_id +
                ", t_ili_tid=" + t_ili_tid +
                ", ric_interesadotipo=" + ric_interesadotipo +
                ", ric_interesadodocumentotipo=" + ric_interesadodocumentotipo +
                ", documento_identidad='" + documento_identidad + '\'' +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", ric_sexotipo=" + ric_sexotipo +
                ", ric_grupoetnicotipo=" + ric_grupoetnicotipo +
                ", razon_social='" + razon_social + '\'' +
                ", ric_estadociviltipo=" + ric_estadociviltipo +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
