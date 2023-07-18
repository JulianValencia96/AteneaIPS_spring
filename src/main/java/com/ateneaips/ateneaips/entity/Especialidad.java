package com.ateneaips.ateneaips.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Especialidad {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_especialidad;
    private String nombre;

    
    public Especialidad() {
    }


    public Especialidad(Long id_especialidad, String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }


    public Long getId_especialidad() {
        return id_especialidad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setId_especialidad(Long id_especialidad) {
        this.id_especialidad = id_especialidad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    




}