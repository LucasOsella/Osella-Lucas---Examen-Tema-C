/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class BrigadaReparacion {
    private int numero;
    private String nombre;
    private int cantidadTrabajadores;
    private String equipamiento;
    private String materiales;
    private LocalDate fechaFinalObra;
    private Trabajador jefe;
    private List<Trabajador> trabajadores;

    public BrigadaReparacion(int numero, String nombre, String equipamiento, String materiales) {
        this.numero = numero;
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.trabajadores = new ArrayList<>();
        this.cantidadTrabajadores = 4; // 3 comunes + 1 jefe
    }

    public void conformarBrigada(Trabajador jefe, List<Trabajador> equipo) {
        this.jefe = jefe;
        this.jefe.setLibre(false);
        for(Trabajador t : equipo) {
            this.trabajadores.add(t);
            t.setLibre(false);
        }
    }
    public void liberarBrigada() {
        this.jefe.setLibre(true);
        for(Trabajador t : trabajadores) { t.setLibre(true); }
    }
    public List<Trabajador> getTrabajadores() { return trabajadores; }
    public void setFechaFinalObra(LocalDate fecha) { this.fechaFinalObra = fecha; }
    
}
