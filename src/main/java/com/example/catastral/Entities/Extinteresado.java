package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.awt.*;
import java.util.Set;

@Entity
@Table(name = "extinteresado", schema = "ric")
public class Extinteresado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = true, length = 255)
    private String nombre;
    @Column(nullable = true, length = 255)
    private String documento_escaneado;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extredserviciosfisica_ext_interesado_administrador_id", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Extredserviciosfisica extredserviciosfisica;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_agrupacionintrsdos_ext_pid", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_agrupacioninteresados ric_agrupacioninteresados;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_interesado_ext_pid", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_interesado ric_interesado;
    @OneToMany(mappedBy = "extinteresadoh", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Imagen> imagenh;
    @OneToMany(mappedBy = "extinteresadof", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Imagen> imagenf;
    @OneToMany(mappedBy = "extinteresadofa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Imagen> imagenfa;
    @OneToMany(mappedBy = "extinteresado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Extdireccion> extdireccion;

    public Extinteresado(Integer t_id, Integer t_seq, String nombre, String documento_escaneado, Extredserviciosfisica extredserviciosfisica, Ric_agrupacioninteresados ric_agrupacioninteresados, Ric_interesado ric_interesado) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.nombre = nombre;
        this.documento_escaneado = documento_escaneado;
        this.extredserviciosfisica = extredserviciosfisica;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
        this.ric_interesado = ric_interesado;
    }

    public Extinteresado() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento_escaneado() {
        return documento_escaneado;
    }

    public void setDocumento_escaneado(String documento_escaneado) {
        this.documento_escaneado = documento_escaneado;
    }

    public Extredserviciosfisica getExtredserviciosfisica() {
        return extredserviciosfisica;
    }

    public void setExtredserviciosfisica(Extredserviciosfisica extredserviciosfisica) {
        this.extredserviciosfisica = extredserviciosfisica;
    }

    public Ric_agrupacioninteresados getRic_agrupacioninteresados() {
        return ric_agrupacioninteresados;
    }

    public void setRic_agrupacioninteresados(Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    public Ric_interesado getRic_interesado() {
        return ric_interesado;
    }

    public void setRic_interesado(Ric_interesado ric_interesado) {
        this.ric_interesado = ric_interesado;
    }

    public Set<Imagen> getImagenh() {
        return imagenh;
    }

    public void setImagenh(Set<Imagen> imagenh) {
        this.imagenh = imagenh;
    }

    public Set<Imagen> getImagenf() {
        return imagenf;
    }

    public void setImagenf(Set<Imagen> imagenf) {
        this.imagenf = imagenf;
    }

    public Set<Imagen> getImagenfa() {
        return imagenfa;
    }

    public void setImagenfa(Set<Imagen> imagenfa) {
        this.imagenfa = imagenfa;
    }

    public Set<Extdireccion> getExtdireccion() {
        return extdireccion;
    }

    public void setExtdireccion(Set<Extdireccion> extdireccion) {
        this.extdireccion = extdireccion;
    }

    @Override
    public String toString() {
        return "Extinteresado{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", nombre='" + nombre + '\'' +
                ", documento_escaneado='" + documento_escaneado + '\'' +
                ", extredserviciosfisica=" + extredserviciosfisica +
                ", ric_agrupacioninteresados=" + ric_agrupacioninteresados +
                ", ric_interesado=" + ric_interesado +
                '}';
    }
}
