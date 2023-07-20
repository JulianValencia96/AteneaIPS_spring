package com.ateneaips.ateneaips.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

    

    public Cita() {
    }

    public Cita(Long id, Medico medico, Paciente paciente) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        
    }

    public Long getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    
    public LocalDate getFecha() {
        return fecha;
    }

    

    public void setId(Long id) {
        this.id = id;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

        
    
}
