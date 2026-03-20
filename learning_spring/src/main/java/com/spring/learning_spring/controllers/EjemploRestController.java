package com.spring.learning_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learning_spring.models.Empleados;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//Se convierte el controlador en api rest
@RestController
//Ruta de primer nivel
@RequestMapping("/api")
public class EjemploRestController {

    //Mapea las solicitudes http entrantes al metodo
    //Metodo mas especifico
    // @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)

    //Metodo mas simple
    @GetMapping("/detalles_info2")
    
    public Map<String, Object> detallesInfo2(){
        Empleados empleado1 = new Empleados("Alexis", "Vallejos", "La florida", "Desarrollador", 25, 123456789, 001);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);

        
        return respuesta;
    }
}
