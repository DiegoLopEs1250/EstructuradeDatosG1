package com.example.calculadoratesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();
/*
    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(1, 0));
    }
*/
    @Test
    public void testSumaRecursiva(){
        assertEquals(55, calculadora.suma(10));
    }
}