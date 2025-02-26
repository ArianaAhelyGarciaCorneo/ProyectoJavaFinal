/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.proyectofinal;
import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Tarea {
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaEstimada;
    private String estado;
    private Desarrollador desarrollador;

    public Tarea(String descripcion, LocalDate fechaInicio, LocalDate fechaEstimada, String estado, Desarrollador desarrollador) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaEstimada = fechaEstimada;
        this.estado = estado;
        this.desarrollador = desarrollador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(LocalDate fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "Tarea{" + "descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaEstimada=" + fechaEstimada + ", estado=" + estado + ", desarrollador=" + desarrollador + '}';
    }
    
    
}
