package edu.mx.uttt.vectores;

public class VectoresEnteros {
    private int [] v1;
    private int [] v2;
    private int tam;

    //Configurations el constructor
    public VectoresEnteros(int tam){
        if (tam>0){
            this.tam= tam;
            v1=new int [this.tam];
            v2=new int [this.tam];
        }else {
            this.tam=1;
            v1 = new int [this.tam];
            v2 = new int [this.tam];
        }
    }

    //Configuration getter and setter
    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        if (v1.length==tam){
            for (int i = 0; i < this.v1.length; i++) {
                this.v1[i]= v1[i];
            }
        }
    }

    public int[] getV2() {
        return v2;
    }

    public void setV2(int[] v2) {
        if (v2.length==tam){
            for (int i = 0; i < this.v2.length; i++) {
                this.v2[i]= v2[i];
            }
        }
    }

    public int getTam() {
        return tam;
    }

    //Construction de los me-todos

    public int []sumar (){
        int [] res = new int [tam];
        for (int i = 0; i < res.length; i++) {
            res[i] = v1[i]+v2[i];
        }
        return res;
    }

    public int calcularEscalar(){
        int acum =0;
        for (int i = 0; i <this.tam ; i++) {
            acum+= this.v1[i] * this.v2[i];
        }
        return acum;
    }
}
