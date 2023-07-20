package com.ateneaips.ateneaips.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tarjetaProfesional;
    private String nombre;
    private String apellido;
    private String consultorio;
    private String correo;


    


    public Medico() {
    }





    public Medico(String tarjetaProfesional, String nombre, String apellido, String consultorio, String correo) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
    }





    public String getTarjetaProfesional() {
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





    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }





    public Long getId() {
        return id;
    }





    public void setId(Long id) {
        this.id = id;
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

    @ManyToOne
    @JoinColumn(name="especialidad_id")
    private Especialidad especialidad;

    @OneToMany (mappedBy = "medico")
    private List<Cita> cita;


}
