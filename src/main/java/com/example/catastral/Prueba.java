package com.example.catastral;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {

    @RequestMapping("/spring-boot-taller")
    public String prueba () {
        return "hola";
    }
}
