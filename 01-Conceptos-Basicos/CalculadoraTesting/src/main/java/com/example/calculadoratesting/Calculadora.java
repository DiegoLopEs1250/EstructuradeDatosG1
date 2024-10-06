/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.calculadoratesting;

public class Calculadora {
    /*public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }*/
    
    public int suma(int n){
        if (n%2==0) {
            return n;
        }else{
           return n+ suma(n-1);
        }
    }
    
    public static void main(String[] args) {
       Calculadora obj1 = new Calculadora();
       
       int valor = obj1.suma(27);
       
        System.out.println(" es: " + valor);
    }
}
