package com.spring.learning_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RquestParamController {

    @GetMapping("/detalle")

    // @RequestParam se utiliza para decir qu la informacion v aa aser proporcionada como un parametro de consulta en la solicitud
    public ParametroDTO detalle(@RequestParam 
                        (required = false, defaultValue = "informacion no proporcionada") String informacion){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }

    
}
