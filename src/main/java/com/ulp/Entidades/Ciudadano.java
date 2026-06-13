/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp.Entidades;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Lucas
 */
public class Ciudadano {
    private String nombre;
    private int contrasenia;
    private String email;

    public Ciudadano() {}

    public Ciudadano(String nombre, int contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public int getContrasenia() { return contrasenia; }
    
    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public boolean validarPassword(int psw) {
        return this.contrasenia == psw;
    }

    public void cambioPassword(String newPass) {
        try {
            this.contrasenia = Integer.parseInt(newPass);
        } catch (NumberFormatException e) {
            System.out.println("Error: La contraseña debe ser numérica");
        }
    }

    public void delay(int mili) throws InterruptedException {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
            throw e; 
        }
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        return !this.equals(c2);
    }

    public static boolean ValidarMail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    
}
