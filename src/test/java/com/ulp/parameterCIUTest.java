/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;
import com.ulp.Entidades.Ciudadano;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

/**
 *
 * @author Lucas
 */
  @RunWith(Parameterized.class)
public class parameterCIUTest {

    private String emailInput;
    private boolean expectedResult;

   
    public parameterCIUTest(String emailInput, boolean expectedResult) {
        this.emailInput = emailInput;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {"jorgesys@tototita.com", true},
            {"jorgesys@tototitacom", false},
            {"jorgesystototita.com", false},
            {"@jorgesystototita.com", false},
            {".jorgesystototita@com", false}
        });
    }

    @Test
    public void testValidarEmail() {
        // Se utiliza el método estático de validación con Regex implementado en Ciudadano
        boolean result = Ciudadano.ValidarMail(emailInput);
        assertEquals("Fallo en la validación del correo: " + emailInput, expectedResult, result);
    }
    
}
