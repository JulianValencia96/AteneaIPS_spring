package com.ateneaips.ateneaips.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity

public class Especialidad {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "especialidad")
private List<Medico> medicos; 




}