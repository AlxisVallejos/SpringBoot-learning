package com.spring.learning_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.learning_spring.models.Empleados;

//Los controladores manejan metodos y su funcion es manejar el request de los usuarios
@Controller
public class EjemploController {

    //Metodo que maneja la peticion del request ej: GET, POST, PUT, DELETE
    @GetMapping("/detalles_info")

    //Patron de inyeccion de dependencias - spring inyecta una instancia para pasar datos a la vista(Model)
    //Usar el model de springframework
    public String info(Model model){
        Empleados empleado1 = new Empleados(
            "Alexis", 
            "Vallejos", 
            "La florida", 
            "Desarrollador", 
            25, 
            123456789, 
            001
        );

        model.addAttribute("Empleado", empleado1);
        
        return "detalles_info";
    }


    // public String info(Map<String, Object> modelo){
    //     modelo.put("Titulo", "Servidor en linea!");
    //     modelo.put("Servidor", "La florida");
    //     modelo.put("Proyecto", "Learning Spring");
        
    //     return "detalles_info";
    // }
}
