package com.example.catastral.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class extdireccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private Integer t_seq;
    private Integer tipo_direccion;
    private Boolean es_direccion_principal;
    private String localizacion;
    private String codigo_postal;
    private Integer clase_via_principal;
    private String valor_via_principal;
    private String letra_via_principal;
    private Integer sector_ciudad;
    private String valor_via_generadora;
    private String letra_via_generadora;
    private String numero_predio;
    private Integer sector_predio;
    private String complemento;
    private String nombre_predio;
    private Integer extunidadedificcnfsica_ext_direccion_id;
    private Integer extinteresado_ext_direccion_id;
    private Integer ric_construccion_ext_direccion_id;
    private Integer ric_n_spcjrdcrdsrvcios_ext_direccion_id;
    private Integer ric_n_spcjrcndddfccion_ext_direccion_id;
    private  Integer ric_predio_direccion;
    private Integer ric_terreno_ext_direccion_id;
    private Integer ric_unidadconstruccion_ext_direccion_id;

    public extdireccion(Integer t_id, Integer t_seq, Integer tipo_direccion, Boolean es_direccion_principal, String localizacion, String codigo_postal, Integer clase_via_principal, String valor_via_principal, String letra_via_principal, Integer sector_ciudad, String valor_via_generadora, String letra_via_generadora, String numero_predio, Integer sector_predio, String complemento, String nombre_predio, Integer extunidadedificcnfsica_ext_direccion_id, Integer extinteresado_ext_direccion_id, Integer ric_construccion_ext_direccion_id, Integer ric_n_spcjrdcrdsrvcios_ext_direccion_id, Integer ric_n_spcjrcndddfccion_ext_direccion_id, Integer ric_predio_direccion, Integer ric_terreno_ext_direccion_id, Integer ric_unidadconstruccion_ext_direccion_id) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.tipo_direccion = tipo_direccion;
        this.es_direccion_principal = es_direccion_principal;
        this.localizacion = localizacion;
        this.codigo_postal = codigo_postal;
        this.clase_via_principal = clase_via_principal;
        this.valor_via_principal = valor_via_principal;
        this.letra_via_principal = letra_via_principal;
        this.sector_ciudad = sector_ciudad;
        this.valor_via_generadora = valor_via_generadora;
        this.letra_via_generadora = letra_via_generadora;
        this.numero_predio = numero_predio;
        this.sector_predio = sector_predio;
        this.complemento = complemento;
        this.nombre_predio = nombre_predio;
        this.extunidadedificcnfsica_ext_direccion_id = extunidadedificcnfsica_ext_direccion_id;
        this.extinteresado_ext_direccion_id = extinteresado_ext_direccion_id;
        this.ric_construccion_ext_direccion_id = ric_construccion_ext_direccion_id;
        this.ric_n_spcjrdcrdsrvcios_ext_direccion_id = ric_n_spcjrdcrdsrvcios_ext_direccion_id;
        this.ric_n_spcjrcndddfccion_ext_direccion_id = ric_n_spcjrcndddfccion_ext_direccion_id;
        this.ric_predio_direccion = ric_predio_direccion;
        this.ric_terreno_ext_direccion_id = ric_terreno_ext_direccion_id;
        this.ric_unidadconstruccion_ext_direccion_id = ric_unidadconstruccion_ext_direccion_id;
    }

    public extdireccion() {
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

    public Integer getTipo_direccion() {
        return tipo_direccion;
    }

    public void setTipo_direccion(Integer tipo_direccion) {
        this.tipo_direccion = tipo_direccion;
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

    public Integer getClase_via_principal() {
        return clase_via_principal;
    }

    public void setClase_via_principal(Integer clase_via_principal) {
        this.clase_via_principal = clase_via_principal;
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

    public Integer getSector_ciudad() {
        return sector_ciudad;
    }

    public void setSector_ciudad(Integer sector_ciudad) {
        this.sector_ciudad = sector_ciudad;
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

    public Integer getSector_predio() {
        return sector_predio;
    }

    public void setSector_predio(Integer sector_predio) {
        this.sector_predio = sector_predio;
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

    public Integer getExtunidadedificcnfsica_ext_direccion_id() {
        return extunidadedificcnfsica_ext_direccion_id;
    }

    public void setExtunidadedificcnfsica_ext_direccion_id(Integer extunidadedificcnfsica_ext_direccion_id) {
        this.extunidadedificcnfsica_ext_direccion_id = extunidadedificcnfsica_ext_direccion_id;
    }

    public Integer getExtinteresado_ext_direccion_id() {
        return extinteresado_ext_direccion_id;
    }

    public void setExtinteresado_ext_direccion_id(Integer extinteresado_ext_direccion_id) {
        this.extinteresado_ext_direccion_id = extinteresado_ext_direccion_id;
    }

    public Integer getRic_construccion_ext_direccion_id() {
        return ric_construccion_ext_direccion_id;
    }

    public void setRic_construccion_ext_direccion_id(Integer ric_construccion_ext_direccion_id) {
        this.ric_construccion_ext_direccion_id = ric_construccion_ext_direccion_id;
    }

    public Integer getRic_n_spcjrdcrdsrvcios_ext_direccion_id() {
        return ric_n_spcjrdcrdsrvcios_ext_direccion_id;
    }

    public void setRic_n_spcjrdcrdsrvcios_ext_direccion_id(Integer ric_n_spcjrdcrdsrvcios_ext_direccion_id) {
        this.ric_n_spcjrdcrdsrvcios_ext_direccion_id = ric_n_spcjrdcrdsrvcios_ext_direccion_id;
    }

    public Integer getRic_n_spcjrcndddfccion_ext_direccion_id() {
        return ric_n_spcjrcndddfccion_ext_direccion_id;
    }

    public void setRic_n_spcjrcndddfccion_ext_direccion_id(Integer ric_n_spcjrcndddfccion_ext_direccion_id) {
        this.ric_n_spcjrcndddfccion_ext_direccion_id = ric_n_spcjrcndddfccion_ext_direccion_id;
    }

    public Integer getRic_predio_direccion() {
        return ric_predio_direccion;
    }

    public void setRic_predio_direccion(Integer ric_predio_direccion) {
        this.ric_predio_direccion = ric_predio_direccion;
    }

    public Integer getRic_terreno_ext_direccion_id() {
        return ric_terreno_ext_direccion_id;
    }

    public void setRic_terreno_ext_direccion_id(Integer ric_terreno_ext_direccion_id) {
        this.ric_terreno_ext_direccion_id = ric_terreno_ext_direccion_id;
    }

    public Integer getRic_unidadconstruccion_ext_direccion_id() {
        return ric_unidadconstruccion_ext_direccion_id;
    }

    public void setRic_unidadconstruccion_ext_direccion_id(Integer ric_unidadconstruccion_ext_direccion_id) {
        this.ric_unidadconstruccion_ext_direccion_id = ric_unidadconstruccion_ext_direccion_id;
    }

    @Override
    public String toString() {
        return "extdireccion{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", tipo_direccion=" + tipo_direccion +
                ", es_direccion_principal=" + es_direccion_principal +
                ", localizacion='" + localizacion + '\'' +
                ", codigo_postal='" + codigo_postal + '\'' +
                ", clase_via_principal=" + clase_via_principal +
                ", valor_via_principal='" + valor_via_principal + '\'' +
                ", letra_via_principal='" + letra_via_principal + '\'' +
                ", sector_ciudad=" + sector_ciudad +
                ", valor_via_generadora='" + valor_via_generadora + '\'' +
                ", letra_via_generadora='" + letra_via_generadora + '\'' +
                ", numero_predio='" + numero_predio + '\'' +
                ", sector_predio=" + sector_predio +
                ", complemento='" + complemento + '\'' +
                ", nombre_predio='" + nombre_predio + '\'' +
                ", extunidadedificcnfsica_ext_direccion_id=" + extunidadedificcnfsica_ext_direccion_id +
                ", extinteresado_ext_direccion_id=" + extinteresado_ext_direccion_id +
                ", ric_construccion_ext_direccion_id=" + ric_construccion_ext_direccion_id +
                ", ric_n_spcjrdcrdsrvcios_ext_direccion_id=" + ric_n_spcjrdcrdsrvcios_ext_direccion_id +
                ", ric_n_spcjrcndddfccion_ext_direccion_id=" + ric_n_spcjrcndddfccion_ext_direccion_id +
                ", ric_predio_direccion=" + ric_predio_direccion +
                ", ric_terreno_ext_direccion_id=" + ric_terreno_ext_direccion_id +
                ", ric_unidadconstruccion_ext_direccion_id=" + ric_unidadconstruccion_ext_direccion_id +
                '}';
    }
}
