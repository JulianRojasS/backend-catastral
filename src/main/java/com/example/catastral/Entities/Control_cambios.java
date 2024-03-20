package com.example.catastral.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "control_cambios", schema = "temporal")
public class Control_cambios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "entidad_id", referencedColumnName = "id", nullable = false)
    private Entidades entidades;
    @Column(name = "estado_antiguo")
    private String estado_antiguo;
    @Column(name = "estado_nuevo", nullable = false)
    private String estado_nuevo;
    @Column(name = "cambio", nullable = false)
    private String cambio;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", nullable = true)
    private Users users;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fecha = new Timestamp(new Date().getTime());

    public Control_cambios(Entidades entidades, String estado_antiguo, String estado_nuevo, String cambio, Users users) {
        this.entidades = entidades;
        this.estado_antiguo = estado_antiguo;
        this.estado_nuevo = estado_nuevo;
        this.cambio = cambio;
        this.users = users;
    }

    public Control_cambios() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entidades getEntidades() {
        return entidades;
    }

    public void setEntidades(Entidades entidades) {
        this.entidades = entidades;
    }

    public String getestado_antiguo() {
        return estado_antiguo;
    }

    public void setestado_antiguo(String estado_antiguo) {
        this.estado_antiguo = estado_antiguo;
    }

    public String getestado_nuevo() {
        return estado_nuevo;
    }

    public void setestado_nuevo(String estado_nuevo) {
        this.estado_nuevo = estado_nuevo;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Control_cambios{" +
                "id=" + id +
                ", entidades=" + entidades +
                ", estado_antiguo='" + estado_antiguo + '\'' +
                ", estado_nuevo='" + estado_nuevo + '\'' +
                ", cambio='" + cambio + '\'' +
                ", users=" + users +
                ", fecha=" + fecha +
                '}';
    }
}
