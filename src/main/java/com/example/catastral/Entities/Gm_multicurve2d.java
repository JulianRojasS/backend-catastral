package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "gm_multicurve2d")
public class Gm_multicurve2d {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @OneToMany(mappedBy = "gm_multicurve2d", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Gm_curve2dlistvalue> gmcurve2dlistvalue;

    public Gm_multicurve2d(Integer t_id, Integer t_seq) {
        this.t_id = t_id;
        this.t_seq = t_seq;
    }

    public Gm_multicurve2d() {
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

    public Set<Gm_curve2dlistvalue> getGmcurve2dlistvalue() {
        return gmcurve2dlistvalue;
    }

    public void setGmcurve2dlistvalue(Set<Gm_curve2dlistvalue> gmcurve2dlistvalue) {
        this.gmcurve2dlistvalue = gmcurve2dlistvalue;
    }

    @Override
    public String toString() {
        return "Gm_multicurve2d{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                '}';
    }
}
