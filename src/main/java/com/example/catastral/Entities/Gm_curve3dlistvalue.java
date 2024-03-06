package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
@Entity
@Table(name = "gm_curve3dlistvalue", schema = "ric")
public class Gm_curve3dlistvalue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String avalue;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "gm_multicurve3d_geometry", referencedColumnName = "t_id", nullable = true)
    @JsonManagedReference
    private Gm_multicurve3d gm_multicurve3d;

    public Gm_curve3dlistvalue(Integer t_id, String avalue, Gm_multicurve3d gm_multicurve3d) {
        this.t_id = t_id;
        this.avalue = avalue;
        this.gm_multicurve3d = gm_multicurve3d;
    }

    public Gm_curve3dlistvalue() {
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

    public Gm_multicurve3d getGm_multicurve3d() {
        return gm_multicurve3d;
    }

    public void setGm_multicurve3d(Gm_multicurve3d gm_multicurve3d) {
        this.gm_multicurve3d = gm_multicurve3d;
    }

    @Override
    public String toString() {
        return "Gm_curve3dlistvalue{" +
                "t_id=" + t_id +
                ", avalue='" + avalue + '\'' +
                ", gm_multicurve3d=" + gm_multicurve3d +
                '}';
    }
}
