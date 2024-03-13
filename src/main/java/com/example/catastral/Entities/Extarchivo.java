package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "extarchivo", schema = "ric")
public class Extarchivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Temporal(TemporalType.DATE)
    private Date fecha_aceptacion;
    @Column(nullable = true, length = 255)
    private String datos;
    @Temporal(TemporalType.DATE)
    private Date extraccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_grabacion;
    @Temporal(TemporalType.DATE)
    private Date fecha_entrega;
    @Column(nullable = false, length = 255)
    private String espacio_de_nombres;
    @Column(nullable = false, length = 255)
    private String local_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_fuenteadministrativa_ext_archivo_id", referencedColumnName = "t_id", nullable = true)
    private Ric_fuenteadministrativa ric_fuenteadministrativa;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ric_fuenteespacial_ext_archivo_id", referencedColumnName = "t_id", nullable = true)
    private Ric_fuenteespacial ric_fuenteespacial;

    public Extarchivo(Integer t_id, Integer t_seq, Date fecha_aceptacion, String datos, Date extraccion, Date fecha_grabacion, Date fecha_entrega, String espacio_de_nombres, String local_id, Ric_fuenteadministrativa ric_fuenteadministrativa, Ric_fuenteespacial ric_fuenteespacial) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.fecha_aceptacion = fecha_aceptacion;
        this.datos = datos;
        this.extraccion = extraccion;
        this.fecha_grabacion = fecha_grabacion;
        this.fecha_entrega = fecha_entrega;
        this.espacio_de_nombres = espacio_de_nombres;
        this.local_id = local_id;
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    public Extarchivo() {
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

    public Date getFecha_aceptacion() {
        return fecha_aceptacion;
    }

    public void setFecha_aceptacion(Date fecha_aceptacion) {
        this.fecha_aceptacion = fecha_aceptacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Date getExtraccion() {
        return extraccion;
    }

    public void setExtraccion(Date extraccion) {
        this.extraccion = extraccion;
    }

    public Date getFecha_grabacion() {
        return fecha_grabacion;
    }

    public void setFecha_grabacion(Date fecha_grabacion) {
        this.fecha_grabacion = fecha_grabacion;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
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

    public Ric_fuenteadministrativa getRicfuenteadministrativa() {
        return ric_fuenteadministrativa;
    }

    public void setRicfuenteadministrativa(Ric_fuenteadministrativa ric_fuenteadministrativa) {
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
    }

    public Ric_fuenteespacial getRicfuenteespacial() {
        return ric_fuenteespacial;
    }

    public void setRicfuenteespacial(Ric_fuenteespacial ric_fuenteespacial) {
        this.ric_fuenteespacial = ric_fuenteespacial;
    }

    @Override
    public String toString() {
        return "Extarchivo{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", fecha_aceptacion=" + fecha_aceptacion +
                ", datos='" + datos + '\'' +
                ", extraccion=" + extraccion +
                ", fecha_grabacion=" + fecha_grabacion +
                ", fecha_entrega=" + fecha_entrega +
                ", espacio_de_nombres='" + espacio_de_nombres + '\'' +
                ", local_id='" + local_id + '\'' +
                ", ric_fuenteadministrativa=" + ric_fuenteadministrativa +
                ", ric_fuenteespacial=" + ric_fuenteespacial +
                '}';
    }
}
