package edu.mx.uttt.ciclos;

public class Factorial {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public Factorial(){
        this.n=1;
    }

    public long OperacionFor(){
        long fac = 1;

        for (int i = 0; i < this.n; i++) {
            fac*=i;
        }

        return 0;
    }

    public long OperacionForReverse(){
        long fac = 1;

        for (int i = this.n; i>=1; i--) {
            fac*=i;
        }

        return fac;
    }

    public int OperacionWhile(){
        int acum = 0;
        
        return 0;
    }

    public int OperacionDoWhile(){
        int acum = 0;
        return 0;
    }
}
