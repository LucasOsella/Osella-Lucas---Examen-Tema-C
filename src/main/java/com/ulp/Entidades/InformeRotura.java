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
public class InformeRotura {
    private int codInf;
    private LocalDate fechaInforme;
    private String problema;
    private int codigoUrgencia;
    private Bache bache;
    private Ciudadano ciudadano;
    private PedidoObra pedidoReparacion;

    public InformeRotura(int codInf, String problema, int urgencia, Bache bache, Ciudadano ciudadano) {
        this.codInf = codInf;
        this.fechaInforme = LocalDate.now();
        this.problema = problema;
        this.codigoUrgencia = urgencia;
        this.bache = bache;
        this.ciudadano = ciudadano;
        this.pedidoReparacion = null;
    }
    public Bache getBache() { return bache; }
    public Ciudadano getCiudadano() { return ciudadano; }
    public PedidoObra getPedidoReparacion() { return pedidoReparacion; }
    public void setPedidoReparacion(PedidoObra pedido) { this.pedidoReparacion = pedido; }
    
}
