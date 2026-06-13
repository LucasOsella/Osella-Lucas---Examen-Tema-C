/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;
import com.ulp.Entidades.Ciudadano;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
/**
 *
 * @author Lucas
 */
public class ciudadanoTest {
    
    static Ciudadano ciu;
    private static int numTest = 1;

   
    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Ciudadano("Anonimus", 1212);
        System.out.println("INGRESO de ciudadano del bien");
    }

    
    @AfterClass
    public static void despuesDeTodo() {
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        System.out.println(fechaAyer + " Baches reparados, Ciudadanos Felices");
    }

    
    @Before
    public void beforeTest() {
        System.out.println("-------------------------------------------------");
        System.out.println("Iniciando Test número: " + numTest++);
    }

    @After
    public void afterTest() {
        System.out.println("Fin del test.");
        System.out.println("-------------------------------------------------");
    }

   
    @Test
    public void testValidarUsr() {
        // ciu tiene 1212, le pasamos 123456. Retorna false. AssertTrue falla.
        assertTrue("Se esperaba que fallara la validación de usuario", ciu.validarPassword(123456));
    }

    
    @Test
    public void testValidarEmail() {
        String email = "abcde@domain.com"; // Cumple @, . y < 20 char
        boolean tieneArroba = email.contains("@");
        boolean tienePunto = email.contains(".");
        boolean longitudValida = email.length() < 20;
        
        assertTrue("El email debe ser válido", tieneArroba && tienePunto && longitudValida);
    }

    
    @Test
    public void TestCambioPass() {
        ciu.cambioPassword("1234");
        assertEquals("La contraseña no se actualizó correctamente", 1234, ciu.getContrasenia());
        System.out.println("Cambio de contraseña exitoso a: " + ciu.getContrasenia());
    }


    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
      
        ciu.delay(45);
    }

 
    @Test
    public void testCiudadanosDiferentes() {
        Ciudadano c1 = new Ciudadano("Juan", 111);
        Ciudadano c2 = new Ciudadano("Pedro", 222);
        
        assertTrue(c1.ciudadanosDiferentes(c2));
        assertNotSame("misma persona", c1, c2);
    }
    
    
}
