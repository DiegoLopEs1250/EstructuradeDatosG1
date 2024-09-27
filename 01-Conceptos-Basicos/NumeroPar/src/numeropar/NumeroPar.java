
package numeropar;
import java.util.Scanner;
public class NumeroPar {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        if (num %2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero no es par");
        }
    }
}
    

