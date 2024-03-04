package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.*;
@Entity
@Table(name = "Gm_surface3dlistvalue")
public class Gm_surface3dlistvalue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer s_eq;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String avalue;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gm_multisurface3d_geometry", referencedColumnName = "t_id", nullable = false)
    @JsonManagedReference
    private Gm_multisurface3d gm_multisurface3d;

    public Gm_surface3dlistvalue(Integer t_id, Integer s_eq, String avalue, Gm_multisurface3d gm_multisurface3d) {
        this.t_id = t_id;
        this.s_eq = s_eq;
        this.avalue = avalue;
        this.gm_multisurface3d = gm_multisurface3d;
    }

    public Gm_surface3dlistvalue() {
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

    public String getAvalue() {
        return avalue;
    }

    public void setAvalue(String avalue) {
        this.avalue = avalue;
    }

    public Gm_multisurface3d getGm_multisurface3d() {
        return gm_multisurface3d;
    }

    public void setGm_multisurface3d(Gm_multisurface3d gm_multisurface3d) {
        this.gm_multisurface3d = gm_multisurface3d;
    }

    @Override
    public String toString() {
        return "Gm_surface3dlistvalue{" +
                "t_id=" + t_id +
                ", s_eq=" + s_eq +
                ", avalue='" + avalue + '\'' +
                '}';
    }
}
