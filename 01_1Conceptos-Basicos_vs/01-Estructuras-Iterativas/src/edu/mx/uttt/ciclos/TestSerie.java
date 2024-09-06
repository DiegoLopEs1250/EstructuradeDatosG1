package edu.mx.uttt.ciclos;


import javax.swing.JOptionPane;

public class TestSerie {
public static void main(String[] args) {

    String resultado = "";
    Serie serie1 = new Serie();
    Serie serie2 = new Serie(3);

    resultado = "El resultado es: \n"+
                "El valor de n es: "+ serie1.getN()+
                "\nEl resultado de la serie utilizando for es: " + serie1.CalcularFor()+
                "\nEl resultado de la serie utilizando while es: " + serie1.CalcularWhile()+
                "\nEl resultado de la serie utilizando for es: " + serie1.CalcularDoWhile()+
                "\nEl resultado con formato: " + serie1.toString() + " = " + serie1.CalcularFor();
    JOptionPane.showMessageDialog(null, resultado);
                
    // int n = serie1.getN();
    // System.out.println("El valor de n es: "+ n);
    // System.out.println(serie1);

    // System.out.println("El valor de n es: " + serie2.getN());
    // System.out.println(serie2);

    // serie1.setN(-4);
    // System.out.println("El valor de n es: "+ serie1.getN());

    // serie2.setN(10);
    // System.out.println("El valor de n es: " + serie2.getN());


}
}
