package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
@Entity
@Table(name = "gm_curve2distvalue", schema = "ric")
public class Gm_curve2dlistvalue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = false, columnDefinition = "public.geometry(multipolygonz, 9377)")
    private String avalue;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "gm_multicurve2d_geometry", referencedColumnName = "t_id", nullable = true)
    private Gm_multicurve2d gm_multicurve2d;

    public Gm_curve2dlistvalue(Integer t_id, String avalue, Gm_multicurve2d gm_multicurve2d) {
        this.t_id = t_id;
        this.avalue = avalue;
        this.gm_multicurve2d = gm_multicurve2d;
    }

    public Gm_curve2dlistvalue() {
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

    public Gm_multicurve2d getGm_multicurve2d() {
        return gm_multicurve2d;
    }

    public void setGm_multicurve2d(Gm_multicurve2d gm_multicurve2d) {
        this.gm_multicurve2d = gm_multicurve2d;
    }

    @Override
    public String toString() {
        return "Gm_curve2dlistvalue{" +
                "t_id=" + t_id +
                ", avalue='" + avalue + '\'' +
                ", gm_multicurve2d=" + gm_multicurve2d +
                '}';
    }
}
