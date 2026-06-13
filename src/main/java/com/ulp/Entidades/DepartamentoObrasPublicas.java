/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Lucas
 */
public class DepartamentoObrasPublicas {
    private List<InformeRotura> informes = new ArrayList<>();
    private List<Bache> baches = new ArrayList<>();
    private List<PedidoObra> pedidos = new ArrayList<>();

    public List<InformeRotura> informesporCiudadano(Ciudadano c) {
        return informes.stream().filter(i -> i.getCiudadano().equals(c)).collect(Collectors.toList());
    }
    public List<InformeRotura> informesSinPedidos() {
        return informes.stream().filter(i -> i.getPedidoReparacion() == null).collect(Collectors.toList());
    }
    public List<PedidoObra> pedidosPorBrigada(BrigadaReparacion b) {
        return pedidos.stream().filter(p -> p.getBrigada().equals(b)).collect(Collectors.toList());
    }
    public List<Bache> bachesSinReparar() {
        return baches.stream().filter(b -> b.getEstado().equals("sin reparar")).collect(Collectors.toList());
    }
    public List<Trabajador> trabajadoresPorBrigada(BrigadaReparacion b) {
        return b.getTrabajadores();
    }
    
}
