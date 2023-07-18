package com.ateneaips.ateneaips.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long tarjetaProfesional;
    private String nombre;
    private String apellido;
    private String consultorio;
    private String correo;


    


    public Medico() {
    }





    public Medico(Long tarjetaProfesional, String nombre, String apellido, String consultorio, String correo) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
    }





    public Long getTarjetaProfesional() {
        return tarjetaProfesional;
    }





    public String getNombre() {
        return nombre;
    }





    public String getApellido() {
        return apellido;
    }





    public String getConsultorio() {
        return consultorio;
    }





    public String getCorreo() {
        return correo;
    }





    public void setTarjetaProfesional(Long tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }





    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





    public void setApellido(String apellido) {
        this.apellido = apellido;
    }





    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }





    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
 
}