package edu.mx.uttt.recursividad;

public class Test {
    public static void main(String[] args) {
        Potencias pot = new Potencias();
        pot.setExpo(3);

        int expo = pot.getExpo();
        int resultado= pot.potencia(expo);
        System.out.println(resultado);
        
    }
}
