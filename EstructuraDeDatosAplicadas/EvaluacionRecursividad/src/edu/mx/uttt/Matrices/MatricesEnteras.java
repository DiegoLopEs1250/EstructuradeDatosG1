package edu.mx.uttt.Matrices;

public class MatricesEnteras {
    private int [][] mat1;
    private int tam;

    
    public MatricesEnteras(int tam){
        if (tam>0) {
            this.tam = tam;
            this.mat1 = new int [tam][tam];
        }else {
            this.tam = 2;
            this.mat1 = new int [tam][tam];
        }
    }
}
