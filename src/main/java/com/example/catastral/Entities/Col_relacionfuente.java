package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_relacionfuente", schema = "public")
public class Col_relacionfuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_administrativa", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteadministrativa ric_fuenteadministrativa;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "relacionrequeridabaunit", referencedColumnName = "t_id", nullable = false)
    private Ric_nu_relacionnecesariabaunits	ric_nu_relacionnecesariabaunits;

    public Col_relacionfuente(Integer t_id, Ric_fuenteadministrativa ric_fuenteadministrativa, Ric_nu_relacionnecesariabaunits ric_nu_relacionnecesariabaunits) {
        this.t_id = t_id;
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
        this.ric_nu_relacionnecesariabaunits = ric_nu_relacionnecesariabaunits;
    }

    public Col_relacionfuente() {
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Ric_fuenteadministrativa getRic_fuenteadministrativa() {
        return ric_fuenteadministrativa;
    }

    public void setRic_fuenteadministrativa(Ric_fuenteadministrativa ric_fuenteadministrativa) {
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
    }

    public Ric_nu_relacionnecesariabaunits getRic_nu_relacionnecesariabaunits() {
        return ric_nu_relacionnecesariabaunits;
    }

    public void setRic_nu_relacionnecesariabaunits(Ric_nu_relacionnecesariabaunits ric_nu_relacionnecesariabaunits) {
        this.ric_nu_relacionnecesariabaunits = ric_nu_relacionnecesariabaunits;
    }

    @Override
    public String toString() {
        return "Col_relacionfuente{" +
                "t_id=" + t_id +
                ", ric_fuenteadministrativa=" + ric_fuenteadministrativa +
                ", ric_nu_relacionnecesariabaunits=" + ric_nu_relacionnecesariabaunits +
                '}';
    }
}
