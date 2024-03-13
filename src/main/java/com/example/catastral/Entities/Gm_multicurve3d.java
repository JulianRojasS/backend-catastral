package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "gm_multicurve3d", schema = "ric")
public class Gm_multicurve3d {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @OneToMany(mappedBy = "gm_multicurve3d", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Gm_curve3dlistvalue> gmcurve3dlistvalue;

    public Gm_multicurve3d(Integer t_id, Integer t_seq) {
        this.t_id = t_id;
        this.t_seq = t_seq;
    }

    public Gm_multicurve3d() {
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

    public Set<Gm_curve3dlistvalue> getGmcurve3dlistvalue() {
        return gmcurve3dlistvalue;
    }

    public void setGmcurve3dlistvalue(Set<Gm_curve3dlistvalue> gmcurve3dlistvalue) {
        this.gmcurve3dlistvalue = gmcurve3dlistvalue;
    }

    @Override
    public String toString() {
        return "Gm_multicurve3d{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                '}';
    }
}
