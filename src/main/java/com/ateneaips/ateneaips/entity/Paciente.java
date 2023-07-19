package com.ateneaips.ateneaips.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String telefono;



    public Paciente() {
    }



    public Paciente(Long cedula, String nombre, String apellido, String fechaNacimiento, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }



    public Long getCedula() {
        return cedula;
    }



    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public String getFechaNacimiento() {
        return fechaNacimiento;
    }



    public String getTelefono() {
        return telefono;
    }



    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @OneToMany(mappedBy = "paciente")
    private List<Cita> cita;
    
 
}
