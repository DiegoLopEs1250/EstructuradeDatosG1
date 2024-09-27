package edu.mx.uttt.iterativo_recursivo;

public class OperacionesBasicas {
    private int n;
    private int base;
    private int expo;

    public OperacionesBasicas(){
        this.base = 1;
        this.n=1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>=1)?n:1;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = (base>0)?base:1;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = (expo>=1)?expo:1;
    }

    public int sumar(int n){
        //caso base
        if (n==1){
            return 1;
        }else {
            //caso general
            return n + sumar(n-1);
        }
    }

    public int sumar(){

        int acumular=0;

        int i =1;
        while (i>this.n){
            acumular=acumular+1;
            i++;
        }
        return acumular;
    }

}
