package com.ateneaips.ateneaips.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long idCita;
    private String fecha;
    private Long cedulaPaciente;
    private Long tarjetaProfesional;


    
    public Cita() {
    }



    public Cita(Long idCita, String fecha, Long cedulaPaciente, Long tarjetaProfesional) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.cedulaPaciente = cedulaPaciente;
        this.tarjetaProfesional = tarjetaProfesional;
    }



    public Long getIdCita() {
        return idCita;
    }



    public String getFecha() {
        return fecha;
    }



    public Long getCedulaPaciente() {
        return cedulaPaciente;
    }



    public Long getTarjetaProfesional() {
        return tarjetaProfesional;
    }



    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public void setCedulaPaciente(Long cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }



    public void setTarjetaProfesional(Long tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }


    
    
    

}
