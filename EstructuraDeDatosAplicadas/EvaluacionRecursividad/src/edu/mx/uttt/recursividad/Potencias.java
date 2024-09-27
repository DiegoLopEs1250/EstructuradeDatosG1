package edu.mx.uttt.recursividad;

public class Potencias {
     private int expo;
     private int base;

    public Potencias(){
        this.base=1;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
//        this.expo = (expo>=0)?expo:1;
        if(expo>=0)
            this.expo=expo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base>=0)
            this.base=base;
    }

    public int potencia(int expo){

        if (expo==0){
            return  1;
        }else {
            //Caso general
            return  2 *potencia(expo - 1);
        }
    }































    public int potencia(int base, int expo){
        if(expo==0){
            return 1;
        }else {
            return base * potencia(base,expo-1);
        }
    }
}
