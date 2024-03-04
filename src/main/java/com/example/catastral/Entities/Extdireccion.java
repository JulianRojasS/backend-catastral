package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Extdireccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tipo_direccion", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Extdireccion_tipo_direccion extdireccion_tipo_direccion;
    @Column(nullable = true)
    private Boolean es_direccion_principal;
    @Column(nullable = true, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String localizacion;
    @Column(nullable = true)
    private String codigo_postal;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "clase_via_principal", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extdireccion_clase_via_principal extdireccion_clase_via_principal;
    @Column(nullable = true, length = 100)
    private String valor_via_principal;
    @Column(nullable = true, length = 20)
    private String letra_via_principal;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "sector_ciudad", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extdireccion_sector_ciudad extdireccion_sector_ciudad;
    @Column(nullable = true, length = 100)
    private String valor_via_generadora;
    @Column(nullable = true, length = 20)
    private String letra_via_generadora;
    @Column(nullable = true, length = 20)
    private String numero_predio;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "sector_predio", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extdireccion_sector_predio extdireccion_sector_predio;
    @Column(nullable = true, length = 255)
    private String complemento;
    @Column(nullable = true, length = 255)
    private String nombre_predio;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extunidadedificcnfsica_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extunidadedificacionfisica extunidadedificacionfisica;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extinteresado_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extinteresado extinteresado;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_construccion_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_construccion ric_construccion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrdcrdsrvcios_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_n_spcjrcndddfccion_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_predio_direccion", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private  Ric_predio ric_predio;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_terreno_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_terreno ric_terreno;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_unidadconstruccion_ext_direccion_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_unidadconstruccion ric_unidadconstruccion;

    public Extdireccion(Integer t_id, Integer t_seq, Extdireccion_tipo_direccion extdireccion_tipo_direccion, Boolean es_direccion_principal, String localizacion, String codigo_postal, Extdireccion_clase_via_principal extdireccion_clase_via_principal, String valor_via_principal, String letra_via_principal, Extdireccion_sector_ciudad extdireccion_sector_ciudad, String valor_via_generadora, String letra_via_generadora, String numero_predio, Extdireccion_sector_predio extdireccion_sector_predio, String complemento, String nombre_predio, Extunidadedificacionfisica extunidadedificacionfisica, Extinteresado extinteresado, Ric_construccion ric_construccion, Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios, Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion, Ric_predio ric_predio, Ric_terreno ric_terreno, Ric_unidadconstruccion ric_unidadconstruccion) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.extdireccion_tipo_direccion = extdireccion_tipo_direccion;
        this.es_direccion_principal = es_direccion_principal;
        this.localizacion = localizacion;
        this.codigo_postal = codigo_postal;
        this.extdireccion_clase_via_principal = extdireccion_clase_via_principal;
        this.valor_via_principal = valor_via_principal;
        this.letra_via_principal = letra_via_principal;
        this.extdireccion_sector_ciudad = extdireccion_sector_ciudad;
        this.valor_via_generadora = valor_via_generadora;
        this.letra_via_generadora = letra_via_generadora;
        this.numero_predio = numero_predio;
        this.extdireccion_sector_predio = extdireccion_sector_predio;
        this.complemento = complemento;
        this.nombre_predio = nombre_predio;
        this.extunidadedificacionfisica = extunidadedificacionfisica;
        this.extinteresado = extinteresado;
        this.ric_construccion = ric_construccion;
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
        this.ric_predio = ric_predio;
        this.ric_terreno = ric_terreno;
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    public Extdireccion() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getT_seq() {
        return t_seq;
    }

    public void setT_seq(Integer t_seq) {
        this.t_seq = t_seq;
    }

    public Extdireccion_tipo_direccion getExtdireccion_tipo_direccion() {
        return extdireccion_tipo_direccion;
    }

    public void setExtdireccion_tipo_direccion(Extdireccion_tipo_direccion extdireccion_tipo_direccion) {
        this.extdireccion_tipo_direccion = extdireccion_tipo_direccion;
    }

    public Boolean getEs_direccion_principal() {
        return es_direccion_principal;
    }

    public void setEs_direccion_principal(Boolean es_direccion_principal) {
        this.es_direccion_principal = es_direccion_principal;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Extdireccion_clase_via_principal getExtdireccion_clase_via_principal() {
        return extdireccion_clase_via_principal;
    }

    public void setExtdireccion_clase_via_principal(Extdireccion_clase_via_principal extdireccion_clase_via_principal) {
        this.extdireccion_clase_via_principal = extdireccion_clase_via_principal;
    }

    public String getValor_via_principal() {
        return valor_via_principal;
    }

    public void setValor_via_principal(String valor_via_principal) {
        this.valor_via_principal = valor_via_principal;
    }

    public String getLetra_via_principal() {
        return letra_via_principal;
    }

    public void setLetra_via_principal(String letra_via_principal) {
        this.letra_via_principal = letra_via_principal;
    }

    public Extdireccion_sector_ciudad getExtdireccion_sector_ciudad() {
        return extdireccion_sector_ciudad;
    }

    public void setExtdireccion_sector_ciudad(Extdireccion_sector_ciudad extdireccion_sector_ciudad) {
        this.extdireccion_sector_ciudad = extdireccion_sector_ciudad;
    }

    public String getValor_via_generadora() {
        return valor_via_generadora;
    }

    public void setValor_via_generadora(String valor_via_generadora) {
        this.valor_via_generadora = valor_via_generadora;
    }

    public String getLetra_via_generadora() {
        return letra_via_generadora;
    }

    public void setLetra_via_generadora(String letra_via_generadora) {
        this.letra_via_generadora = letra_via_generadora;
    }

    public String getNumero_predio() {
        return numero_predio;
    }

    public void setNumero_predio(String numero_predio) {
        this.numero_predio = numero_predio;
    }

    public Extdireccion_sector_predio getExtdireccion_sector_predio() {
        return extdireccion_sector_predio;
    }

    public void setExtdireccion_sector_predio(Extdireccion_sector_predio extdireccion_sector_predio) {
        this.extdireccion_sector_predio = extdireccion_sector_predio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombre_predio() {
        return nombre_predio;
    }

    public void setNombre_predio(String nombre_predio) {
        this.nombre_predio = nombre_predio;
    }

    public Extunidadedificacionfisica getExtunidadedificacionfisica() {
        return extunidadedificacionfisica;
    }

    public void setExtunidadedificacionfisica(Extunidadedificacionfisica extunidadedificacionfisica) {
        this.extunidadedificacionfisica = extunidadedificacionfisica;
    }

    public Extinteresado getExtinteresado() {
        return extinteresado;
    }

    public void setExtinteresado(Extinteresado extinteresado) {
        this.extinteresado = extinteresado;
    }

    public Ric_construccion getRic_construccion() {
        return ric_construccion;
    }

    public void setRic_construccion(Ric_construccion ric_construccion) {
        this.ric_construccion = ric_construccion;
    }

    public Ric_nu_espaciojuridicoredservicios getRic_nu_espaciojuridicoredservicios() {
        return ric_nu_espaciojuridicoredservicios;
    }

    public void setRic_nu_espaciojuridicoredservicios(Ric_nu_espaciojuridicoredservicios ric_nu_espaciojuridicoredservicios) {
        this.ric_nu_espaciojuridicoredservicios = ric_nu_espaciojuridicoredservicios;
    }

    public Ric_nu_espaciojuridicounidadedificacion getRic_nu_espaciojuridicounidadedificacion() {
        return ric_nu_espaciojuridicounidadedificacion;
    }

    public void setRic_nu_espaciojuridicounidadedificacion(Ric_nu_espaciojuridicounidadedificacion ric_nu_espaciojuridicounidadedificacion) {
        this.ric_nu_espaciojuridicounidadedificacion = ric_nu_espaciojuridicounidadedificacion;
    }

    public Ric_predio getRic_predio() {
        return ric_predio;
    }

    public void setRic_predio(Ric_predio ric_predio) {
        this.ric_predio = ric_predio;
    }

    public Ric_terreno getRic_terreno() {
        return ric_terreno;
    }

    public void setRic_terreno(Ric_terreno ric_terreno) {
        this.ric_terreno = ric_terreno;
    }

    public Ric_unidadconstruccion getRic_unidadconstruccion() {
        return ric_unidadconstruccion;
    }

    public void setRic_unidadconstruccion(Ric_unidadconstruccion ric_unidadconstruccion) {
        this.ric_unidadconstruccion = ric_unidadconstruccion;
    }

    @Override
    public String toString() {
        return "Extdireccion{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", extdireccion_tipo_direccion=" + extdireccion_tipo_direccion +
                ", es_direccion_principal=" + es_direccion_principal +
                ", localizacion='" + localizacion + '\'' +
                ", codigo_postal='" + codigo_postal + '\'' +
                ", extdireccion_clase_via_principal=" + extdireccion_clase_via_principal +
                ", valor_via_principal='" + valor_via_principal + '\'' +
                ", letra_via_principal='" + letra_via_principal + '\'' +
                ", extdireccion_sector_ciudad=" + extdireccion_sector_ciudad +
                ", valor_via_generadora='" + valor_via_generadora + '\'' +
                ", letra_via_generadora='" + letra_via_generadora + '\'' +
                ", numero_predio='" + numero_predio + '\'' +
                ", extdireccion_sector_predio=" + extdireccion_sector_predio +
                ", complemento='" + complemento + '\'' +
                ", nombre_predio='" + nombre_predio + '\'' +
                ", extunidadedificacionfisica=" + extunidadedificacionfisica +
                ", extinteresado=" + extinteresado +
                ", ric_construccion=" + ric_construccion +
                ", ric_nu_espaciojuridicoredservicios=" + ric_nu_espaciojuridicoredservicios +
                ", ric_nu_espaciojuridicounidadedificacion=" + ric_nu_espaciojuridicounidadedificacion +
                ", ric_predio=" + ric_predio +
                ", ric_terreno=" + ric_terreno +
                ", ric_unidadconstruccion=" + ric_unidadconstruccion +
                '}';
    }
}
