
package edu.uttt.programasciclos;


public class Serie {
    private int n;
    
    public Serie (){
        this.n=1;
    }
    public Serie (int n){
        //this.n=(n>0)?n:1;
        
        if (n>0) {
            this.n=0;
        }
        else{
           this.n=1;
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
          if (n>0) {
            this.n=0;
        }
        else{
           this.n=1;
        }
    }
      
    
}
