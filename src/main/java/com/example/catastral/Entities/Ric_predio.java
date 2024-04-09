package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_predio", schema = "public")
public class Ric_predio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @Column(nullable = false, length = 2)
    private String departamento;
    @Column(nullable = false, length = 3)
    private String municipio;
    @Column(nullable = false, length = 11)
    private String codigo_homologado;
    @Column(nullable = true, length = 11)
    private String nupre;
    @Column(nullable = true, length = 3)
    private String codigo_orip;
    @Column(nullable = true, length = 80)
    private String matricula_inmobiliaria;
    @Column(nullable = false, length = 30)
    private String numero_predial;
    @Column(nullable = true, length = 20)
    private String numero_predial_anterior;
    @Temporal(TemporalType.DATE)
    private Date fecha_inscripcion_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "condicion_predio", referencedColumnName = "t_id", nullable = false)
    private Ric_condicionprediotipo ric_condicionprediotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "destinacion_economica", referencedColumnName = "t_id", nullable = true)
    private Ric_destinacioneconomicatipo ric_destinacioneconomicatipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo", referencedColumnName = "t_id", nullable = false)
    private Col_unidadadministrativabasicatipo col_unidadadministrativabasicatipo;
    @Column(nullable = false)
    private Float avaluo_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zona", referencedColumnName = "t_id", nullable = false)
    private Ric_zonatipo ric_zonatipo;
    @Temporal(TemporalType.DATE)
    private Date vigencia_actualizacion_catastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado", referencedColumnName = "t_id", nullable = false)
    private Ric_estadotipo ric_estadotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "catastro", referencedColumnName = "t_id", nullable = true)
    private Ric_catastrotipo ric_catastrotipo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_gestorcatastral", referencedColumnName = "t_id", nullable = false)
    private Ric_gestorcatastral ric_gestorcatastral;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ric_operadorcatastral", referencedColumnName = "t_id", nullable = false)
    private Ric_operadorcatastral ric_operadorcatastral;
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
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_tramitecatastral> ricprediotramitecatastral;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_datosphcondominio> ricdatosphcondominio;
    @OneToMany(mappedBy = "ric_predio_formal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_informalidad> ric_predio_formal;
    @OneToMany(mappedBy = "ric_predio_informal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_informalidad> ric_predio_informal;
    @OneToMany(mappedBy = "ric_unidad_predial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_copropiedad> ricprediocopropiedad;
    @OneToMany(mappedBy = "ric_matriz", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_copropiedad> ricprediocopropiedad2;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_unidadfuente> colunidadfuente;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_derecho> ricderecho;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_baunitcomointeresado> colbaunitcomointeresado;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_baunitfuente> colbaunitfuente;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Extdireccion> extdireccion;
    @OneToMany(mappedBy = "ric_predio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Col_uebaunit> coluebaunit;

    public Ric_predio(Integer t_id, UUID t_ili_tid, String departamento, String municipio, String codigo_homologado, String nupre, String codigo_orip, String matricula_inmobiliaria, String numero_predial, String numero_predial_anterior, Date fecha_inscripcion_catastral, Ric_condicionprediotipo ric_condicionprediotipo, Ric_destinacioneconomicatipo ric_destinacioneconomicatipo, Col_unidadadministrativabasicatipo col_unidadadministrativabasicatipo, Float avaluo_catastral, Ric_zonatipo ric_zonatipo, Date vigencia_actualizacion_catastral, Ric_estadotipo ric_estadotipo, Ric_catastrotipo ric_catastrotipo, Ric_gestorcatastral ric_gestorcatastral, Ric_operadorcatastral ric_operadorcatastral, String nombre, Timestamp comienzo_vida_util_version, Timestamp fin_vida_util_version, String espacio_de_nombres, String local_id) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigo_homologado = codigo_homologado;
        this.nupre = nupre;
        this.codigo_orip = codigo_orip;
        this.matricula_inmobiliaria = matricula_inmobiliaria;
        this.numero_predial = numero_predial;
        this.numero_predial_anterior = numero_predial_anterior;
        this.fecha_inscripcion_catastral = fecha_inscripcion_catastral;
        this.ric_condicionprediotipo = ric_condicionprediotipo;
        this.ric_destinacioneconomicatipo = ric_destinacioneconomicatipo;
        this.col_unidadadministrativabasicatipo = col_unidadadministrativabasicatipo;
        this.avaluo_catastral = avaluo_catastral;
        this.ric_zonatipo = ric_zonatipo;
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
        this.ric_estadotipo = ric_estadotipo;
        this.ric_catastrotipo = ric_catastrotipo;
        this.ric_gestorcatastral = ric_gestorcatastral;
        this.ric_operadorcatastral = ric_operadorcatastral;
        this.nombre = nombre;
        this.comienzo_vida_util_version = comienzo_vida_util_version;
        this.fin_vida_util_version = fin_vida_util_version;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
    }

    public Ric_predio() {
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigo_homologado() {
        return codigo_homologado;
    }

    public void setCodigo_homologado(String codigo_homologado) {
        this.codigo_homologado = codigo_homologado;
    }

    public String getNupre() {
        return nupre;
    }

    public void setNupre(String nupre) {
        this.nupre = nupre;
    }

    public String getCodigo_orip() {
        return codigo_orip;
    }

    public void setCodigo_orip(String codigo_orip) {
        this.codigo_orip = codigo_orip;
    }

    public String getMatricula_inmobiliaria() {
        return matricula_inmobiliaria;
    }

    public void setMatricula_inmobiliaria(String matricula_inmobiliaria) {
        this.matricula_inmobiliaria = matricula_inmobiliaria;
    }

    public String getNumero_predial() {
        return numero_predial;
    }

    public void setNumero_predial(String numero_predial) {
        this.numero_predial = numero_predial;
    }

    public String getNumero_predial_anterior() {
        return numero_predial_anterior;
    }

    public void setNumero_predial_anterior(String numero_predial_anterior) {
        this.numero_predial_anterior = numero_predial_anterior;
    }

    public Date getFecha_inscripcion_catastral() {
        return fecha_inscripcion_catastral;
    }

    public void setFecha_inscripcion_catastral(Date fecha_inscripcion_catastral) {
        this.fecha_inscripcion_catastral = fecha_inscripcion_catastral;
    }

    public Ric_condicionprediotipo getRic_condicionprediotipo() {
        return ric_condicionprediotipo;
    }

    public void setRic_condicionprediotipo(Ric_condicionprediotipo ric_condicionprediotipo) {
        this.ric_condicionprediotipo = ric_condicionprediotipo;
    }

    public Ric_destinacioneconomicatipo getRic_destinacioneconomicatipo() {
        return ric_destinacioneconomicatipo;
    }

    public void setRic_destinacioneconomicatipo(Ric_destinacioneconomicatipo ric_destinacioneconomicatipo) {
        this.ric_destinacioneconomicatipo = ric_destinacioneconomicatipo;
    }

    public Col_unidadadministrativabasicatipo getCol_unidadadministrativabasicatipo() {
        return col_unidadadministrativabasicatipo;
    }

    public void setCol_unidadadministrativabasicatipo(Col_unidadadministrativabasicatipo col_unidadadministrativabasicatipo) {
        this.col_unidadadministrativabasicatipo = col_unidadadministrativabasicatipo;
    }

    public String getAvaluo_catastral() {
        DecimalFormat num = new DecimalFormat("####00");
        return num.format(avaluo_catastral);
    }

    public void setAvaluo_catastral(Float avaluo_catastral) {
        this.avaluo_catastral = avaluo_catastral;
    }

    public Ric_zonatipo getRic_zonatipo() {
        return ric_zonatipo;
    }

    public void setRic_zonatipo(Ric_zonatipo ric_zonatipo) {
        this.ric_zonatipo = ric_zonatipo;
    }

    public Date getVigencia_actualizacion_catastral() {
        return vigencia_actualizacion_catastral;
    }

    public void setVigencia_actualizacion_catastral(Date vigencia_actualizacion_catastral) {
        this.vigencia_actualizacion_catastral = vigencia_actualizacion_catastral;
    }

    public Ric_estadotipo getRic_estadotipo() {
        return ric_estadotipo;
    }

    public void setRic_estadotipo(Ric_estadotipo ric_estadotipo) {
        this.ric_estadotipo = ric_estadotipo;
    }

    public Ric_catastrotipo getRic_catastrotipo() {
        return ric_catastrotipo;
    }

    public void setRic_catastrotipo(Ric_catastrotipo ric_catastrotipo) {
        this.ric_catastrotipo = ric_catastrotipo;
    }

    public Ric_gestorcatastral getRic_gestorcatastral() {
        return ric_gestorcatastral;
    }

    public void setRic_gestorcatastral(Ric_gestorcatastral ric_gestorcatastral) {
        this.ric_gestorcatastral = ric_gestorcatastral;
    }

    public Ric_operadorcatastral getRic_operadorcatastral() {
        return ric_operadorcatastral;
    }

    public void setRic_operadorcatastral(Ric_operadorcatastral ric_operadorcatastral) {
        this.ric_operadorcatastral = ric_operadorcatastral;
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

    public Set<Ric_predio_tramitecatastral> getRicprediotramitecatastral() {
        return ricprediotramitecatastral;
    }

    public void setRicprediotramitecatastral(Set<Ric_predio_tramitecatastral> ricprediotramitecatastral) {
        this.ricprediotramitecatastral = ricprediotramitecatastral;
    }

    public Set<Ric_datosphcondominio> getRicdatosphcondominio() {
        return ricdatosphcondominio;
    }

    public void setRicdatosphcondominio(Set<Ric_datosphcondominio> ricdatosphcondominio) {
        this.ricdatosphcondominio = ricdatosphcondominio;
    }

    public Set<Ric_predio_informalidad> getric_predio_formal() {
        return ric_predio_formal;
    }

    public void setric_predio_formal(Set<Ric_predio_informalidad> ric_predio_formal) {
        this.ric_predio_formal = ric_predio_formal;
    }

    public Set<Ric_predio_informalidad> getric_predio_informal() {
        return ric_predio_informal;
    }

    public void setric_predio_informal(Set<Ric_predio_informalidad> ric_predio_informal) {
        this.ric_predio_informal = ric_predio_informal;
    }

    public Set<Ric_predio_copropiedad> getRicprediocopropiedad() {
        return ricprediocopropiedad;
    }

    public void setRicprediocopropiedad(Set<Ric_predio_copropiedad> ricprediocopropiedad) {
        this.ricprediocopropiedad = ricprediocopropiedad;
    }

    public Set<Ric_predio_copropiedad> getRicprediocopropiedad2() {
        return ricprediocopropiedad2;
    }

    public void setRicprediocopropiedad2(Set<Ric_predio_copropiedad> ricprediocopropiedad2) {
        this.ricprediocopropiedad2 = ricprediocopropiedad2;
    }

    public Set<Col_unidadfuente> getColunidadfuente() {
        return colunidadfuente;
    }

    public void setColunidadfuente(Set<Col_unidadfuente> colunidadfuente) {
        this.colunidadfuente = colunidadfuente;
    }

    public Set<Ric_derecho> getRicderecho() {
        return ricderecho;
    }

    public void setRicderecho(Set<Ric_derecho> ricderecho) {
        this.ricderecho = ricderecho;
    }

    public Set<Col_baunitcomointeresado> getColbaunitcomointeresado() {
        return colbaunitcomointeresado;
    }

    public void setColbaunitcomointeresado(Set<Col_baunitcomointeresado> colbaunitcomointeresado) {
        this.colbaunitcomointeresado = colbaunitcomointeresado;
    }

    public Set<Col_baunitfuente> getColbaunitfuente() {
        return colbaunitfuente;
    }

    public void setColbaunitfuente(Set<Col_baunitfuente> colbaunitfuente) {
        this.colbaunitfuente = colbaunitfuente;
    }

    public Set<Extdireccion> getExtdireccion() {
        return extdireccion;
    }

    public void setExtdireccion(Set<Extdireccion> extdireccion) {
        this.extdireccion = extdireccion;
    }

    public Set<Col_uebaunit> getColuebaunit() {
        return coluebaunit;
    }

    public void setColuebaunit(Set<Col_uebaunit> coluebaunit) {
        this.coluebaunit = coluebaunit;
    }

    @Override
    public String toString() {
        return "ric_predio{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", departamento='" + departamento + '\'' +
                ", municipio='" + municipio + '\'' +
                ", codigo_homologado='" + codigo_homologado + '\'' +
                ", nupre='" + nupre + '\'' +
                ", codigo_orip='" + codigo_orip + '\'' +
                ", matricula_inmobiliaria='" + matricula_inmobiliaria + '\'' +
                ", numero_predial='" + numero_predial + '\'' +
                ", numero_predial_anterior='" + numero_predial_anterior + '\'' +
                ", fecha_inscripcion_catastral=" + fecha_inscripcion_catastral +
                ", ric_condicionprediotipo=" + ric_condicionprediotipo +
                ", ric_destinacioneconomicatipo=" + ric_destinacioneconomicatipo +
                ", col_unidadadministrativabasicatipo=" + col_unidadadministrativabasicatipo +
                ", avaluo_catastral=" + avaluo_catastral +
                ", ric_zonatipo=" + ric_zonatipo +
                ", vigencia_actualizacion_catastral=" + vigencia_actualizacion_catastral +
                ", ric_estadotipo=" + ric_estadotipo +
                ", ric_catastrotipo=" + ric_catastrotipo +
                ", ric_gestorcatastral=" + ric_gestorcatastral +
                ", ric_operadorcatastral=" + ric_operadorcatastral +
                ", nombre='" + nombre + '\'' +
                ", comienzo_vida_util_version=" + comienzo_vida_util_version +
                ", fin_vida_util_version=" + fin_vida_util_version +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                '}';
    }
}
