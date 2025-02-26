/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.proyectofinal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Proyecto {
    
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre, List<Tarea> tareas) {
        this.nombre = nombre;
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    
     // Método obtenerTareas() para acceder a la lista de tareas
    public List<Tarea> obtenerTareas() {
        return tareas;
    }

    // Método agregarTarea() para añadir tareas al proyecto
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", tareas=" + tareas + '}';
    }
    
    
}
