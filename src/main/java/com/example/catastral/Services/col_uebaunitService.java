package com.example.catastral.Services;

import com.example.catastral.Entities.Col_uebaunit;
import com.example.catastral.Entities.Ric_construccion;
import com.example.catastral.Entities.Ric_terreno;
import com.example.catastral.Entities.Ric_unidadconstruccion;
import com.example.catastral.Repositories.col_uebaunitRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class col_uebaunitService {
    private col_uebaunitRepository repository;

    public col_uebaunitService (col_uebaunitRepository repository){
        this.repository = repository;
    }

    public ArrayList<Col_uebaunit> todo () {
        return (ArrayList<Col_uebaunit>) repository.findAll();
    }

    public Col_uebaunit col_uebaunit (Integer t_id) {
        return repository.findById(t_id).get();
    }

    public ArrayList<Ric_terreno> terrenoPredio (Integer t_id) {
        ArrayList<Col_uebaunit> uebaunits = this.todo();
        ArrayList<Ric_terreno> response = new ArrayList<Ric_terreno>();
        for (Col_uebaunit uebaunit : uebaunits) {
            if (uebaunit.getRic_predio().getT_id().equals(t_id) && uebaunit.getRic_terreno() != null) {
                Ric_terreno terreno = uebaunit.getRic_terreno();
                String newGeometria = repository.convertirCoordenadasTerreno(terreno.getT_id());
                Ric_terreno newTerreno = new Ric_terreno(terreno.getT_id(), terreno.getT_ili_tid(), terreno.getArea_terreno(), terreno.getArea_digital_gestor(), newGeometria, terreno.getCol_dimensiontipo(), terreno.getEtiqueta(), terreno.getCol_relacionsuperficietipo(), terreno.getRic_nu_nivel(), terreno.getComienzo_vida_util_version(), terreno.getFin_vida_util_version(), terreno.getespacio_de_nombres(), terreno.getLocal_id());
                response.add(newTerreno);
            }
        }

        return response;
    }

    public ArrayList<Ric_unidadconstruccion> unidadconstruccionPredio (Integer t_id) {
        ArrayList<Col_uebaunit> uebaunits = this.todo();
        ArrayList<Ric_unidadconstruccion> response = new ArrayList<Ric_unidadconstruccion>();
        for (Col_uebaunit uebaunit : uebaunits) {
            if (uebaunit.getRic_predio().getT_id().equals(t_id) && uebaunit.getRic_unidadconstruccion() != null) {
                Ric_unidadconstruccion unidadconstruccion = uebaunit.getRic_unidadconstruccion();
                String newGeometria = repository.convertirCoordenadasUnidadConstruccion(unidadconstruccion.getT_id());
                Ric_unidadconstruccion newUnidadContruccion = new Ric_unidadconstruccion(unidadconstruccion.getT_id(), unidadconstruccion.getT_ili_tid(), unidadconstruccion.getPlanta_ubicacion(), unidadconstruccion.getArea_construida(), unidadconstruccion.getAltura(), newGeometria, unidadconstruccion.getRic_caracteristicasunidadconstruccion(), unidadconstruccion.getRic_construccion(), unidadconstruccion.getCol_dimensiontipo(), unidadconstruccion.getEtiqueta(), unidadconstruccion.getRelacionsuperficietipo(), unidadconstruccion.getRic_nu_nivel(), unidadconstruccion.getComienzo_vida_util_version(), unidadconstruccion.getFin_vida_util_version(), unidadconstruccion.getespacio_de_nombres(), unidadconstruccion.getLocal_id());
                response.add(newUnidadContruccion);
            }
        }
        return response;
    }

    public ArrayList<Ric_construccion> contruccionPredio (Integer t_id) {
        ArrayList<Col_uebaunit> uebaunits = this.todo();
        ArrayList<Ric_construccion> response = new ArrayList<Ric_construccion>();
        for (Col_uebaunit uebaunit : uebaunits) {
            if (uebaunit.getRic_predio().getT_id().equals(t_id) && uebaunit.getRic_construccion() != null) {
                Ric_construccion construccion = uebaunit.getRic_construccion();
                String newGeometria = repository.convertirCoordenadasContruccion(construccion.getT_id());
                Ric_construccion newConstruccion = new Ric_construccion(construccion.getT_id(), construccion.getT_ili_tid(), construccion.getIdentificador(), construccion.getRic_construcciontipo(), construccion.getRic_dominioconstrucciontipo(), construccion.getNumero_pisos(), construccion.getNumero_sotanos(), construccion.getNumero_mezanines(), construccion.getNumero_semisotanos(), construccion.getAnio_construccion(), construccion.getAvaluo_construccion(), construccion.getArea_construccion(), construccion.getAltura(), construccion.getObservaciones(), construccion.getCodigo_construccion(), newGeometria, construccion.getCol_dimensiontipo(), construccion.getEtiqueta(), construccion.getCol_relacionsuperficietipo(), construccion.getRic_nu_nivel(), construccion.getComienzo_vida_util_version(), construccion.getFin_vida_util_version(), construccion.getEspacio_de_nombres(), construccion.getLocal_id());
                response.add(newConstruccion);
            }
        }
        return response;
    }
}