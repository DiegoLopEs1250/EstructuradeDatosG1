package edu.mx.uttt.recursividad;
import javax.swing.JOptionPane;
public class PeruebaOperaciones {
  public static void main(String[] args) {
    Ejecutar();
  }

  public static String Menu(){
    String menu = "Menu Principal\n" + 
                   "1.- Imprimir Interativo\n" + 
                   "2.- Imprimir Recursivo\n" + 
                   "3.- Salir" + 
                   "Elegir Opción: ";
    return JOptionPane.showInputDialog(menu);
  }

  public static void Ejecutar(){
    String opcion;
    boolean sentinel = true;
    int n = 0;
    Operaciones ope1 = new Operaciones();

    do {

        opcion = Menu();
        switch (opcion) {
            case "1":
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces"));
              ope1.setN(n);
              ope1.Imprimir();
            sentinel = false;
                break;

            case "2":
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces"));
            ope1.setN(n);
            ope1.Imprimir(ope1.getN());
            sentinel = false;
                break;

            case "3":
              JOptionPane.showMessageDialog(null, "I'll be back");
              sentinel = false;
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opcion no valida");
            sentinel = false;
                break;
        }
    } while (sentinel);
  }
}
