package com.spring.learning_spring.models.dto;

// Las clases DTO (Data Transfer Object) en Spring Boot sirven para transportar datos entre capas de una aplicación
public class ClaseDTO {
    private String titulo;
    private String usuario;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
