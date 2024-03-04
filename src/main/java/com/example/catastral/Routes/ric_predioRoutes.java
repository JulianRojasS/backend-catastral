package com.example.catastral.Routes;

import com.example.catastral.Services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ric_predioRoutes {
    private ric_predioService service;
    private extdireccionService extdireccionService;
    private ric_derechoService ricDerechoService;
    private ric_fuenteadministrativaService ricFuenteadministrativaService;
    private ric_interesadoService ricInteresadoService;
    private col_uebaunitService colUebaunitService;
    private ric_unidadconstruccionService ricUnidadconstruccionService;

    public ric_predioRoutes(ric_predioService service, extdireccionService extdireccionService, ric_derechoService ricDerechoService, ric_fuenteadministrativaService ricFuenteadministrativaService, ric_interesadoService ricInteresadoService, col_uebaunitService colUebaunitService, ric_unidadconstruccionService ricUnidadconstruccionService) {
        this.service = service;
        this.extdireccionService = extdireccionService;
        this.ricDerechoService = ricDerechoService;
        this.ricFuenteadministrativaService = ricFuenteadministrativaService;
        this.ricInteresadoService = ricInteresadoService;
        this.colUebaunitService = colUebaunitService;
        this.ricUnidadconstruccionService = ricUnidadconstruccionService;
    }
    @GetMapping("/predio/{t_id}")
    public String predioDetalle (@PathVariable("t_id") Integer t_id, Model model ) {
        model.addAttribute("predio", service.predioDetalle(t_id));
        model.addAttribute("direccion", extdireccionService.direccionPorPredio(t_id));
        model.addAttribute("derechos", ricDerechoService.derechoPorPredio(t_id));
        model.addAttribute("fuenteadministrativa", ricFuenteadministrativaService.fuenteadministrativaPredio(t_id));
        model.addAttribute("interesados", ricInteresadoService.predioDetalle(t_id));
        model.addAttribute("unidadesC",ricUnidadconstruccionService.unidadConstruccionPredio(t_id));
        model.addAttribute("terrenos", colUebaunitService.terrenoDetallePredio(t_id));
        model.addAttribute("geometriasT", colUebaunitService.geometriasTerreno(t_id));
        return "predio";
    }

    @GetMapping("/CP/{t_id}")
    public String CambioPropietario (@PathVariable("t_id")Integer t_id,Model model){
        model.addAttribute("interesados", ricInteresadoService.predioDetalle(t_id));
        return "Cambio_Propietario";
    }

}
