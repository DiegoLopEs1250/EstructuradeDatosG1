package edu.mx.uttt.iterativo_recursivo;

public class Fibinacci {
    private int n;

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = (n>=0)?n:0;
    }
    //Metodo recursivo de Fibonacci
    public int fib(int n){
        //caso base
        if (n<=1){
            return  1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    @Override
    public String toString() {
        return "Fibinacci{" +
                "n=" + n +
                '}';
    }
}