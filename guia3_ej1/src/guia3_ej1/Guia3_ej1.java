/*
 * Crear un programa que dado un número determine si es par o impar
 */
package guia3_ej1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Guia3_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int num = input.nextInt();
         
         
         if(num == 0){
             System.out.println("El numero ingresado es par");
         }else if(num % 2 == 0){
             System.out.println("El numero es par");
         }else {
             System.out.println("El numero es impar");
         }
    }
}
