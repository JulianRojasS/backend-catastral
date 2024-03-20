package com.example.catastral.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "col_responsablefuente", schema = "public")
public class Col_responsablefuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fuente_administrativa", referencedColumnName = "t_id", nullable = false)
    private Ric_fuenteadministrativa ric_fuenteadministrativa;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "interesado_ric_interesado", referencedColumnName = "t_id", nullable = true)
    private Ric_interesado ric_interesado;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "interesado_ric_agrupacioninteresados", referencedColumnName = "t_id", nullable = true)
    private Ric_agrupacioninteresados ric_agrupacioninteresados;

    public Col_responsablefuente(Integer t_id, Ric_fuenteadministrativa ric_fuenteadministrativa, Ric_interesado ric_interesado, Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.t_id = t_id;
        this.ric_fuenteadministrativa = ric_fuenteadministrativa;
        this.ric_interesado = ric_interesado;
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    public Col_responsablefuente() {
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

    public Ric_interesado getRic_interesado() {
        return ric_interesado;
    }

    public void setRic_interesado(Ric_interesado ric_interesado) {
        this.ric_interesado = ric_interesado;
    }

    public Ric_agrupacioninteresados getRicAgrupacioninteresado() {
        return ric_agrupacioninteresados;
    }

    public void setRicAgrupacioninteresado(Ric_agrupacioninteresados ric_agrupacioninteresados) {
        this.ric_agrupacioninteresados = ric_agrupacioninteresados;
    }

    @Override
    public String toString() {
        return "Col_responsablefuente{" +
                "t_id=" + t_id +
                ", ric_fuenteadministrativa=" + ric_fuenteadministrativa +
                ", ric_interesado=" + ric_interesado +
                ", ricAgrupacioninteresado=" + ric_agrupacioninteresados +
                '}';
    }
}
