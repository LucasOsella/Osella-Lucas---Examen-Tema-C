/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;

/**
 *
 * @author Lucas
 */
public class Bache {
    private int id;
    private Interseccion posicionExacta;
    private String tamaño;
    private String barrio;
    private int urgencia; // 1 a 5
    private String estado;

    public Bache(int id, Interseccion posicion, String tamaño, String barrio, int urgencia) {
        this.id = id;
        this.posicionExacta = posicion;
        this.tamaño = tamaño;
        this.barrio = barrio;
        this.urgencia = urgencia;
        this.estado = "sin reparar";
    }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTamaño() { return tamaño; }
    public Interseccion getPosicionExacta() { return posicionExacta; }
       
}
