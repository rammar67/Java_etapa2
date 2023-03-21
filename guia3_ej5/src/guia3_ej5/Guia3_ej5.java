/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
 */
package guia3_ej5;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Guia3_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Ingrese el numero limite");
         int numero = input.nextInt(); 
         int suma = 0;
          
          do{
             
             System.out.println("Ingrese un numero para sumar");
             int num = input.nextInt();
             suma = suma + num;
              
          }while(suma <numero);
    }
    
}
