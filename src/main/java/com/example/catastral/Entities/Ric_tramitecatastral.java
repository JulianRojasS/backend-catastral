package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ric_tramitecatastral", schema = "ric")
public class Ric_tramitecatastral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(unique = true)
    private UUID t_ili_tid;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "clasificacion_mutacion", referencedColumnName = "t_id", nullable = false)
    private Ric_mutaciontipo ric_mutaciontipo;
    @Column(nullable = false, length = 30)
    private String numero_resolucion;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha_resolucion;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha_radicacion;

    @OneToMany(mappedBy = "ric_tramitecatastral", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Ric_predio_tramitecatastral> ricprediotramitecatastral;

    public Ric_tramitecatastral(Integer t_id, UUID t_ili_tid, Ric_mutaciontipo ric_mutaciontipo, String numero_resolucion, Date fecha_resolucion, Date fecha_radicacion) {
        this.t_id = t_id;
        this.t_ili_tid = t_ili_tid;
        this.ric_mutaciontipo = ric_mutaciontipo;
        this.numero_resolucion = numero_resolucion;
        this.fecha_resolucion = fecha_resolucion;
        this.fecha_radicacion = fecha_radicacion;
    }

    public Ric_tramitecatastral() {
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

    public Ric_mutaciontipo getric_mutaciontipo() {
        return ric_mutaciontipo;
    }

    public void setric_mutaciontipo(Ric_mutaciontipo ric_mutaciontipo) {
        this.ric_mutaciontipo = ric_mutaciontipo;
    }

    public String getNumero_resolucion() {
        return numero_resolucion;
    }

    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }

    public Date getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(Date fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public Date getFecha_radicacion() {
        return fecha_radicacion;
    }

    public void setFecha_radicacion(Date fecha_radicacion) {
        this.fecha_radicacion = fecha_radicacion;
    }

    public Set<Ric_predio_tramitecatastral> getRicprediotramitecatastral() {
        return ricprediotramitecatastral;
    }

    public void setRicprediotramitecatastral(Set<Ric_predio_tramitecatastral> ricprediotramitecatastral) {
        this.ricprediotramitecatastral = ricprediotramitecatastral;
    }

    @Override
    public String toString() {
        return "Ric_tramitecatastral{" +
                "t_id=" + t_id +
                ", t_ili_tid='" + t_ili_tid + '\'' +
                ", ric_mutaciontipo=" + ric_mutaciontipo +
                ", numero_resolucion='" + numero_resolucion + '\'' +
                ", fecha_resolucion=" + fecha_resolucion +
                ", fecha_radicacion=" + fecha_radicacion +
                '}';
    }
}
