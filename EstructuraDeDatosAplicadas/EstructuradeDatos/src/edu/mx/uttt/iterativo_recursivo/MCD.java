package edu.mx.uttt.iterativo_recursivo;

public class MCD {
    private double divisor;
    private double dividendo;

    public MCD() {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = (divisor);
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = (dividendo >0)?dividendo:1;
    }

    public double fun(double dividendo, double divisor){
        if (divisor ==0){
            return 0;
        }
        else
        {
           return fun(dividendo, dividendo % divisor);
        }
    }

    public static void main(String[] args) {

        double a = 150.0;
        double b = 120.0;


    }
}
