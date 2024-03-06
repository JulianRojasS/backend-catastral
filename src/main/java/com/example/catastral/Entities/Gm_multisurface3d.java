package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "gm_multisurface3d", schema = "ric")
public class Gm_multisurface3d {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer s_eq;
    @OneToMany(mappedBy = "gm_multisurface3d", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Gm_surface3dlistvalue> gmsurface3dlistvalue;

    public Gm_multisurface3d(Integer t_id, Integer s_eq) {
        this.t_id = t_id;
        this.s_eq = s_eq;
    }

    public Gm_multisurface3d() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getS_eq() {
        return s_eq;
    }

    public void setS_eq(Integer s_eq) {
        this.s_eq = s_eq;
    }

    public Set<Gm_surface3dlistvalue> getGmsurface3dlistvalue() {
        return gmsurface3dlistvalue;
    }

    public void setGmsurface3dlistvalue(Set<Gm_surface3dlistvalue> gmsurface3dlistvalue) {
        this.gmsurface3dlistvalue = gmsurface3dlistvalue;
    }

    @Override
    public String toString() {
        return "Gm_multisurface3d{" +
                "t_id=" + t_id +
                ", s_eq=" + s_eq +
                '}';
    }
}
