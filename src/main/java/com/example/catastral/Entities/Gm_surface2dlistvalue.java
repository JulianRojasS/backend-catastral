package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
@Table(name = "gm_surface2dlistvalue", schema = "public")
public class Gm_surface2dlistvalue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String avalue;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "gm_multisurface2d_geometry", referencedColumnName = "t_id", nullable = true)
    private Gm_multisurface2d gm_multisurface2d;

    public Gm_surface2dlistvalue(Integer t_id, String avalue, Gm_multisurface2d gm_multisurface2d) {
        this.t_id = t_id;
        this.avalue = avalue;
        this.gm_multisurface2d = gm_multisurface2d;
    }

    public Gm_surface2dlistvalue() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getAvalue() {
        return avalue;
    }

    public void setAvalue(String avalue) {
        this.avalue = avalue;
    }

    public Gm_multisurface2d getGm_multisurface2d() {
        return gm_multisurface2d;
    }

    public void setGm_multisurface2d(Gm_multisurface2d gm_multisurface2d) {
        this.gm_multisurface2d = gm_multisurface2d;
    }

    @Override
    public String toString() {
        return "Gm_surface2dlistvalue{" +
                "t_id=" + t_id +
                ", avalue='" + avalue + '\'' +
                '}';
    }
}
