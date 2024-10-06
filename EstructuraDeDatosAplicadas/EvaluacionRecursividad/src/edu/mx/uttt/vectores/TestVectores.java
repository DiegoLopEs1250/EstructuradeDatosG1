package edu.mx.uttt.vectores;
import javax.swing.JOptionPane;

public class TestVectores {
    public static void main(String[] args) {
        //Declaracion de vectores
//        int [] edades = new int [3];
//
//        double [] estaturas = new double[5];
//
//        String [] nombre;
//        nombre = new String[4];
//
//        Automovil automoviles [] = new Automovil[4];
//
//        try {
//            System.out.println(edades[2]);
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("Ya lo tronaste chavo" + ex.getMessage());
//        }
//        edades[0]=20;
//        edades[1]=3;
//        edades[2]=90;
//
//        System.out.println(edades[2]);
//        System.out.println(imprimir1(edades));
//        llenarEstatura(estaturas);
//        System.out.println(imprimir2(estaturas));
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector"));
       Operaciones ope = new Operaciones(tam);

       llenarArreglo(ope.getArr());
       ope.imprimir();

       int res = ope.sumar();
        System.out.println("La suma de los valores es: " + res);
        int par = ope.sumarPar();
        System.out.println("Los numeros primos son: "+ par);
    }

    public static void llenarArreglo(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del arreglo [ " + (i+1) + " ]"));
        }
    }
}
