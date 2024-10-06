
package com.example.NumeroParTesting;


public class SumaNumerosEnteros {
    public int suma(int n){
        if (n==1) {
            return n;
        }else{
           return n+ suma(n-1);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
