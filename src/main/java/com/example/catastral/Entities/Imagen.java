package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "imagen", schema = "ric")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(nullable = true)
    private Integer t_seq;
    @Column(nullable = true)
    private String uri;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extinteresado_huella_dactilar", referencedColumnName = "t_id", nullable = true)
    private Extinteresado extinteresadoh;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extinteresado_fotografia", referencedColumnName = "t_id", nullable = true)
    private Extinteresado extinteresadof;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "extinteresado_firma", referencedColumnName = "t_id", nullable = true)
    private Extinteresado extinteresadofa;

    public Imagen(Integer t_id, Integer t_seq, String uri, Extinteresado extinteresadoh, Extinteresado extinteresadof, Extinteresado extinteresadofa) {
        this.t_id = t_id;
        this.t_seq = t_seq;
        this.uri = uri;
        this.extinteresadoh = extinteresadoh;
        this.extinteresadof = extinteresadof;
        this.extinteresadofa = extinteresadofa;
    }

    public Imagen() {
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Extinteresado getExtinteresadoh() {
        return extinteresadoh;
    }

    public void setExtinteresadoh(Extinteresado extinteresadoh) {
        this.extinteresadoh = extinteresadoh;
    }

    public Extinteresado getExtinteresadof() {
        return extinteresadof;
    }

    public void setExtinteresadof(Extinteresado extinteresadof) {
        this.extinteresadof = extinteresadof;
    }

    public Extinteresado getExtinteresadofa() {
        return extinteresadofa;
    }

    public void setExtinteresadofa(Extinteresado extinteresadofa) {
        this.extinteresadofa = extinteresadofa;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "t_id=" + t_id +
                ", t_seq=" + t_seq +
                ", uri='" + uri + '\'' +
                ", extinteresadoh=" + extinteresadoh +
                ", extinteresadof=" + extinteresadof +
                ", extinteresadofa=" + extinteresadofa +
                '}';
    }
}
