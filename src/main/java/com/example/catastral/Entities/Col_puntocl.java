package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "col_puntocl", schema = "ric")
public class Col_puntocl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "punto", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_nu_punto ric_nu_punto;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "cl", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Ric_nu_caraslindero ric_nu_caraslindero;

    public Col_puntocl(Integer t_id, Ric_nu_punto ric_nu_punto, Ric_nu_caraslindero ric_nu_caraslindero) {
        this.t_id = t_id;
        this.ric_nu_punto = ric_nu_punto;
        this.ric_nu_caraslindero = ric_nu_caraslindero;
    }

    public Col_puntocl() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_nu_punto getRic_nu_punto() {
        return ric_nu_punto;
    }

    public void setRic_nu_punto(Ric_nu_punto ric_nu_punto) {
        this.ric_nu_punto = ric_nu_punto;
    }

    public Ric_nu_caraslindero getRic_nu_caraslindero() {
        return ric_nu_caraslindero;
    }

    public void setRic_nu_caraslindero(Ric_nu_caraslindero ric_nu_caraslindero) {
        this.ric_nu_caraslindero = ric_nu_caraslindero;
    }

    @Override
    public String toString() {
        return "Col_puntocl{" +
                "t_id=" + t_id +
                ", ric_nu_punto=" + ric_nu_punto +
                ", ric_nu_caraslindero=" + ric_nu_caraslindero +
                '}';
    }
}
