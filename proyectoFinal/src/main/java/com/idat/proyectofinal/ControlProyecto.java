/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.proyectofinal;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class ControlProyecto {
     private Proyecto proyecto;

    public ControlProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void asignarTareaADesarrollador(Desarrollador desarrollador, Tarea tarea) {
        tarea.setDesarrollador(desarrollador);
        System.out.println("Tarea asignada: " + tarea);
    }

    public void cambiarEstadoTarea(Tarea tarea, String estado) {
        tarea.setEstado(estado);
        System.out.println("Estado actualizado: " + tarea);
    }

    public void reporteEstadoProyecto() {
        System.out.println("Reporte del estado del Proyecto: " + proyecto.getNombre());
        List<Tarea> tareas = proyecto.obtenerTareas();
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public void estimarTiempoTotal() {
        long totalDias = 0;
        for (Tarea tarea : proyecto.obtenerTareas()) {
            totalDias += java.time.temporal.ChronoUnit.DAYS.between(tarea.getFechaInicio(), tarea.getFechaEstimada());
        }
        System.out.println("Tiempo estimado total para el proyecto: " + totalDias + " días.");
    }
}
