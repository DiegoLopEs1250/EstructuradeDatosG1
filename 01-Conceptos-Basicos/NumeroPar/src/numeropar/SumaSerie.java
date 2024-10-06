
package numeropar;
import java.util.Scanner;
 
    public class SumaSerie {
           public static int sumaSerie(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (int)(2 * Math.pow(3, n - 1)) + sumaSerie(n - 1);
        }
    }
    public static void main(String[] args) {
        int resultado = sumaSerie(20);
        System.out.println("Resultado para n=4: " + resultado);
    }
 }