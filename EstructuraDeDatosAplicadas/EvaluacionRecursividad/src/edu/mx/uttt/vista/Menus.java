package edu.mx.uttt.vista;

import edu.mx.uttt.recursividad.Potencias;

import javax.swing.*;

public class Menus {
    public static void main(String[] args) {
        Ejecutar();
    }

    public static String Menu(){
        String menu = "Menu Principal\n" +
                "1.- Imprimir Interativo\n" +
                "2.- Imprimir Recursivo\n" +
                "3.- Salir" +
                "Elegir Opción: ";
        return JOptionPane.showInputDialog(menu);
    }

    public static void Ejecutar(){
        String opcion;
        boolean sentinel = true;
        int n = 0;
        Potencias ope1 = new Potencias();

        do {

            opcion = Menu();
            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces"));
                    ope1.setExpo(n);
                   // ope1.Imprimir();
                    sentinel = false;
                    break;
            }
        } while (sentinel);
    }
}
