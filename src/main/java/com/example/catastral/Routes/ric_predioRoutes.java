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
    private col_unidadfuenteService col_unidadfuenteService;
    private col_rrrfuenteService col_rrrfuenteService;
    private ric_interesadoService ricInteresadoService;
    private col_uebaunitService colUebaunitService;
    private ric_terrenoService ricTerrenoService;
    private ric_unidadconstruccionService ricUnidadconstruccionService;
    private ric_construccionService ricConstruccionService;

    public ric_predioRoutes(ric_predioService service, extdireccionService extdireccionService, ric_derechoService ricDerechoService, col_unidadfuenteService col_unidadfuenteService, ric_interesadoService ricInteresadoService, col_uebaunitService colUebaunitService, ric_terrenoService ricTerrenoService, ric_unidadconstruccionService ricUnidadconstruccionService, ric_construccionService ricConstruccionService, col_rrrfuenteService col_rrrfuenteService) {
        this.service = service;
        this.extdireccionService = extdireccionService;
        this.ricDerechoService = ricDerechoService;
        this.col_unidadfuenteService = col_unidadfuenteService;
        this.ricInteresadoService = ricInteresadoService;
        this.colUebaunitService = colUebaunitService;
        this.ricTerrenoService = ricTerrenoService;
        this.ricUnidadconstruccionService = ricUnidadconstruccionService;
        this.ricConstruccionService = ricConstruccionService;
        this.col_rrrfuenteService = col_rrrfuenteService;
    }
    @GetMapping("/predio/{t_id}")
    public String predioDetalle (@PathVariable("t_id") Integer t_id, Model model ) {
        model.addAttribute("predio", service.ric_predio(t_id));
        model.addAttribute("direccion", extdireccionService.direccionPredio(t_id));
        model.addAttribute("derechos", ricDerechoService.derechoPredio(t_id));
        model.addAttribute("fuenteadministrativa", col_rrrfuenteService.fuenteAdministrativaPredio(ricDerechoService.derechoPredio(t_id).get(0).getT_id()));
        model.addAttribute("interesados", ricInteresadoService.predioDetalle(t_id));
        model.addAttribute("contrucciones",colUebaunitService.contruccionPredio(t_id));
        model.addAttribute("unidadesC",colUebaunitService.unidadconstruccionPredio(t_id));
        model.addAttribute("terrenos", colUebaunitService.terrenoPredio(t_id));
        model.addAttribute("geometriasT", ricTerrenoService.GeometriasTerreno(this.colUebaunitService.terrenoPredio(t_id)));
        model.addAttribute("geometriasC", ricConstruccionService.GeometriasConstruccion(this.colUebaunitService.contruccionPredio(t_id)));
        model.addAttribute("geometriasUC", ricUnidadconstruccionService.GeometriasUnidadConstruccion(this.colUebaunitService.unidadconstruccionPredio(t_id)));
        return "predio";
    }
}
