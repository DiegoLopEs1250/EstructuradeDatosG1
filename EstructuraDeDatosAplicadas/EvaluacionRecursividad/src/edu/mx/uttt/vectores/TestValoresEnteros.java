package edu.mx.uttt.vectores;

import javax.swing.*;

public class TestValoresEnteros {
    public static void main(String[] args){
        int []arr1 = {1,2,3};
        int []arr2  = {4,5,6};

        VectoresEnteros obj1 = new VectoresEnteros(3);
        obj1.setV1(arr1);
        obj1.setV2(arr2);
        System.out.println("Vector 1: " + imprimir(obj1.getV1()) + " \n" +
                           "Vector 2: " + imprimir(obj1.getV2()) + "\n" +
                           "Resultado: " + obj1.calcularEscalar());
    }

    public static String imprimir(int [] vector){
        String cadena = "[";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + ",";
        }
        cadena += "]";
        return   cadena;
    }
}
