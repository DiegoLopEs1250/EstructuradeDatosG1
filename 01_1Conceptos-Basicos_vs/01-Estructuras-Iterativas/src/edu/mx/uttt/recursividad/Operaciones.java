package edu.mx.uttt.recursividad;

public class Operaciones {
    private int n;

    public Operaciones() {
        this.n = 1;
    }
    //Metodos getter and setter
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    // Metodo iterativo

    public void Imprimir() {
        int i = 1;
        do {
            System.out.println("Hola Mundo");
            i++;
        } while (i <= this.n);
    }

    public void Imprimir(int n) {
        if (n == 1) {
            System.out.println("Hola Mundo");
        } else {
            System.out.println("Hola Mundo");
            Imprimir(n - 1);
        }
    }

}
