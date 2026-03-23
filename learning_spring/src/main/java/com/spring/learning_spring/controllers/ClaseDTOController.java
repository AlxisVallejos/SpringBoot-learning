package com.spring.learning_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learning_spring.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController

@RequestMapping("/api")

public class ClaseDTOController {

    @GetMapping(path = "/dto")
    public ClaseDTO getDTO() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Alexis");

        return usuario1;
    }
    

}
