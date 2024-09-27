package com.example.NumeroParTesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.NumeroParTesting.VerificadorParTest;
import com.example.numeropartesting.VerificadorPar;

public class VerificadorParTest {

    @Test
    public void testEsPar() {
        VerificadorPar verificador = new VerificadorPar();
        
        // Casos positivos (números pares)
        assertTrue(verificador.esPar(4), "4 debería ser par");
        assertTrue(verificador.esPar(-2), "-2 debería ser par");
        assertTrue(verificador.esPar(0), "0 debería ser par");
        assertTrue(verificador.esPar(20), "20 debería ser par");
        assertTrue(verificador.esPar(48), "48 debería ser par");

        // Casos negativos (números impares)
        assertFalse(verificador.esPar(3), "3 no debería ser par");
        assertFalse(verificador.esPar(-5), "-5 no debería ser par");
    }
}