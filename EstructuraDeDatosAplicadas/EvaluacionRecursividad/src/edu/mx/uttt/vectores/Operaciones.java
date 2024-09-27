package edu.mx.uttt.vectores;

public class Operaciones {
    private int [] arr;
    private int tam;

    public Operaciones(int tama){
        this.setTam(tam);
        arr = new int[this.tam];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        if (tam>0){
            this.tam=tam;
        }else {
            this.tam=1;
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.arr[i]= arr[i];
        }
        this.arr = arr;
    }
    public void imprimir(){
        int i =0;
        while(i<arr.length){
            System.out.println(arr[0]);
            i++;
        }
    }
}
