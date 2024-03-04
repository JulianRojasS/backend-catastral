package com.example.catastral.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "gm_geometry2dlistvalue")
public class Gm_geometry2dlistvalue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;

    public Gm_geometry2dlistvalue(Integer t_id, Integer t_seq) {
        this.t_id = t_id;
        this.t_seq = t_seq;
    }

    public Gm_geometry2dlistvalue() {
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

    @Override
    public String toString() {
        return "Gm_geometry2dlistvalue{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                '}';
    }
}
