/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;

/**
 *
 * @author Lucas
 */
public class Trabajador {
    private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = true;
    }
    public void setLibre(boolean libre) { this.libre = libre; }
    
}
