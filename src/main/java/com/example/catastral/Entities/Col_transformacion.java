package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "col_transformacion", schema = "ric")
public class Col_transformacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String localizacion_transformada;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_nu_punto_transformacion_y_resultado", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Ric_nu_punto ric_nu_punto;
    @OneToMany(mappedBy = "col_transformacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Cc_metodooperacion> ccmetodooperacion;

    public Col_transformacion(Integer t_id, Integer t_seq, String localizacion_transformada, Ric_nu_punto ric_nu_punto) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.localizacion_transformada = localizacion_transformada;
        this.ric_nu_punto = ric_nu_punto;
    }

    public Col_transformacion() {
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

    public String getLocalizacion_transformada() {
        return localizacion_transformada;
    }

    public void setLocalizacion_transformada(String localizacion_transformada) {
        this.localizacion_transformada = localizacion_transformada;
    }

    public Ric_nu_punto getRic_nu_punto() {
        return ric_nu_punto;
    }

    public void setRic_nu_punto(Ric_nu_punto ric_nu_punto) {
        this.ric_nu_punto = ric_nu_punto;
    }

    public Set<Cc_metodooperacion> getCcmetodooperacion() {
        return ccmetodooperacion;
    }

    public void setCcmetodooperacion(Set<Cc_metodooperacion> ccmetodooperacion) {
        this.ccmetodooperacion = ccmetodooperacion;
    }

    @Override
    public String toString() {
        return "Col_transformacion{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", localizacion_transformada='" + localizacion_transformada + '\'' +
                ", ric_nu_punto=" + ric_nu_punto +
                '}';
    }
}
