package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "entidades", schema = "temporal")
public class Entidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 255)
    private String nombre;
    @OneToMany(mappedBy = "entidades", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Control_cambios> controlcambios;

    public Entidades(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Entidades() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entidades{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
