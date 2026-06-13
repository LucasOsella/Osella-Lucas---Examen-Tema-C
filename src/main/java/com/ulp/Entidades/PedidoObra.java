/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class PedidoObra {
    private int numero;
    private Interseccion ubicacion;
    private String tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private String observaciones;
    private BrigadaReparacion brigada;
    private InformeRotura informe;

    public PedidoObra(int numero, InformeRotura informe) {
        this.numero = numero;
        this.informe = informe;
        this.ubicacion = informe.getBache().getPosicionExacta();
        this.tamaño = informe.getBache().getTamaño();
        this.fechaCreacion = LocalDate.now();
        this.fechaReparacion = null;
    }

    public void asignarBrigada(BrigadaReparacion brigada) {
        this.brigada = brigada;
    }

    public void finalizarReparacion(LocalDate fecha, String observaciones) {
        this.fechaReparacion = fecha;
        this.observaciones = observaciones;
        this.informe.getBache().setEstado("reparado");
        if(this.brigada != null) {
            this.brigada.liberarBrigada();
        }
    }
    public BrigadaReparacion getBrigada() { return brigada; }
    
}
